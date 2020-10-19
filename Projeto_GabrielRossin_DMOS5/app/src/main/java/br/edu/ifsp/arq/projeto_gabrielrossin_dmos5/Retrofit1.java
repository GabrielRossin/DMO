package br.edu.ifsp.arq.projeto_gabrielrossin_dmos5;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofit1 {

    @GET("character?key=$2a$10$xuATSMPLPuEfVZog1VN8eOmJFAWX7t6cm1MbCRtWQqTLI9aS2hB4a")
    Call<HarryPotterNome> getNames(@Query("name") String nome);


}

