package com.ug14.rumahsakit;

public class Pasien {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private boolean status;

    public Pasien(String nama, int usia, String alamat, String penyakit, int levelPenyakit) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
        this.levelPenyakit = levelPenyakit;
        this.status = Boolean.parseBoolean("False (sakit)");
    }

    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.status = Boolean.parseBoolean("False (sakit)");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setStatus(String status) {
        this.status = Boolean.parseBoolean(status);
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return this.usia;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getPenyakit() {
        return this.penyakit;
    }

    public int getLevelPenyakit() {
        return this.levelPenyakit;
    }

    public boolean getStatus() {
        return this.status;
    }


    public int getRm(){
        return rm;
    }
}
