/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Representasi dari objek Mahasiswa, turunan kelas Orang
 */

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
  private String nim;
  private String jurusan;
  private WaliMahasiswa wali;

  public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
    super(nama, nik);
    this.nim = nim;
    this.jurusan = jurusan;
    this.wali = wali;
  }

  public String getNim(){
    return nim;
  }

  public String getJurusan(){
    return jurusan;
  }

  public WaliMahasiswa getWali(){
    return wali;
  }

  public void setNim(String nim){
    this.nim = nim;
  }

  public void setJurusan(String jurusan){
    this.jurusan = jurusan;
  }

  public void setWali(WaliMahasiswa wali){
    this.wali = wali;
  }

  public void cetak(){
    super.cetak();
    System.out.println("Nim: "+ nim);
    System.out.println("Jurusan: "+ jurusan);
    System.out.println("Nama Wali: "+ wali.getNama());
  }
}