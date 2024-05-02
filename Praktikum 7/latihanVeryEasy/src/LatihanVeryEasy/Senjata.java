// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 1/05/2024
// Deskripsi: Kelas yang berisi program class Senjata

package LatihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak(){
        System.out.println(bunyi);
        peluru--;
        System.out.println("Sisa Peluru: "+ peluru);
    }
}
