package br.com.phddigital.riphe78.data;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Item;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ItemResources {


    @GET("item")
    public Call<List<Item>> select();
    @GET("item/{value}")
    public Call<List<Item>> select(@Path("value")String  value );
   
}
