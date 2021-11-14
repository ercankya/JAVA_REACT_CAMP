public class ProductService {
    public void AddProduct(Product product) {
        System.out.println(product.getName() + " Eklendi");
    }

    public void removeProduct(Product product) {
        System.out.println(product.getName() + " silindi");
    }

    public void updateProduct(Product product) {
        System.out.println(product.getName() + " güncellendi");
    }

    public void listProduct(Product product) {
        System.out.println(product.getName() + " listelendi");
    }
}
