package com.manzdev.myapps.Adapter;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.manzdev.myapps.Entity.daily;
import com.manzdev.myapps.R;

public class ListDailyAdapter extends RecyclerView.Adapter<ListDailyAdapter.ListViewHolder> {
    private ArrayList<daily> listDaily;

    public ListDailyAdapter(ArrayList<daily> list){
        this.listDaily=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dailyactivity,parent,false);
        return new ListViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        daily day = listDaily.get(position);
        Glide.with(holder.itemView.getContext())
                .load(day.getIcon())
                .apply(new RequestOptions().override(1000,1000))
                .into(holder.imgPhoto);
        holder.tvJudul.setText(day.getJudul());
        holder.tvDetail.setText(day.getDetail());
    }

    @Override
    public int getItemCount() {
        return listDaily.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvJudul,tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_daily);
            tvJudul = itemView.findViewById(R.id.tv_judul_daily);
            tvDetail = itemView.findViewById(R.id.tv_detail_daily);
        }
    }
}
