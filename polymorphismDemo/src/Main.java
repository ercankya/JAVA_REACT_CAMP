public class Main {

    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DBLogger(), new EmailLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Loglandı.");
        }
        CustomerService customerService=new CustomerService(new DBLogger());
        customerService.add();
    }
}
