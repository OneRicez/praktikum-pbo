/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Kelas yang berisi program class Main untuk mengaplikasikan Product
 */

public class MProduct {
  public static void main(String[] args) {
    Product produk1 = new Product();
    produk1.setName("Apel");
    produk1.setStock(4);
    produk1.setPrice(299999);

    System.out.println("Product Name: " + produk1.getName());
    System.out.println("Product Stock: " + produk1.getStock());
    System.out.println("Product Price: " + produk1.getPrice());

    produk1.purchaseProduct(5);

    produk1.addStock(2);
    produk1.purchaseProduct(5);
    System.out.println("Product Stock: " + produk1.getStock());
  }
}
