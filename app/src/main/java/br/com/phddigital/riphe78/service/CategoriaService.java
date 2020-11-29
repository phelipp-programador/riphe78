package br.com.phddigital.riphe78.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.CategoriaResources;
import br.com.phddigital.riphe78.domain.Categoria;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriaService implements  ServiceDao<Categoria> {
    private CategoriaResources resources;


    public CategoriaService() {
//        RetrofitConfig retrofitConfig = new RetrofitConfig();
  //     resources = retrofitConfig.getRetrofit().create(CategoriaResources.class);
    }



    @Override
    public Optional<Categoria> save(Categoria entity) {
        final Optional<Categoria>[] aux = new Optional[1];
        Call<Categoria> call = resources.save(entity);
        call.enqueue(new Callback<Categoria>() {
            @Override
            public void onResponse(Call<Categoria> call, Response<Categoria> response) {
                aux[0] = Optional.of(response.body());
            }

            @Override
            public void onFailure(Call<Categoria> call, Throwable t) {
                aux[0] = Optional.empty();
            }
        });
        return aux[0];

    }

    @Override
    public Optional<Categoria> update(Integer id, Categoria newEntity) {
        final Optional<Categoria>[] aux = new Optional[1];
        Call<Categoria> call = resources.update(id,newEntity);
        call.enqueue(new Callback<Categoria>() {
            @Override
            public void onResponse(Call<Categoria> call, Response<Categoria> response) {
                aux[0] = Optional.of(response.body());
            }

            @Override
            public void onFailure(Call<Categoria> call, Throwable t) {
                aux[0] = Optional.empty();
            }
        });
        return aux[0];
    }

    @Override
    public Optional<List<Categoria>> select() {
         final  Optional<List<Categoria>>[] aux= new Optional[1];
        Call<Optional<List<Categoria>>> categorias = resources.select();

        categorias.enqueue(new Callback<Optional<List<Categoria>>>() {
            @Override
            public void onResponse(Call<Optional<List<Categoria>>> call, Response<Optional<List<Categoria>>> response) {
                List<Categoria> list = new ArrayList<>();
                aux[0] = Optional.of(list);
            }

            @Override
            public void onFailure(Call<Optional<List<Categoria>>> call, Throwable t) {
                aux[0] = Optional.empty();
            }
        });
        return aux[0];
    }


    @Override
    public Optional<Categoria> select(Integer id) {
        return null;
    }

    @Override
    public Optional<Boolean> delete(Integer id) {
        final Optional<Boolean>[] aux = new Optional[1];
        Call<Boolean> call = resources.delete(id);
        call.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                aux[0] = Optional.of(true);
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                aux[0] = Optional.of(false);
            }
        });
        return aux[0];
    }
}
