package com.manzdev.myapps.Adapter;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.manzdev.myapps.Entity.friend;
import com.manzdev.myapps.Entity.gallery;
import com.manzdev.myapps.R;

import java.util.ArrayList;

public class ListGalleryAdapter extends RecyclerView.Adapter<ListGalleryAdapter.ListViewHolder> {
    private ArrayList<gallery> listF;
    public ListGalleryAdapter(ArrayList<gallery> list){
        this.listF=list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        gallery day = listF.get(position);
        Glide.with(holder.itemView.getContext())
                .load(day.getFoto())
                .apply(new RequestOptions().override(1000,1000))
                .into(holder.imgPhoto);


    }

    @Override
    public int getItemCount() {
        return listF.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_gallery);
        }
    }
}
