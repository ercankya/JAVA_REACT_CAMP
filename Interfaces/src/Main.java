import interfaces.*;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers={new SmsLogger(),new FileLogger(),new DBLogger(),new EmailLogger()};
        CustomerService customerService=new CustomerService(loggers);
        Customer customer=new Customer(1,"Engin","Demiroğ");
        customerService.add(customer);
    }
}
