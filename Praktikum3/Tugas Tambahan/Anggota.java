/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Kelas yang berisi program class Anggota
 */

public class Anggota {
  private String nama;
  private Buku[] bukuPinjaman;
  private int jumlahBukuPinjaman;

  public Anggota(String nama) {
    this.nama = nama;
    bukuPinjaman = new Buku[3];
    jumlahBukuPinjaman = 0;
  }
  public String getNama() {
    return nama;
  }
  public Buku[] getBukuPinjaman() {
    return bukuPinjaman;
  }
  public int getJumlahBukuPinjaman() {
    return jumlahBukuPinjaman;
  }
  public void pinjamBuku(Buku buku) throws
  MaksimumBukuTerpinjamException, BukuTidakTersediaException{
    if (jumlahBukuPinjaman >= 3){
      throw new MaksimumBukuTerpinjamException("Jumlah buku yang dapat dipinjam telah mencapai batas maksimum");
    }
    if (!buku.isTersedia()){
      throw new BukuTidakTersediaException("Buku yang dipinjam tidak tersedia");
    }
    buku.setTersedia(false);
    bukuPinjaman[jumlahBukuPinjaman] = buku;
    jumlahBukuPinjaman++;
  }
}