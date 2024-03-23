/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double jeja = scan.nextDouble();
    Lingkaran l = new Lingkaran(jeja);
    System.out.println("Luas lingkaran dengan jejari " + jeja + " satuan: "+ l.hitungLuas());
  }
}
