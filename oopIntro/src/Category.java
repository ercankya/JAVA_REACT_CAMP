public class Category {
    int id;
    String name;

    public Category() {
        System.out.println("Category contructure oluştu");
    }

    public Category(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }
}
