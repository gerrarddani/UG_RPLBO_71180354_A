

public class TabunganKonvensional {
    private double saldo = 100000;
    private String pemilik;

    public void getSaldo(){
        System.out.println("Saldo K_71180354 :" + saldo);
   }

   public void penarikan(double tarik){
       System.out.println("------ Tabungan Konvensional-----");
       System.out.println("Penarikan Rp." + tarik);
    }

  public void penyetoran(double setor){
      System.out.println("------ Tabungan Konvensional-----");
      System.out.println("Penyetoran Rp." + setor);
  }
}
