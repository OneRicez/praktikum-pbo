/* Nama: Nashwan Adenaya 
   Nim: 24060122130084
 * Deskripsi: program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai 0
*/

class Lingkaran{
  private double jariJari;
  public Lingkaran(double jariJari){
    this.jariJari = jariJari;
  }
  public double hitungKeliling(){
    double keliling = 2 * Math.PI*jariJari;
    return keliling;
  }
}

public class Asersi2 {
  public static void main(String[] args) {
    double jariJari = 0;
    assert (jariJari <= 0):"Jari jari tidak boleh nol atau negatif";
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
  }  
}
