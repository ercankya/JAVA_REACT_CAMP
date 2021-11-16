public class Main {

    public static void main(String[] args) {
        ProductService productService=new ProductService();
        Product product=new Product();
        product.setPrice(10);
        product.setName("Mouse");
        productService.add(product);
    }
}
