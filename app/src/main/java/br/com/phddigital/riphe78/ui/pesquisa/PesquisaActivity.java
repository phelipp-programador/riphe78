package br.com.phddigital.riphe78.ui.pesquisa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.util.RecycleUtil;

public class PesquisaActivity extends AppCompatActivity implements PesquisaContract.ViewImple {

    private RecyclerView rvConteudo;
    private Button btnOk;
    private EditText edtSearch;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initializer();
    }


    @Override
    public void initializer() {

        View rootView = getWindow().getDecorView().getRootView();
        rvConteudo = RecycleUtil.preparedRecycleView(rootView, R.id.rv_conteudo, this);
        View search = findViewById(R.id.search);
        btnOk = (Button) search.findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void visualisarPesquisa(ItemAdapter adapter) {
        rvConteudo.setAdapter(adapter);
    }


}
