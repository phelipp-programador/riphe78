package br.com.phddigital.riphe78.ui.home;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.util.RecycleUtil;

public class HomeActivity extends AppCompatActivity implements HomeContract.ViewImple {
    private View viewCategorias;
    private View viewPromocoes;
    private View viewDestaques;
    private RecyclerView rvCategoria;
    private RecyclerView rvPromocao;
    private RecyclerView rvDestaque;
    private HomePresenter presenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initializer();

    }


    @Override
    public void visualizarCategoria(CategoriaAdapter categorias) {
    rvCategoria.setAdapter(categorias);
    }

    @Override
    public void visualizarPromocoes(ItemAdapter promocoes) {
        rvPromocao.setAdapter(promocoes);
    }

    @Override
    public void visualizarDestaques(ItemAdapter destaques) {
        rvDestaque.setAdapter(destaques);
    }

    @Override
    public void initializer() {
        presenter = new HomePresenter(this);
        this.viewPromocoes = findViewById(R.id.promocao);
        this.viewCategorias = findViewById(R.id.categoria);
        this.viewDestaques = findViewById(R.id.item);
        this.rvPromocao = RecycleUtil.preparedRecycleView(viewPromocoes,R.id.rv_conteudo,this);
        this.rvCategoria = RecycleUtil.preparedRecycleView(viewCategorias,R.id.rv_conteudo,this);
        this.rvDestaque = RecycleUtil.preparedRecycleView(viewDestaques,R.id.rv_conteudo,this);
        ((TextView) this.viewPromocoes.findViewById(R.id.txt_title)).setText(getBaseContext().getString(R.string.title_card_promocao));
        ((TextView) this.viewCategorias.findViewById(R.id.txt_title)).setText(getBaseContext().getString(R.string.title_card_categoria));
        ((TextView) this.viewDestaques.findViewById(R.id.txt_title)).setText(getBaseContext().getString(R.string.title_card_destaque));
        presenter.listarCategoria();
        presenter.listarDestaques();
        presenter.listarPromocoes();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.viewDestroy();
    }
}
