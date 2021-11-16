public class ProductValidator {
    public ProductValidator(){
        System.out.println("yapıcı  fonk");
    }

    public static boolean isValid(Product product) {
        if (product.getPrice() > 0 && !product.getName().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
