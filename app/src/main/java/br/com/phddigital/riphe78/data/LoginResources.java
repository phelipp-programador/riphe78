package br.com.phddigital.riphe78.data;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Item;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface LoginResources {


    @POST("login")
    public Call<Optional<List<Item>>> logar();
   
}
