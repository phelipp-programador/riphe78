package br.com.phddigital.riphe78.ui.pesquisa;

import android.view.View;
import android.widget.EditText;

import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.mvp.MVP;

public interface PesquisaContract {
   interface ViewImple{
        void initializer();
        void visualisarPesquisa(ItemAdapter adapter);
        void notFound();
   }
   interface Presenter extends MVP.Presenter {
       void listarItem(String text);
   }
}
