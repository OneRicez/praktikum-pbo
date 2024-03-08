/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Kelas yang berisi program class Main untuk mengaplikasikan Exception pada class Buku dan Anggota 
 */
public class Main {
  public static void main(String[] args) {
    Anggota a1 = new Anggota("Budi");
    Anggota a2 = new Anggota("Komar");
    Buku b1 = new Buku("Dune");
    Buku b2 = new Buku("Harry Jumper");
    Buku b3 = new Buku("LovLuv");
    Buku b4 = new Buku("Persecon");
    
    try {
      a1.pinjamBuku(b1);
      a1.pinjamBuku(b2);
      a1.pinjamBuku(b3);
      a1.pinjamBuku(b4);
      a2.pinjamBuku(b2);
    }
    catch (MaksimumBukuTerpinjamException e) {
      System.out.println(e.getMessage()); 
      System.out.println("Maaf, Anda sudah meminjam jumlah buku maksimum."); 
    } 
    catch (BukuTidakTersediaException e) {
      System.out.println(e.getMessage());
      System.out.println("Maaf, buku yang Anda ingin pinjam tidak tersedia.");
    }
  }
}