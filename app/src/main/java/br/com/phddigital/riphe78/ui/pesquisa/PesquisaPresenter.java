package br.com.phddigital.riphe78.ui.pesquisa;

import java.util.List;

import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.service.CategoriaService;
import br.com.phddigital.riphe78.service.DestaqueService;
import br.com.phddigital.riphe78.service.PesquisaService;
import br.com.phddigital.riphe78.service.PromocoesService;
import br.com.phddigital.riphe78.ui.home.HomeContract;

public class PesquisaPresenter implements PesquisaContract.Presenter {

    private PesquisaService pesquisaService;
    private  PesquisaContract.ViewImple view;

    public PesquisaPresenter(PesquisaContract.ViewImple view) {
        pesquisaService = new PesquisaService();
        this.view = view;
    }



    @Override
    public void viewDestroy() {
        view = null;
    }

    @Override
    public void listarItem() {
        pesquisaService.select();
    }
}
