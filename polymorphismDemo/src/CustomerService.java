public class CustomerService {
    private BaseLogger logger;
    public CustomerService(BaseLogger logger){
        this.logger=logger;
    }
    public void add(){
        System.out.println("Müsteri eklendi");
        this.logger.log("loglandi.");
    }
}
