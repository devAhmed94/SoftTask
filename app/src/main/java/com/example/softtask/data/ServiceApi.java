package com.example.softtask.data;

import com.example.softtask.model.CarResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Ahmed Ali Ebaid ahmedali26002844@gmail.com 14/09/2021
 */
public interface ServiceApi {
  @GET("cars")
  Call<CarResponse> getCars(@Query("page") int page);
}
