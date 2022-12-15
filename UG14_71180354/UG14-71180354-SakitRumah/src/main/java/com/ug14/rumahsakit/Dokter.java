package com.ug14.rumahsakit;

import java.util.Objects;

public class Dokter {

    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
       this.nama = nama;
       this.spesialis = spesialis;
       this.ruangan = ruangan;
    }
    public void memeriksa(Pasien pasien, Jadwal jadwal) {
        if (Objects.equals(pasien.getNama(), jadwal.getPasien().getNama())) {
            if (jadwal.getStatusDaftar() && Objects.equals(pasien.getStatus(), "False (sakit)")) {
                int lvl = jadwal.getPasien().getLevelPenyakit();
                jadwal.getPasien().setLevelPenyakit(lvl - 1);
                pasien.setLevelPenyakit(lvl - 1);
                if (pasien.getLevelPenyakit() == 0) {
                    pasien.setStatus("True (sembuh)");
                    jadwal.getPasien().setStatus("True (sembuh)");
                }
            }
        } else {
            System.out.println("Pengunjung harus membuat jadwal dahulu!");
        }
    }
    public void cekStatus(Pasien pasien, Jadwal jadwal) {System.out.println(pasien.getStatus());
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getNama() {
        return this.nama;
    }

    public String getSpesialis() {
        return this.spesialis;
    }

    public String getRuangan() {
        return this.ruangan;
    }

    private int idDokter(){
        return idDokter;
    }

    public int getIdDokter() {
        return idDokter;
    }
}
