public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("ASUS Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductService productService=new ProductService();
        productService.AddProduct(product);
        productService.removeProduct(product);
        productService.updateProduct(product);
        productService.listProduct(product);
        System.out.println(product.getName());
    }
}
