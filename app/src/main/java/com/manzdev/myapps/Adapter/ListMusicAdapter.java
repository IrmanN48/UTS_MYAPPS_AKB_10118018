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

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.manzdev.myapps.Entity.daily;
import com.manzdev.myapps.Entity.music;
import com.manzdev.myapps.R;

import java.util.ArrayList;

public class ListMusicAdapter extends RecyclerView.Adapter<ListMusicAdapter.ListViewHolder> {
    private ArrayList<music> listM;

    public ListMusicAdapter(ArrayList<music> list){
        this.listM=list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        music day = listM.get(position);
        Glide.with(holder.itemView.getContext())
                .load(day.getIcon())
                .apply(new RequestOptions().override(300,300))
                .into(holder.imgPhoto);
        holder.tvJudul.setText(day.getJudul());
        holder.tvDetail.setText(day.getDetail());
    }

    @Override
    public int getItemCount() {
        return listM.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvJudul,tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_music);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvDetail = itemView.findViewById(R.id.tv_singer);
        }
    }
}
