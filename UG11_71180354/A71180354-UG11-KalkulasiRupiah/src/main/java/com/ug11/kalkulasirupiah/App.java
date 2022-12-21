package com.ug11.kalkulasirupiah;



import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        String kalimat;
        int harga;
        int total = 0;

        Scanner teks = new Scanner(System.in);
        System.out.println("Masukkan teks: ");
        kalimat = teks.nextLine();

        String[] kata = kalimat.split("\\s+");

        for (int i = 0; i < kata.length;i++){
            if (kata[i].contains("Rp")){
                harga = Integer.parseInt(kata[i]);
                total += harga;
            }
            System.out.println("total: "+total);
        }

    }
}