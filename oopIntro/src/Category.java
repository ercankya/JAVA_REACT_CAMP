public class Category {
    private int id;
    private String name;

    public Category() {
        System.out.println("Category contructure oluştu");
    }

    public Category(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
