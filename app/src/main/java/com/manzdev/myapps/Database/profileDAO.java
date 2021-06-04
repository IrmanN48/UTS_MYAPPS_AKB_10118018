package com.manzdev.myapps.Database;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.manzdev.myapps.Entity.ProfileRoomEntity;

import java.util.List;
@Dao
public interface profileDAO {

    @Insert
    void insert(ProfileRoomEntity profile);

    @Query("SELECT * FROM profile where nim = '10118018' ")
    ProfileRoomEntity getProfile();


}
