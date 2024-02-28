// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program Main untuk mengaplikasikan garis

public class MGaris {
  public static void main(String[] args) {
    Titik T1 = new Titik(1,2);
    Titik T2 = new Titik(5,10);
    Garis G1 = new Garis(T1,T2);
    String fname = "Titik Awal";
    String lname = "Titik Akhir";

    G1.getTitikAwal().printTitik(fname);
    System.out.println("");
    G1.getTitikAkhir().printTitik(lname);

    System.out.printf("\nPanjang G1: %f\n", G1.getPanjang());
    System.out.printf("Gradien G1: %f\n", G1.getGradien());
    Garis rG1y = G1.getRefleksiY();
    System.out.println("Refleksi G1 thd-y:");
    rG1y.getTitikAwal().printTitik(fname);
    System.out.println("");
    rG1y.getTitikAkhir().printTitik(lname);
    System.out.println("");
    
    System.out.println("Garis 1 tegak lurus dengan garis 2: " + G1.isTegakLurus(rG1y)); 
  }
}
