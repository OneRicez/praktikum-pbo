/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

public class MBujurSangkar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BujurSangkar bs = new BujurSangkar();
    System.out.println("Masukkan sisi buju sangkar: ");
    double sisi = scan.nextDouble();
    System.out.println("Luas bujur sangkar dengan sisi "+ sisi + " satuan adalah "+bs.hitungLuas(sisi));
  
    scan.close();
  
  }
}
