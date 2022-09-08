import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabunganKonvensional K_71180354 = new TabunganKonvensional();
        TabunganBerjangka I_71180354 = new TabunganBerjangka();


        System.out.println("Pilihan :");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat Saldo");
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukan Pilihan :");
        int pilihan = inp.nextInt();

        if (pilihan == 1) {
            K_71180354.penyetoran(200000);
            I_71180354.penyetoran(1000000);
        }
        if (pilihan == 2) {
            K_71180354.penarikan(50000);
            I_71180354.penarikan(50000);
        }
        if (pilihan == 3) {
            K_71180354.getSaldo();
            I_71180354.getSaldo();
        }
    }
}
