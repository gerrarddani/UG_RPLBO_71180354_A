package com.ug6.soal1;


import java.util.Scanner;

public class Main {
    private static Object namaBarang;

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      Buat Vending Machine terlebih dahulu        ");
        System.out.println("==================================================");
        Scanner maksimal = new Scanner(System.in);
        String jumlah;
        System.out.println("Kapasitas maximal :");;
        jumlah = maksimal.nextLine();
        System.out.println("Apakah anda akan menambahkan brang sekarang ?");
        Scanner pilihan = new Scanner(System.in);
        String yorn;
        System.out.println("ya(y) atau tidak(n):");
        yorn = pilihan.nextLine();
    if (yorn == "y"){
    }
        Scanner namabarang = new Scanner(System.in);
        String nama;
        System.out.println("Nama barang :");
        nama = namabarang.nextLine();
        Scanner type = new Scanner(System.in);
        String angka;
        System.out.println("Type barang :");
        System.out.println("1.Minuman");
        System.out.println("2.Makanan");
        System.out.println("3.Produk Digital");
        System.out.println("Pilihan(1/2/3) : ");
        angka = type.nextLine();
        System.out.println("Apakah anda ingin memasukan nominal harga dan jumlah barang ?");
        Scanner pilihan3 = new Scanner(System.in);
        String yorn3;
        System.out.println("ya(y) atau tidak(n):");
        yorn3 = pilihan3.nextLine();
        Scanner nominal = new Scanner(System.in);
        String harga;
        System.out.println("Harga barang :");
        harga =nominal.nextLine();
        Scanner kapasitas = new Scanner(System.in);
        String nilai;
        System.out.println("Kapasitas barang yang ada/dimiliki : ");
        nilai =kapasitas.nextLine();
        System.out.println("Apakah anda ingin menambahkan lagi ?");
        Scanner pilihan2 = new Scanner(System.in);
        String yorn2;
        System.out.println("ya(y) atau tidak(n):");
        yorn2 = pilihan2.nextLine();
        }

}