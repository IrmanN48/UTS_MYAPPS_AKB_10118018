package com.manzdev.myapps.Entity;

//tgl pengerjaan : 4 juni 2021
//Nim : 10118018
//Nama : Irman Novryansah
//Kelas : IF1


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Profile")
public class ProfileRoomEntity implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "ttl")
    private String ttl;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "bio")
    private String bio;

    @ColumnInfo(name = "alamat")
    private String alamat;

    @ColumnInfo(name = "jk")
    private String jk;

    @ColumnInfo(name = "goldar")
    private String goldar;

    @ColumnInfo(name = "nim")
    private String nim;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "tlp")
    private String tlp;

    @ColumnInfo(name = "makes")
    private String makes;

    @ColumnInfo(name = "mikes")
    private String mikes;

    @ColumnInfo(name = "cita")
    private String cita;

    @ColumnInfo(name = "hoby")
    private String hoby;

    public ProfileRoomEntity(int id, String ttl, String nama, String bio, String alamat, String jk, String goldar, String nim, String email, String tlp,String makes, String mikes,String cita, String hoby) {
        this.id = id;
        this.ttl = ttl;
        this.nama = nama;
        this.bio = bio;
        this.alamat = alamat;
        this.jk = jk;
        this.goldar = goldar;
        this.nim = nim;
        this.email = email;
        this.tlp = tlp;
        this.makes = makes;
        this.mikes = mikes;
        this.cita = cita;
        this.hoby = hoby;
    }

    public String getMakes() {
        return makes;
    }

    public void setMakes(String makes) {
        this.makes = makes;
    }

    public String getMikes() {
        return mikes;
    }

    public void setMikes(String mikes) {
        this.mikes = mikes;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
