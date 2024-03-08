/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Program untuk menunjukkan penggunaan exception buatan sendiri, dan pengenalan klausa 
              'throw' dan 'throws'
 */

public class AngkaSial {
  
  public static void cobaAngka(int angka) throws AngkaSialException {
    if (angka == 13){
      throw new AngkaSialException();
    }
    System.out.println(angka+" bukan angka sial");
  }

  public static void main(String[] args){
    AngkaSial as = new AngkaSial();
    try {
      as.cobaAngka(10);
      as.cobaAngka(13);
      as.cobaAngka(12);
    } catch (AngkaSialException ase) {
      System.out.println(ase.getMessage());
      System.out.println("hati-hati masukkan angka!!");
    }
  }
}

/*Jawaban:
  Setelah eksepsi ditangkap, baris 12 tidak akan dieksekusi 
  karena eksekusi metode yang memanggil cobaAngka(13) 
  terhenti setelah eksepsi dilemparkan dan ditangkap. 
  Sehingga, baris 12 hanya dieksekusi sekali saat baris 18 atau as.cobaAngka(10) dieksekusi.

  Ketika eksepsi terjadi pada pemanggilan pada baris 16, program akan mengeksekusi 
  blok catch pada baris 21 karena AngkaSialException dilemparkan oleh metode cobaAngka. 
  Oleh karena itu, baris 21 akan dieksekusi.
 */