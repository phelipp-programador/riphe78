package br.com.phddigital.riphe78.ui.pesquisa;

import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.mvp.MVP;

public interface PesquisaContract {
   interface ViewImple{
        void initializer();
        void visualisarPesquisa(ItemAdapter adapter);
   }
   interface Presenter extends MVP.Presenter {
       void listarItem();
   }
}
