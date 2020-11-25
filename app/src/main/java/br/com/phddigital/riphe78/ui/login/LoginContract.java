package br.com.phddigital.riphe78.ui.login;

import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.mvp.MVP;

public interface LoginContract {
   interface ViewImple{

        void initializer();
   }
   interface Presenter extends MVP.Presenter {

   }
}
