package br.com.phddigital.riphe78.ui.config;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import br.com.phddigital.riphe78.R;

public class ConfigActivity extends AppCompatActivity implements ConfigContract.ViewImple {

    private RecyclerView rvItem;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        initializer();
    }



       @Override
    public void initializer() {


    }



}
