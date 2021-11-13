public class ProductService {
    public void addToCart(Product product){
        System.out.println(product.name+" Sepete Eklendi.");
    }
    public void deleteFromCart(Product product){
        System.out.println(product.name+ " Sepetten Çıkarıldı.");
    }
    public void updateCart(Product product){
        System.out.println("Sepet Güncellendi.");
    }
}
