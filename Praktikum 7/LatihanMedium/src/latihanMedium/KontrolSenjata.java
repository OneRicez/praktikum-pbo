// Nama: Nashwan Adenaya
// NIM: 24060122130084
// Tanggal: 1/05/2024
// Deskripsi: Kelas yang berisi program class KontrolSenjata 

package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata S) {
        this.senjata = S;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali" );
        int temp = senjata.getPeluru(); 
        if (temp <= 0){
            System.out.println("Peluru Habis!");
        }
        else{
            for (int i = 0; i < jumlah; i++){
                if (temp > 0){
                    System.out.println(senjata.getBunyi());
                    temp--;
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            if (temp >= 0){
                System.out.println(">> Peluru sisa: "+ (temp));
            }
        }
       
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+ jumPeluru);
    }
}
