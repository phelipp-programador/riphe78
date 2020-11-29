package br.com.phddigital.riphe78.data;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Categoria;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CategoriaResources  {

    @POST("categoria")
    public Call<Categoria> save(@Body Categoria entity) ;

    @GET("categoria")
    public Call<Optional<List<Categoria>>> select();

    @PUT("categoria/{id}")
    public Call<Categoria>   update(@Path("id") Integer id, @Body Categoria newEntity) ;

    @DELETE("categoria/{id}")
    public Call<Boolean> delete(@Path("id") Integer id) ;
}
