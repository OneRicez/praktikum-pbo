// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 1/05/2024
// Deskripsi: Kelas yang berisi program class Senjata

package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
}
