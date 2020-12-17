package br.com.phddigital.riphe78.config;

import com.google.gson.Gson;

import br.com.phddigital.riphe78.data.CategoriaResources;
import lombok.Data;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitConfig  {
      private static final String baseUrl="http://192.168.0.103:3000/api/";
     private static Retrofit retrofit;

    private  RetrofitConfig() {
    }

    public static Retrofit factory(){
        if(retrofit ==null){
            retrofit =
                    new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
        }
        return retrofit;
    }

}
