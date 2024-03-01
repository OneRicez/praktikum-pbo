// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program class Wali Mahasiswa

public class WaliMahasiswa {
  // Atribut
  private String nama;
  private String nomorHp;
  private String alamat;

  // Konstruktor
  public WaliMahasiswa(){
    nama = "";
    nomorHp = "";
    alamat = "";
  }

  // Overloading
  public WaliMahasiswa(String nama, String nomorHp, String alamat){
    this.nama = nama;
    this.nomorHp = nomorHp;
    this.alamat = alamat;
  }

  // Getter
  public String getNama(){
    return nama;
  }

  public String getNomorHp(){
    return nomorHp;
  }

  public String getAlamat(){
    return alamat;
  }

  // Setter
  public void setNama(String nama){
    this.nama = nama;
  }
  public void nomorHp(String nomorHp){
    this.nomorHp = nomorHp;
  }
  public void Alamat(String alamat){
    this.alamat = alamat;
  }
}