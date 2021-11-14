public class Main {

    public static void main(String[] args) {
	    Product product1=new Product(1,"Lenova V14",1500,"16 GB Ram",10,15500);// referans oluşturma,instance
        product1.setId(1);
        product1.setName("Lenova V14");
        product1.setUnitPrice(11000);
        product1.setDetail("16 GB Ram");
        product1.setDiscount(5);
        Product product2=new Product();// referans oluşturma,instance
        product2.setId(2);
        product2.setName("Lenova V15");
        product2.setUnitPrice(11000);
        product2.setDetail("8 GB Ram");
        product2.setDiscount(10);
        Product product3=new Product();// referans oluşturma,instance
        product3.setId(3);
        product3.setName("Hp 5");
        product3.setUnitPrice(15000);
        product3.setDetail("4 GB Ram");
        product3.setDiscount(20);
        Product product4=new Product();// referans oluşturma,instance
        product4.setId(4);
        product4.setName("ASUS Sonic");
        product4.setUnitPrice(1500);
        product4.setDetail("32 GB Ram");
        product4.setDiscount(10);

        Product[] products={product1,product2,product3,product4};
        for(Product product:products){
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
            System.out.println(product.getUnitPriceAfterDiscount());
        }
        System.out.println(products.length);
        Category category1=new Category(1,"Teknoloji");
        Category category2=new Category(2,"Ev/Bahçe");

        Category[] categories={category1,category2};
        for (Category category:categories){
            System.out.println(category.getName());
        }
        System.out.println(categories.length);


        ProductService productService=new ProductService();
        productService.addToCart(product1);
        productService.deleteFromCart(product2);
        productService.updateCart(product4);
    }
}
