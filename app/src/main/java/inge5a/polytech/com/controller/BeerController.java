package inge5a.polytech.com.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import inge5a.polytech.com.model.Beer;
import inge5a.polytech.com.retrofit.BeersAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BeerController implements Callback<List<Beer>>{
    private final String apiUrl = "https://api.punkapi.com/";

    public void start(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        BeersAPI beersAPI= retrofit.create(BeersAPI.class);

        Call<List<Beer>> call = beersAPI.getBeers();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
        if(response.isSuccessful()) {
            List<Beer> beerList = response.body();
            if (beerList != null) {
                for(Beer b : beerList) {
                    System.out.println(b.getName());
                }
            }
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<Beer>> call, Throwable t) {
        t.printStackTrace();
    }
}
