public class Main {

    public static void main(String[] args) {
        ProductService productService=new ProductService();
        Product product=new Product();
        product.price=10;
        product.name="Mouse";
        productService.add(product);
    }
}
