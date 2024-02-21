/* Nama: Nashwan Adenaya
 * NIM: 24060122130084
 * Praktikum PBO Pertemuan 1
 * MTitik
 */

class MTitik{
  public static void main(String[] args) {
    // Instansiasi
    Titik T1 = new Titik();
    T1.setAbsis(1.0);
    T1.setOrdinat(2.0);
    Titik T2 = new Titik();
    T2.setAbsis(3.0);
    T2.setOrdinat(4.0);
    Titik T3 = new Titik(5,6);

    int CounterTitik = Titik.getCounterTitik();
    System.out.println("Jumlah objek titik: " + CounterTitik);
    System.out.println("T1(" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
    // System.out.println("T2(" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    double absis = T2.getAbsis();
    double ordinat = T2.getOrdinat();
    System.out.printf("T2(%.1f, %.1f)\n", absis, ordinat);
    System.out.println("T3(" + T3.getAbsis() + ", " + T3.getOrdinat() + ")");
  }
}