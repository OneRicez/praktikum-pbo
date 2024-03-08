/*
   Nama: Nashwan Adenaya
   NIM: 24060122130084
 * File: AngkaSialException.java
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 */

public class AngkaSialException extends Exception{
  public AngkaSialException(){
    super("jangan masukan angka 13 karena sial!");
  }
}