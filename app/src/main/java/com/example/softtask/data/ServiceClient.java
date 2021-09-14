package com.example.softtask.data;

import com.example.softtask.model.CarResponse;
import com.example.softtask.util.Constants;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Ahmed Ali Ebaid ahmedali26002844@gmail.com 14/09/2021
 */
public class ServiceClient {
  private static ServiceClient instanceClient;
  private Retrofit retrofit;
  private ServiceApi serviceApi;
  private   ServiceClient()
  {
    retrofit = new Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    serviceApi = retrofit.create(ServiceApi.class);

  }

  public static ServiceClient getInstance(){
    if (instanceClient==null){
      instanceClient =new ServiceClient();
    }

    return instanceClient;
  }
  public Call<CarResponse> getCars(int page){
    return serviceApi.getCars(page);
  }




}
