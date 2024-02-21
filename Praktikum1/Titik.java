/* Nama: Nashwan Adenaya
 * NIM: 24060122130084
 * Praktikum PBO Pertemuan 1
 * Titik
 */

class Titik{ //Identity
  // Attributes/State
  double absis;
  double ordinat;
  static int counterTitik;

  // Constructor
  Titik(){
    absis = 0;
    ordinat = 0;
    counterTitik++;
  }

  // Overloading
  Titik(double x , double y){
    absis = x;
    ordinat = y;
    counterTitik++;
  }

  // Method
  void setAbsis(double a) {
    absis = a;
  }

  void setOrdinat(double a) {
    ordinat = a;
  }

  double getAbsis(){
    return absis;
  }

  double getOrdinat(){
    return ordinat;
  }

  public static int getCounterTitik() {
    return counterTitik;
  }

}