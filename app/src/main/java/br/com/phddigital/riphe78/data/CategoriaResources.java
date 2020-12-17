package br.com.phddigital.riphe78.data;

import java.util.List;

import br.com.phddigital.riphe78.domain.Categoria;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CategoriaResources  {


    @GET("categoria")
     Call<List<Categoria>> select();
    @GET("categoria/{value}")
     Call<List<Categoria>> select(@Path("value")String  value );


}
