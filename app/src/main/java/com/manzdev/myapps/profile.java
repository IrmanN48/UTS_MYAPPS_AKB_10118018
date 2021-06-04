package com.manzdev.myapps;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import android.app.AlertDialog;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.manzdev.myapps.Database.ProfileDatabase;
import com.manzdev.myapps.Entity.ProfileRoomEntity;
import com.manzdev.myapps.Database.profileDAO;
import com.manzdev.myapps.viewModel.ProfileVM;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link profile#newInstance} factory method to
 * create an instance of this fragment.
 */

public class profile extends Fragment {
    private ProfileVM viewModel;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment profile.
     */
    // TODO: Rename and change types and number of parameters
    public static profile newInstance(String param1, String param2) {
        profile fragment = new profile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        viewModel = ViewModelProviders.of(getActivity()).get(ProfileVM.class);





        //dao.insert(new ProfileRoomEntity(1, "Bandung, 30 November 1998", "Irman Novryansah ", " Hai Semoga Sukanya Salam Kenalnya" ,"Jl. Holis Gg. Siti Fatima no 33 , Bandung","Laki-Laki","A","10118018","irmannovryansahjv19@gmail.com","+62 82120000348"));
        Button btn_insta = (Button) view.findViewById(R.id.btn_insta);
        Button btn_map = (Button) view.findViewById(R.id.btn_maps);
        Button btn_info = (Button) view.findViewById(R.id.btn_info);
        TextView nama = view.findViewById(R.id.tv_nama);
        TextView nim = view.findViewById(R.id.tv_nim);
        TextView bio = view.findViewById(R.id.tv_bio);
        TextView gender = view.findViewById(R.id.tv_gender);
        TextView alamat = view.findViewById(R.id.tv_alamat);
        TextView goldar = view.findViewById(R.id.tv_goldar);
        TextView ttl = view.findViewById(R.id.tv_ttl);
        TextView hp = view.findViewById(R.id.tv_hp);
        TextView email = view.findViewById(R.id.tv_email);
        String[] strProfile = new String[5];





        nama.setText(viewModel.getProfile().getNama());
        nim.setText(viewModel.getProfile().getNim());
        bio.setText(viewModel.getProfile().getBio());
        gender.setText(viewModel.getProfile().getJk());
        alamat.setText(viewModel.getProfile().getAlamat());
        goldar.setText(viewModel.getProfile().getGoldar());
        ttl.setText(viewModel.getProfile().getTtl());
        hp.setText(viewModel.getProfile().getTlp());
        email.setText(viewModel.getProfile().getEmail());
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(getView());
            }
        });
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.co.id/maps/place/Cibuntu,+Kec.+Bandung+Kulon,+Kota+Bandung,+Jawa+Barat/@-6.9208671,107.5622697,15z/data=!3m1!4b1!4m5!3m4!1s0x2e68e5fce1091863:0xaeb3a987fec09f08!8m2!3d-6.9206116!4d107.572706");
                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
                insta.setPackage("com.google.maps");
                try {
                    startActivity(insta);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.id/maps/place/Cibuntu,+Kec.+Bandung+Kulon,+Kota+Bandung,+Jawa+Barat/@-6.9208671,107.5622697,15z/data=!3m1!4b1!4m5!3m4!1s0x2e68e5fce1091863:0xaeb3a987fec09f08!8m2!3d-6.9206116!4d107.572706")));
                }
            }
        });
        btn_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/realirmannovryansah/");
                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
                insta.setPackage("com.instagram.android");
                try {
                    startActivity(insta);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/realirmannovryansah/")));
                }
            }
        });

        Fragment fragmentMaps = new MapsFragment();
        loadFragment(fragmentMaps);

        return view;
    }

    public void showDialog(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("About Apps");
        builder.setMessage("Irman Novryansah V.0.1.0 ");
        // add a button
        builder.setPositiveButton("OK", null);
        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void loadFragment(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.maps_profile,fragment).commit();
    }
}