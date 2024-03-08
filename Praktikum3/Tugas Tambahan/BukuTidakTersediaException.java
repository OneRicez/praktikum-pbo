/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Exception untuk mengecek apakah buku tersedia
 */

public class BukuTidakTersediaException extends Exception{
  public BukuTidakTersediaException(String message) {
    super(message);
  }
}
