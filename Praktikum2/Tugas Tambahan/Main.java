// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program Main dari Mahasiswa dan Wali Mahasiswa


public class Main {
  public static void main(String[] args) {
    WaliMahasiswa Wali1 = new WaliMahasiswa("Budi Sudarto", 
                                            "081162", 
                                            "Jl. Gajah Mada 2");
    Mahasiswa Mahasiswa1 = new Mahasiswa("Rudi Terminal", 
                                          "2401919",
                                          "Informatika", 
                                          Wali1);

    Mahasiswa m2 = new Mahasiswa();
    m2.setNama("Joko Susilo");
    m2.setNim("2402021");
    m2.setJurusan("Informatika");
    m2.setWali(Wali1);
    
    Mahasiswa1.cetak();
    System.out.println();
    System.out.println("\n==========");
    System.out.println();
    System.out.println("Nama Mahasiswa2: " + m2.getNama());
    System.out.println("Nim Mahasiswa2: " + m2.getNim());
    System.out.println("Jurusan Mahasiswa2: " + m2.getJurusan());
    System.out.println("Nama Wali Mahasiswa2: " + m2.getWali().getNama());
    System.out.println("Nomor HP Wali Mahasiswa2: " + m2.getWali().getNomorHp());

  }
}
