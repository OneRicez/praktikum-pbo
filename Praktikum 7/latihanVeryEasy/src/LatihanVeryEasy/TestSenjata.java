// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 1/05/2024
// Deskripsi: Kelas yang berisi program class TestSenjata sebagai driver main

package LatihanVeryEasy;

public class TestSenjata {
    
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru (5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
    
}
