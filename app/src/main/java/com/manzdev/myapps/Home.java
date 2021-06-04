package com.manzdev.myapps;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.manzdev.myapps.viewModel.ProfileVM;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */

public class Home extends Fragment {
    private ProfileVM viewModel;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
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
        View  view = inflater.inflate(R.layout.fragment_home, container, false);
        viewModel = ViewModelProviders.of(getActivity()).get(ProfileVM.class);

        TextView nama = view.findViewById(R.id.tv_nama_home);
        TextView nim = view.findViewById(R.id.tv_nim_home);
        TextView bio = view.findViewById(R.id.tv_bio_home);
        TextView makes = view.findViewById(R.id.tv_makes);
        TextView mikes = view.findViewById(R.id.tv_mikes);
        TextView cita = view.findViewById(R.id.tv_cita);
        TextView hoby = view.findViewById(R.id.tv_hoby);

        nama.setText(viewModel.getProfile().getNama());
        nim.setText(viewModel.getProfile().getNim());
        bio.setText(viewModel.getProfile().getBio());
        makes.setText(viewModel.getProfile().getMakes());
        mikes.setText(viewModel.getProfile().getMikes());
        cita.setText(viewModel.getProfile().getCita());
        hoby.setText(viewModel.getProfile().getHoby());


        return view;
    }
}