// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program class Mahasiswa

public class Mahasiswa {
  private String nama;
  private String nim;
  private String jurusan;
  private WaliMahasiswa wali;
  
  // Konstruktor
  public Mahasiswa(){
    nama = "";
    nim = "";
    jurusan = "";
    wali = new WaliMahasiswa();
  }

  // Overloading
  public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali) {
    this.nama = nama;
    this.nim = nim;
    this.jurusan = jurusan;
    this.wali = wali;
  }

  // Getter
  public String getNama(){
    return nama;
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

  // Setter
  public void setNama(String nama){
    this.nama = nama;
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
    System.out.printf("Nama: %s\nNim: %s\nJurusan: %s\nNama Wali: %s\nNomor HP Wali: %s\nAlamat Wali: %s",nama,nim,jurusan,wali.getNama(),wali.getNomorHp(),wali.getAlamat());
  }
}