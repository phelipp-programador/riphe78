package br.com.phddigital.riphe78.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.mvp.MVP;
import retrofit2.Call;
import retrofit2.Response;

public interface Service<T extends MVP.Model> {
    Optional<List<T>> select() ;
    Optional<List<T>> select(String value);
    default Optional<List<T>> get(Call<List<T>> call){
        try {
            Response<List<T>> response = call.execute();
            List<T> body = response.body();
            if(body.size()>0){
                return Optional.of(body);
            }
            else {  return Optional.empty();}
        } catch (IOException e) {
            return Optional.empty();
        }
    }
}
