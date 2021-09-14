package com.example.softtask.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.softtask.R;
import com.example.softtask.model.CarResponse;

public class MainActivity extends AppCompatActivity {

  CarViewModel carViewModel;
  private static final String TAG = "AAA";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    carViewModel = ViewModelProviders.of(this).get(CarViewModel.class);
    carViewModel.getCars(1);
    getCars();
  }

  void getCars() {
  carViewModel.mutableCar.observe(this, new Observer<CarResponse>() {
    @Override
    public void onChanged(CarResponse carResponse) {
     
      Log.d(TAG, "onChanged: "+carResponse.getData().get(0).getBrand());
    }
  });

  }
}