package br.com.phddigital.riphe78.ui.home;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.service.CategoriaService;
import br.com.phddigital.riphe78.service.DestaqueService;
import br.com.phddigital.riphe78.service.PromocoesService;
import br.com.phddigital.riphe78.service.Service;

public class HomePresenter implements HomeContract.Presenter {

    private final Service categoriaService;
    private final Service promocaosService;
    private final Service destaqueService;
    private  HomeContract.ViewImple view;



    public HomePresenter(@NonNull HomeContract.ViewImple view) {
        this.categoriaService = new CategoriaService();
        this.promocaosService = new PromocoesService();
        this.destaqueService = new DestaqueService();
        this.view = view;
    }

    @Override
    public void listarPromocoes() {

        Optional<List<Item>> promocoes = promocaosService.select();
        if(promocoes.isPresent()) {
            ItemAdapter itemAdapter = new ItemAdapter(promocoes.get());
            view.visualizarPromocoes(itemAdapter);
        }
    }

    @Override
    public void listarDestaques() {
        Optional<List<Item>> destaque = destaqueService.select();
        if(destaque.isPresent()) {
            ItemAdapter itemAdapter = new ItemAdapter(destaque.get());
            view.visualizarDestaques(itemAdapter);
        }
    }

    @Override
    public void listarCategoria() {
        Optional<List<Categoria>> categorias = categoriaService.select();
        if(categorias.isPresent()){
            CategoriaAdapter categoriaAdapter = new CategoriaAdapter(categorias.get());
            view.visualizarCategoria(categoriaAdapter);
        }
    }

    @Override
    public void viewDestroy() {
        view = null;
    }
}
