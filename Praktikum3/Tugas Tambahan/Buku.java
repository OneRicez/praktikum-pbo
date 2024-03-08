/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Kelas yang berisi program class Buku
 */

public class Buku {
  private String judul;
  private boolean tersedia;

  public Buku(String judul) {
    this.judul = judul;
    tersedia = true;
  }
  
  public String getJudul() {
    return judul;
  }
  public boolean isTersedia() {
    return tersedia;
  }
  public void setJudul(String judul) {
    this.judul = judul;
  }
  public void setTersedia(boolean tersedia) {
    this.tersedia = tersedia;
}

  
}