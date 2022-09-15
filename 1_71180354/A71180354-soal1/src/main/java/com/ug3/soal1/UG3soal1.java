package com.ug3.soal1;

import java.util.*;

public class UG3soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String namaProduk;
            String tanggalKadal;
            int jumlah;
            int berat;

            System.out.println("===========DATA PRODUCT============");
            System.out.println("Masukkan Data Product Makanan Anda");
            System.out.print("Nama Makanan: ");
            namaProduk = scan.nextLine();
            System.out.print("Tanggal Kadaluarsa: ");
            tanggalKadal = scan.nextLine();
            System.out.print("Jumlah (quantity) : ");
            jumlah = scan.nextInt();
            System.out.print("Berat (gram): ");
            berat = scan.nextInt();

            System.out.println("============Data Product===========");
            System.out.println("Nama makanan = "+ namaProduk);
            System.out.println("Tanggal kadaluarsa = " + tanggalKadal);
            System.out.println("Jumlah(quantity) = " + jumlah);
            System.out.println("Berat = " + berat + " gram");
            System.out.println("===================================");
        }
    }

