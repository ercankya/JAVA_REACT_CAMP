package interfaces;

public class CustomerService {
    private Logger[] loggers;

    public CustomerService(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("Müsteri eklendi. "+ customer.getFirstName());
        Utils.runLoggers(loggers,customer.getFirstName());
    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi "+customer.getFirstName());
        Utils.runLoggers(loggers,customer.getFirstName());
    }
}
