/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: driver class main untuk Mahasiswa dan Wali Mahasiswa
 */

package org.main;

import org.mahasiswa.*;
import org.walimahasiswa.*;

public class Main{
  public static void main(String[] args) {
    WaliMahasiswa w1 = new WaliMahasiswa("Budi Hendarto", "32102", "081457234", "Jl. Pemuda No 2");
    WaliMahasiswa w2 = new WaliMahasiswa("Dewi Sucipto", "32111", "08164321", "Jl. Pahlawan Blok A No 3");
    Mahasiswa m1 = new Mahasiswa("Nomon", "32120", "240123", "Informatika", w1);


    m1.cetak();
    System.out.println("---------------------");
    m1.getWali().cetak();
    m1.setWali(w2);
    System.out.println("------After Set------");
    m1.cetak();
    System.out.println("---------------------");
    m1.getWali().cetak();
  }
}
