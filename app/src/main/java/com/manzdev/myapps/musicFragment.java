package com.manzdev.myapps;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manzdev.myapps.Adapter.ListDailyAdapter;
import com.manzdev.myapps.Adapter.ListMusicAdapter;
import com.manzdev.myapps.DummyData.Daily;
import com.manzdev.myapps.DummyData.Music;
import com.manzdev.myapps.Entity.music;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link musicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class musicFragment extends Fragment {
    private RecyclerView rvMusic;
    private ArrayList<music> list = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public musicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment music.
     */
    // TODO: Rename and change types and number of parameters
    public static musicFragment newInstance(String param1, String param2) {
        musicFragment fragment = new musicFragment();
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
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        rvMusic = view.findViewById(R.id.rv_music);
        rvMusic.setHasFixedSize(true);
        list.addAll(Music.getListData());
        ShowlistMusic();

        return view;
    }
    void ShowlistMusic(){
        //rvDaily.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        rvMusic.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListMusicAdapter listMusicAdapter = new ListMusicAdapter(list);
        rvMusic.setAdapter(listMusicAdapter);
    }
}