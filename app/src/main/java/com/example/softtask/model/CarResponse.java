package com.example.softtask.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Ahmed Ali Ebaid ahmedali26002844@gmail.com 14/09/2021
 */
public class CarResponse {
  @SerializedName("status")
  private int status;
  @SerializedName("data")
  private List<Car> data;

  public CarResponse(int status, List<Car> data) {
    this.status = status;
    this.data = data;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public List<Car> getData() {
    return data;
  }

  public void setData(List<Car> data) {
    this.data = data;
  }
}
