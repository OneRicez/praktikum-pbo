/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/
import static java.lang.Math.PI;

public class Lingkaran implements IArea{
  private double jejari;

  public Lingkaran(double r){
    jejari = r;
  }

  public double hitungLuas(){
    return PI*jejari*jejari;
  } 
}
