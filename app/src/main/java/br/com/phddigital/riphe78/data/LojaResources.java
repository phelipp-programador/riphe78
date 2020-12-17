package br.com.phddigital.riphe78.data;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.domain.Loja;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface LojaResources {


    @GET("loja")
    public Call<List<Loja>> select();
    @GET("loja/{value}")
    public Call<List<Loja>> select(@Path("value") String value);


}
