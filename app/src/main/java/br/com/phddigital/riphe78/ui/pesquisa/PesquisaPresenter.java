package br.com.phddigital.riphe78.ui.pesquisa;

import android.util.Log;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import br.com.phddigital.riphe78.adapter.ItemAdapter;
import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.ItemResources;
import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.service.ItemService;
import br.com.phddigital.riphe78.service.PesquisaService;
import br.com.phddigital.riphe78.service.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PesquisaPresenter implements PesquisaContract.Presenter {

    private PesquisaService service ;
    private ItemResources resource;
    private  PesquisaContract.ViewImple view;

    public PesquisaPresenter(PesquisaContract.ViewImple view) {
        this.view = view;
        service = new PesquisaService(view);
        resource = RetrofitConfig.factory().create(ItemResources.class);

    }



    @Override
    public void viewDestroy() {
        view = null;
    }


    @Override
    public void listarItem(String text) {

        Call<List<Item>> select = resource.select();
        StringBuffer b = new StringBuffer();

        select.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                List<Item> collect = response.body().stream().filter(item -> item.getNome().contains(text)

                    ).collect(Collectors.toList());
                if(collect.size()>0){
                    ItemAdapter itemAdapter = new ItemAdapter(collect);
                    view.visualisarPesquisa(itemAdapter);
                }
                else{
                    view.notFound();
                }

            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Log.i("Retrofit","erro "+ t.getMessage());
                view.notFound();
            }
        });


    }
}
