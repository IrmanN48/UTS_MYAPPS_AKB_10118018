package com.manzdev.myapps.Database;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.manzdev.myapps.Entity.ProfileRoomEntity;

import static androidx.constraintlayout.widget.Constraints.TAG;

@Database(entities = {ProfileRoomEntity.class}, version = 3, exportSchema = false)
public abstract class ProfileDatabase extends RoomDatabase {
    private static ProfileDatabase instance;
    public abstract profileDAO profileDAO();

    private static  RoomDatabase.Callback roomCallback= new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    public static synchronized ProfileDatabase getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ProfileDatabase.class, "Profile.db")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    private  static  class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private profileDAO dao;

        private  PopulateDbAsyncTask(ProfileDatabase db){
            dao = db.profileDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
              dao.insert(new ProfileRoomEntity(1, "Bandung, 30 November 1998", "Irman Novryansah", "Hi Semoga Sukanya Salam Kenal" ,"Jl. Holis Gg.Siti Fatima no 33, Bandung","Laki-Laki","A","10118018","irmannovryansahjv19@gmail.com","+62 82120000348","Mie Goreng","Starbucks","Ingin Kaya","Photograper"));

            return null;
        }
    }

}
