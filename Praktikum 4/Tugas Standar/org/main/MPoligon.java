/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: driver class untuk poligon dan persegi panjang
 */

package org.main;
import org.bangundatar.*;

public class MPoligon {
  public static void main(String[] args){
    PersegiPanjang persegip = new PersegiPanjang(10, 12, 4);
    Segitiga segitiga1 = new Segitiga(3,4,3);
    persegip.printInfo();
    segitiga1.printInfo();
    System.out.println("Luas Persegi Panjang: "+ persegip.hitungLuas());
    System.out.println("Luas Persegi Panjang: "+ segitiga1.hitungLuas());
  }
}
