// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 09/05/2024
// Deskripsi: Kelas yang berisi kelas kupu, ulat, kepompong, kupu dewasa, untuk mengimplementasikan
//            konsep generik



class Kupu {
  void gerak() {}
}

class Ulat extends Kupu {
  void gerak() {
    System.out.println("ulat merayap");
  }
}

class Kepompong extends Kupu {
  void gerak() {
    System.out.println("kepompong diam");
  }
}

class KupuDewasa extends Kupu {
  void gerak() {
    System.out.println("kupu terbang");
  }
}

class Data<T> {
  private T isi;

  T getIsi() {
    return this.isi;
  }

  void setIsi(T x) {
    this.isi = x;
  }
}

public class Main {
  public static void main(String[] args) {
      Ulat K = new Ulat();
      Data<Kupu> anu = new Data<>();

      anu.setIsi(K);
      anu.getIsi().gerak();

      anu.setIsi(new Kepompong());
      anu.getIsi().gerak();

      anu.setIsi(new KupuDewasa());
      anu.getIsi().gerak();
  }
}
