public class CustomerService {
    public void add(Customer individualCustomer){
        System.out.println(individualCustomer.getCustomerNumber()+" kaydedildi");
    }
    public void addMultiple(Customer[] customers){
        for (Customer customer:customers){
            add(customer);
        }
    }
}
