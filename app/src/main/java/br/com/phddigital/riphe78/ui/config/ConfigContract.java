package br.com.phddigital.riphe78.ui.config;

import br.com.phddigital.riphe78.mvp.MVP;

public interface ConfigContract {
   interface ViewImple{
        void initializer();
   }
   interface Presenter extends MVP.Presenter {
       void listarPromocoes();
       void listarProdutos();
   }
}
