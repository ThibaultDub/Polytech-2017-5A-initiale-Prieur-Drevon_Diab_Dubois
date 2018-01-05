package inge5a.polytech.com.retrofit;

import java.util.List;

import inge5a.polytech.com.model.Beer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by nico- on 05/01/2018.
 */

public interface BeersAPI {
    @GET("v2/beers")
    Call<List<Beer>> getBeers();
}
