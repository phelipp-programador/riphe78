package br.com.phddigital.riphe78.data;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.domain.Promocao;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DestaqueResources {


    @GET("destaque")
    public Call<List<Item>> select();
    @GET("destaque/{value}")
    public Call<List<Item>> select(@Path("value")String  value );

}
