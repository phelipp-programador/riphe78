package br.com.phddigital.riphe78.ui.pesquisa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.ui.home.HomeContract;
import br.com.phddigital.riphe78.ui.home.HomePresenter;
import br.com.phddigital.riphe78.util.RecycleUtil;

public class PesquisaActivity extends AppCompatActivity implements PesquisaContract.ViewImple {

    private RecyclerView rvConteudo;
    private Button btnOk;
    private EditText edtSearch;
    private ImageView imgNotFound;
    private PesquisaContract.Presenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        presenter = new PesquisaPresenter(this);
        initializer();

        imgNotFound.setVisibility(View.INVISIBLE);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.listarItem(edtSearch.getText().toString());
            }
        });
    }


    @Override
    public void initializer() {
        View rootView = getWindow().getDecorView().getRootView();
        rvConteudo = RecycleUtil.preparedRecycleView(rootView, R.id.rv_conteudo, this);
        imgNotFound = findViewById(R.id.img_notfound);
        View search = findViewById(R.id.search);
        btnOk = (Button) search.findViewById(R.id.btn_ok);
        edtSearch = search.findViewById(R.id.edt_search);
    }

    @Override
    public void visualisarPesquisa(ItemAdapter adapter) {
        if (imgNotFound.getVisibility() == View.VISIBLE) {
            imgNotFound.setVisibility(View.INVISIBLE);
        }
        rvConteudo.setVisibility(View.VISIBLE);
        rvConteudo.setAdapter(adapter);
    }

    @Override
    public void notFound() {
        rvConteudo.setVisibility(View.INVISIBLE);
        imgNotFound.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.viewDestroy();
    }
}
