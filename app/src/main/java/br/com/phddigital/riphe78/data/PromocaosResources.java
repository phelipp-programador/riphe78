package br.com.phddigital.riphe78.data;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Promocao;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PromocaosResources {


    @GET("promocao")
    public Call<Optional<List<Promocao>>> select();
    @GET("promocao/{value}")
    public Call<List<Promocao>> select(@Path("value")String  value );

}
