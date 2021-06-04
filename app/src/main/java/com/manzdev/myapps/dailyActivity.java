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

import java.util.ArrayList;

import com.manzdev.myapps.Adapter.ListDailyAdapter;
import com.manzdev.myapps.Adapter.ListFriendAdapter;
import com.manzdev.myapps.Entity.daily;
import com.manzdev.myapps.Entity.friend;
import com.manzdev.myapps.DummyData.Daily;
import com.manzdev.myapps.DummyData.Friend;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dailyActivity#newInstance} factory method to
 * create an instance of this fragment.
 */

public class dailyActivity extends Fragment {
    private RecyclerView rvDaily;
    private RecyclerView rvFriend;
    private ArrayList<daily> list = new ArrayList<>();
    private ArrayList<friend> list2 = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public dailyActivity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment dailyActivity.
     */
    // TODO: Rename and change types and number of parameters
    public static dailyActivity newInstance(String param1, String param2) {
        dailyActivity fragment = new dailyActivity();
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
        View view = inflater.inflate(R.layout.fragment_daily_activity, container, false);
        rvDaily = view.findViewById(R.id.rv_daily);
        rvFriend = view.findViewById(R.id.rv_friend);
        rvDaily.setHasFixedSize(true);
        rvFriend.setHasFixedSize(true);
        list.addAll(Daily.getListData());
        list2.addAll(Friend.getListData());
        ShowlistDaily();
        ShowlistFriend();
        return view;

    }

     void ShowlistDaily(){
        //rvDaily.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        rvDaily.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListDailyAdapter listDailyAdapter = new ListDailyAdapter(list);
        rvDaily.setAdapter(listDailyAdapter);
    }

    void ShowlistFriend(){
        rvFriend.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        ListFriendAdapter listFriendAdapter = new ListFriendAdapter(list2);
        rvFriend.setAdapter(listFriendAdapter);
    }
}