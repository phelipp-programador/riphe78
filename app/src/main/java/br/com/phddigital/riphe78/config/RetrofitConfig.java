package br.com.phddigital.riphe78.config;

import com.google.gson.Gson;

import br.com.phddigital.riphe78.data.CategoriaResources;
import lombok.Data;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitConfig  {
      final String baseUrl="";
     private final Retrofit retrofit;

    public RetrofitConfig() {
        retrofit =
                new Retrofit.Builder()
                       .baseUrl(baseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
    }
   public Retrofit getRetrofit(){
        return retrofit;
    }

}
