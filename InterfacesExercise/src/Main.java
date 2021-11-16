public class Main {

    public static void main(String[] args) {
	    ICustomerDal customerDal=new MySqlCustomerDal();
	    customerDal.add();
	    CustomerService customerService=new CustomerService(new OracleCustomerDal());
	    customerService.add();
    }
}
