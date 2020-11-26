package br.com.phddigital.riphe78.ui.home;

import java.util.List;

import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.adapter.LojaAdapter;
import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.domain.Loja;
import br.com.phddigital.riphe78.mvp.MVP;

public interface HomeContract {
   interface ViewImple{
       void visualizarCategoria(CategoriaAdapter categorias);
       void visualizarPromocoes(ItemAdapter promocoes);
       void visualizarDestaques(ItemAdapter destaques);
        void initializer();
   }
   interface Presenter extends MVP.Presenter {
       void listarPromocoes();
       void listarDestaques();
       void listarCategoria();
   }
}
