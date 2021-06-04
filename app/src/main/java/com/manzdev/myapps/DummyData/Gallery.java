package com.manzdev.myapps.DummyData;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import com.manzdev.myapps.Entity.gallery;
import com.manzdev.myapps.R;

import java.util.ArrayList;

public class Gallery {
    private static int [] foto ={
            R.drawable.g1,
            R.drawable.g2,
            R.drawable.g3,
            R.drawable.g4,
            R.drawable.g5,
            R.drawable.g6,
            R.drawable.g7,
            R.drawable.g8
    };

    public static ArrayList<gallery> getListData(){
        ArrayList<gallery> list = new ArrayList<>();
        for (int position = 0; position < foto.length; position++){
            gallery day = new gallery();
            day.setFoto(foto[position]);
            list.add(day);
        }
        return list;
    }
}
