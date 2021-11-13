public class Main {

    public static void main(String[] args) {
	    Product product1=new Product(1,"Lenova V14",1500,"16 GB Ram");// referans oluşturma,instance
        Product product2=new Product(2,"Lenova V15",11000,"8 GB Ram");// referans oluşturma,instance
        Product product3=new Product(3,"Hp 5",15000,"4 GB Ram");// referans oluşturma,instance
        Product product4=new Product(4,"ASUS Sonic",1500,"32 GB Ram");// referans oluşturma,instance

        Product[] products={product1,product2,product3,product4};
        for(Product product:products){
            System.out.println(product.name);
        }
        System.out.println(products.length);
        Category category1=new Category(1,"Teknoloji");
        Category category2=new Category(2,"Ev/Bahçe");

        Category[] categories={category1,category2};
        for (Category category:categories){
            System.out.println(category.name);
        }
        System.out.println(categories.length);


        ProductService productService=new ProductService();
        productService.addToCart(product1);
        productService.deleteFromCart(product2);
        productService.updateCart(product4);
    }
}
