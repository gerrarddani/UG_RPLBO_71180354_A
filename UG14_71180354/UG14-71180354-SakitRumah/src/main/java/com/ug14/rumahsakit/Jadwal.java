package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public Jadwal() {
    }
    public void setidPemeriksaaan(int idPemeriksaan){
        this.idPemeriksaan =    idPemeriksaan;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

    public int getIdPemeriksaan() {
        return this.idPemeriksaan;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return this.dokter;
    }

    public Suster getSuster() {
        return this.suster;
    }

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public Boolean getStatusScreening() {
        return statusScreening;
    }

    public void sudahScreening() {
        this.statusScreening = true;
    }


}
