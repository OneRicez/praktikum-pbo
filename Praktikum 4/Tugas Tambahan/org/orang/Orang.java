/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Representasi dasar dari objek Orang
 */

package org.orang;

public class Orang {
  protected String nama;
  protected String nik;

  // Konstruktor
  public Orang(String nama, String nik){
    this.nama = nama;
    this.nik = nik;
  }

  // Getter
  public String getNama(){
    return nama;
  }

  public String getNik(){
    return nik;
  }

  // Setter
  public void setNama(String nama){
    this.nama = nama;
  }

  public void setNik(String nik){
    this.nik = nik;
  }

  // Method
  public void cetak(){
    System.out.println("Nama: "+ nama);
    System.out.println("Nik: "+ nik);
  }
}
