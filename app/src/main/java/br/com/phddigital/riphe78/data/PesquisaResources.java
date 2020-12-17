package br.com.phddigital.riphe78.data;

import java.util.List;

import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.domain.ResultPesquisa;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PesquisaResources {


    @GET("search/{value}")
    public Call<List<ResultPesquisa>> select(@Path("value")String  value );

}
