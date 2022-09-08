public class TabunganBerjangka {
    private double saldo = 200000;
    private String pemilik;

    public void getSaldo(){
        System.out.println("Saldo I_71180354 :" + saldo);
    }

    public void penarikan(double tarik){
        System.out.println("------ Tabungan Berjangka-----");
        System.out.println("Belum jatuh tempo");
    }

    public void penyetoran(double setor){
        System.out.println("------ Tabungan Berjangka-----");
        System.out.println("Penyetoran Rp." + setor);
    }

}

