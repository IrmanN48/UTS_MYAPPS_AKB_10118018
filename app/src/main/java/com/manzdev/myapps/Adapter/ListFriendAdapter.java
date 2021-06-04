package com.manzdev.myapps.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.manzdev.myapps.Entity.daily;
import com.manzdev.myapps.Entity.friend;
import com.manzdev.myapps.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFriendAdapter extends RecyclerView.Adapter<ListFriendAdapter.ListViewHolder> {
    private ArrayList<friend> listF;
    public ListFriendAdapter(ArrayList<friend> list){
        this.listF=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friendlist,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        friend day = listF.get(position);
        Glide.with(holder.itemView.getContext())
                .load(day.getFoto())
                .apply(new RequestOptions().override(1000,1000))
                .into(holder.imgPhoto);
        holder.tvNama.setText(day.getNama());

    }

    @Override
    public int getItemCount() {
        return listF.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_Friend);
            tvNama = itemView.findViewById(R.id.tv_Nama_friend);
        }
    }
}
