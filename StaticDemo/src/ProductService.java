public class ProductService {
    public void add(Product product) {
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)) {
            System.out.println("Eklendi.");
        } else {
            System.out.println("eklenemedi");
        }

    }
}
