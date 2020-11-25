package br.com.phddigital.riphe78.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beardedhen.androidbootstrap.TypefaceProvider;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.adapter.CategoriaAdapter;
import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.util.RecycleUtil;

public class LoginActivity extends AppCompatActivity implements LoginContract.ViewImple {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TypefaceProvider.registerDefaultIconSets();
        initializer();
    }



    @Override
    public void initializer() {
    }


}
