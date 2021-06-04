package com.manzdev.myapps.DummyData;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import com.manzdev.myapps.R;

import java.util.ArrayList;
import com.manzdev.myapps.Entity.daily;

public class Daily {
    private static String [] judul ={
            "Bangun Tidur",
            "Sarapan",
            "Makan Siang",
            "Main Game",
            "Tugas Kuliah",
            "Tidur"
    };
    private static String [] detail ={
            "06.00",
            "09.00",
            "18.00",
            "Free Time",
            "20.00 - 22.00",
            "23.00 - 06.00"
    };

    private static int [] icon ={
            R.drawable.daily_wake,
            R.drawable.daily_eat,
            R.drawable.daily_eat2,
            R.drawable.daily_play,
            R.drawable.daily_work,
            R.drawable.daily_sleep
    };

    public static ArrayList<daily> getListData(){
        ArrayList<daily> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++){
            daily day = new daily();
            day.setJudul(judul[position]);
            day.setDetail(detail[position]);
            day.setIcon(icon[position]);
            list.add(day);
        }
        return list;
    }
}
