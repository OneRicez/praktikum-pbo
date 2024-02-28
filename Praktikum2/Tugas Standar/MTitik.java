// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program Main untuk mengaplikasikan titik 

class MTitik{
  public static void main(String[] args) {
    // Instansiasi
    Titik T1 = new Titik();
    T1.setAbsis(1.0);
    T1.setOrdinat(2.0);
    Titik T2 = new Titik();
    T2.setAbsis(3.0);
    T2.setOrdinat(4.0);
    // Titik T3 = new Titik(5,6);


    int CounterTitik = Titik.getCounterTitik();
    System.out.println("Jumlah objek titik: " + CounterTitik);
    System.out.println("T1(" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
    T1.refleksiY();
    System.out.println("rT1y(" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
    System.out.println("T2(" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    Titik rT2x = T2.getRefleksiX();
    
    double absis = rT2x.getAbsis();
    double ordinat = rT2x.getOrdinat();
    
    System.out.printf("rT2X(%.1f, %.1f)\n", absis, ordinat);
    // System.out.println("T3(" + T3.getAbsis() + ", " + T3.getOrdinat() + ")");
    // System.out.println("Jarak Titik T1 ke pusat: " + T1.getJarakPusat());

    /*  Access modifier private digunakan untuk menyembunyikan atribut dari luar kelas, sedangkan Access modifier public memungkinkan akses langsung ke atribut dari luar kelas.
        Penggunaan access modifier untuk mengontrol akses dan mencegah perubahan yang tidak diinginkan. Penggunaan metode getter dan setter lebih disukai daripada mengakses atribut secara langsung untuk mempertahankan prinsip enkapsulasi. */
  }
}