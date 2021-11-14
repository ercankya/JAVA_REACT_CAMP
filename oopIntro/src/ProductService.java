public class ProductService {
    public void addToCart(Product product){
        System.out.println(product.getName()+" Sepete Eklendi.");
    }
    public void deleteFromCart(Product product){
        System.out.println(product.getName()+ " Sepetten Çıkarıldı.");
    }
    public void updateCart(Product product){
        System.out.println("Sepet Güncellendi.");
    }
}
