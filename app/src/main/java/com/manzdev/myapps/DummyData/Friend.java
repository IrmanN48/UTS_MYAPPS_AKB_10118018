package com.manzdev.myapps.DummyData;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import com.manzdev.myapps.Entity.friend;
import com.manzdev.myapps.R;

import java.util.ArrayList;

public class Friend {
    private static String [] nama ={
            "Shenny",
            "Edo",
            "Larizky",
            "Indra",
            "Fikri",
            "Alvin",
            "Rivandi",
            "Reza"
    };


    private static int [] foto ={
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f7,
            R.drawable.f8
    };

    public static ArrayList<friend> getListData(){
        ArrayList<friend> list = new ArrayList<>();
        for (int position = 0; position < nama.length; position++){
            friend day = new friend();
            day.setNama(nama[position]);
            day.setFoto(foto[position]);
            list.add(day);
        }
        return list;
    }
}
