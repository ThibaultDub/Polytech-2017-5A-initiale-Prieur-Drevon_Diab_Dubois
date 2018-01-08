package inge5a.polytech.com.controller;

import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import inge5a.polytech.com.model.Beer;
import inge5a.polytech.com.retrofit.BeersAPI;
import inge5a.polytech.com.retrofit.RecyclerViewAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BeerController implements Callback<List<Beer>> {
    private final String API_BASE_URL = "https://api.punkapi.com/";
    private List<Beer> beerList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

    public void start(RecyclerView mRecyclerView) {
        this.mRecyclerView = mRecyclerView;

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        BeersAPI beersAPI= retrofit.create(BeersAPI.class);

        Call<List<Beer>> call = beersAPI.getBeers();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
        if(response.isSuccessful()) {
            List<Beer> beerListe = response.body();
            if (beerListe != null) {
                beerList = new ArrayList<>();

                for(Beer b : beerListe) {
                    System.out.println(b.getName());
                    beerList.add(b);
                }

                mAdapter = new RecyclerViewAdapter(beerList);
                mRecyclerView.setAdapter(mAdapter);
            }
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<Beer>> call, Throwable t) {
        t.printStackTrace();
    }

    public List<Beer> getBeerList() {
        return beerList;
    }
}
