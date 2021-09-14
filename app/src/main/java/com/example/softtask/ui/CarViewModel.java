package com.example.softtask.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.softtask.data.ServiceClient;
import com.example.softtask.model.CarResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Ahmed Ali Ebaid ahmedali26002844@gmail.com 14/09/2021
 */
public class CarViewModel extends ViewModel {

  MutableLiveData<CarResponse> mutableCar = new MutableLiveData<CarResponse>();

  void getCars(int page) {
    ServiceClient.getInstance().getCars(1).enqueue(new Callback<CarResponse>() {
      @Override
      public void onResponse(Call<CarResponse> call, Response<CarResponse> response) {
        mutableCar.setValue(response.body());
      }

      @Override
      public void onFailure(Call<CarResponse> call, Throwable t) {

      }
    });
  }
}
