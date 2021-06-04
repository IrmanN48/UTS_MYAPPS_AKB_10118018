package com.manzdev.myapps.DummyData;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import com.manzdev.myapps.Entity.music;
import com.manzdev.myapps.R;

import java.util.ArrayList;

public class Music {
    private static String [] judul ={
            "Mantan Terindah",
            "Birthday",
            "I Cant Stop Me",
            "How You Like That",
            "Black Mamba",
            "Psycho",
            "BBoom BBoom"

    };
    private static String [] detail ={
            "by Raisa",
            "by Somi",
            "by Twice",
            "by BlackPink",
            "by Aespa",
            "by Red Velvet",
            "by Momoland"
    };

    private static int [] icon ={
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m3,
            R.drawable.m4,
            R.drawable.m5,
            R.drawable.m6,
            R.drawable.m7
    };

    public static ArrayList<music> getListData(){
        ArrayList<music> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++){
            music day = new music();
            day.setJudul(judul[position]);
            day.setDetail(detail[position]);
            day.setIcon(icon[position]);
            list.add(day);
        }
        return list;
    }
}
