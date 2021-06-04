package com.manzdev.myapps.Repository;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1



import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.manzdev.myapps.Database.ProfileDatabase;
import com.manzdev.myapps.Database.profileDAO;
import com.manzdev.myapps.Entity.ProfileRoomEntity;

import java.util.List;

public class ProfileRepo {
    private profileDAO dao;
    private ProfileRoomEntity profile;

    public ProfileRepo(Application application) {
        ProfileDatabase db = ProfileDatabase.getInstance(application);
        dao=db.profileDAO();
        profile= dao.getProfile();
    }

    public void insert (ProfileRoomEntity pro){
        new InsertProfileAsnycTask(dao).execute(pro);
    }

    public ProfileRoomEntity getProfile() {
        return profile;
    }

    private  static class  InsertProfileAsnycTask extends AsyncTask<ProfileRoomEntity,Void,Void> {
        private  profileDAO dao;

        private InsertProfileAsnycTask(profileDAO dao){
            this.dao=dao;
        }

        @Override
        protected Void doInBackground(ProfileRoomEntity... profiles) {
            dao.insert(profiles[0]);
            //dao.insert(new ProfileRoomEntity(1, ""Bandung, 30 November 1998", "Irman Novryansah ", " Hai Semoga Sukanya Salam Kenalnya" ,"Jl. Holis Gg. Siti Fatima no 33 , Bandung","Laki-Laki","A","10118018","irmannovryansahjv19@gmail.com","+62 82120000348"));
            return null;
        }
    }
}
