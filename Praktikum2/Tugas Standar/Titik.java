// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program class Titik

class Titik{ //Identity
  // Attributes/State
  private double absis;
  private double ordinat;
  private static int counterTitik;

  // Constructor
  public Titik(){
    absis = 0;
    ordinat = 0;
    counterTitik++;
  }

  // Overloading
  public Titik(double x , double y){
    absis = x;
    ordinat = y;
    counterTitik++;
  }

  // Method
  public void setAbsis(double a) {
    absis = a;
  }

  public void setOrdinat(double a) {
    ordinat = a;
  }

  public double getAbsis(){
    return absis;
  }

  public double getOrdinat(){
    return ordinat;
  }

  public static int getCounterTitik() {
    return counterTitik;
  }

  public double getJarakPusat(){
    return Math.sqrt(Math.pow(this.absis-0,2)+Math.pow(this.ordinat-0,2));
  }

  public void refleksiX(){
    ordinat = this.ordinat * -1;
  }

  public void refleksiY(){
    absis = this.absis * -1;
  }

  public Titik getRefleksiX(){
    return new Titik(this.absis, this.ordinat*-1);
  }
  public Titik getRefleksiY(){
    return new Titik(this.absis*-1, this.ordinat);
  }
  public void printTitik(String name){
    System.out.printf("%s (%f, %f)", name, absis, ordinat);
  }
  
}