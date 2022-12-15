package com.ug14.rumahsakit;

import java.util.Objects;
import java.util.Scanner;


public class Pelayanan {
    private int idPelayanan;
    private String nama;

    public void setIdPelayanan(int idPelayanan) {
        this.idPelayanan = idPelayanan;
    }

    public void Pelayan(String nama){
        this.nama = nama;
    }

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter,Suster suster, Jadwal jadwal) {
        if (Objects.equals(pasien.getStatus(), "False (sakit)")) {
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            System.out.println("Mengatur Jadwal Berhasil");
        } else {
            System.out.println("Pengunjung tidak sakit ngapai kesini!");
        }

    }

    public Pasien registrasi() {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Masukkan rm baru: ");
        int rm = scan2.nextInt();
        System.out.print("Masukkan nama anda: ");
        String nama = scan1.nextLine();
        System.out.print("Masukkan usia anda: ");
        int usia = scan2.nextInt();
        System.out.print("Masukkan alamat anda: ");
        String alamat = scan1.nextLine();
        System.out.print("Masukkan penyakit anda: ");
        String penyakit = scan1.nextLine();
        Pasien pasien = new Pasien(nama, usia, alamat, penyakit, 2);
        System.out.println("Preses Registrasi Berhasil");
        return pasien;
    }

    public int getIdPelayanan() {
        return idPelayanan;
    }
}
