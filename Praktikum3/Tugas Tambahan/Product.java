/* Nama: Nashwan Adenaya
   NIM: 24060122130084
   Deskripsi: Kelas yang berisi program class Product
 */

public class Product {
    private String name;
    private int stock;
    private int price;

    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name != " "){
            this.name = name;
        }
        else{
            assert (name != " "): "String name kosong";
            System.out.println("Nama tidak boleh kosong!");
        }
    }
    public void setStock(int stock) {
        if (stock > 0){
            this.stock = stock;
        }
        else{
            assert (stock > 0): "Stock bukan bilangan positif";
            System.out.println("Stock harus bilangan positif!");
        }
    }

    public void setPrice(int price) {
        if (price > 0){
            this.price = price;
        }
        else{
            assert (price > 0): "Price bukan bilangan positif";
            System.out.println("Price harus bilangan positif!");
        }
    }
     
    public void purchaseProduct(int quantity) {
        if (quantity > 0 && this.stock >= quantity){
            this.stock = this.stock - quantity;
        }
        else{
            if (quantity <= 0){
                assert (quantity > 0): "quantity bukan bilangan positif";
                System.out.println("quantity harus bilangan positif!");
            }
            if (stock < quantity){
                assert (stock >=quantity): "stock tidak mencukupi";
                System.out.println("stock tidak cukup!");
            }
        }
        
    }
    public void addStock(int quantity) {
        if (quantity > 0){
            this.stock += quantity;
        }
        else{
            assert (quantity > 0): "quantity bukan bilangan positif";
            System.out.println("Quantity harus bilangan positif!");
        }
    }

}
