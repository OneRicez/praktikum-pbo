// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 28/02/2024
// Deskripsi: Kelas yang berisi program class Garis

public class Garis {
  // Atribut
  private Titik titikAwal;
  private Titik titikAkhir;

  // Konstruktor
  public Garis(){
    titikAwal = new Titik();
    titikAkhir = new Titik();
  }

  // Overloading
  public Garis(Titik titikAwal, Titik titikAkhir){
    this.titikAwal = titikAwal;
    this.titikAkhir = titikAkhir;
  }

  // Setter
  public void setTitikAwal(Titik titikAwal) {
    this.titikAwal = titikAwal;
  }

  public void setTitikAkhir(Titik titikAkhir) {
    this.titikAkhir = titikAkhir;
  }

  // Getter
  public Titik getTitikAwal(){
    return titikAwal;
  }

  public Titik getTitikAkhir(){
    return titikAkhir;
  }

  // Methods
  public double getPanjang(){
    return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
  }

  public double getGradien(){
    return (this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat()) / (this.titikAkhir.getAbsis() - this.titikAwal.getAbsis());
}


  public Garis getRefleksiY(){
    double newXawal = this.titikAwal.getAbsis() * -1;
    double newXakhir = this.titikAkhir.getAbsis() * -1;
    return new Garis(new Titik(newXawal, titikAwal.getOrdinat()), new Titik(newXakhir, titikAkhir.getOrdinat()));
  }

  public boolean isTegakLurus(Garis G) {
    // Vektor yang merepresentasikan garis
    double v1x = titikAkhir.getAbsis() - titikAwal.getAbsis();
    double v1y = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
    double v2x = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
    double v2y = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();

    // Produk titik dari kedua vektor
    double dotProduct = v1x * v2x + v1y * v2y;

    // Jika produk titik adalah 0, maka garis tegak lurus
    return dotProduct == 0;
}
}
