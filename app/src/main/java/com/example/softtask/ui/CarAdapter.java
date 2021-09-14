package com.example.softtask.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.softtask.R;

/**
 * Ahmed Ali Ebaid ahmedali26002844@gmail.com 14/09/2021
 */
public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

  @NonNull
  @Override
  public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false));
  }

  @Override
  public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  class CarViewHolder extends RecyclerView.ViewHolder{


    public CarViewHolder(@NonNull View itemView) {
      super(itemView);

    }
  }
}
