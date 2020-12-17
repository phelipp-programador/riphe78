package br.com.phddigital.riphe78.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.CategoriaResources;
import br.com.phddigital.riphe78.domain.Categoria;
import retrofit2.Call;
import retrofit2.Response;

public class CategoriaService implements Service<Categoria> {
    private final CategoriaResources resources;

    public CategoriaService() {
        this(RetrofitConfig.factory().create(CategoriaResources.class));
    }

    public CategoriaService(CategoriaResources resources) {
        this.resources = resources;
    }

    @Override
    public  Optional<List<Categoria>> select()  {
        Call<List<Categoria>> call = resources.select();
        try {
            Response<List<Categoria>> response = call.execute();
            List<Categoria> body = response.body();
            if(body.size()>0){
                return Optional.of(body);
            }
            else {  return Optional.empty();}
        } catch (IOException e) {
            return Optional.empty();
        }


    }

    @Override
    public Optional<List<Categoria>> select(String value) {
        return Optional.empty();
    }
}
