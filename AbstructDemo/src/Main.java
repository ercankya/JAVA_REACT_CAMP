public class Main {

    public static void main(String[] args) {
	CustomerService service=new CustomerService();
    service.database=new MySqlDBService();
    service.getCustomer();
    }
}
