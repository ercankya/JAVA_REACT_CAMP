public class Main {

    public static void main(String[] args) {
        IndividualCustomer engin=new IndividualCustomer();
        engin.setCustomerNumber("123456");
        CorporateCustomer enginCompany=new CorporateCustomer();
        enginCompany.setCustomerNumber("654321");
        enginCompany.setCompanyName("HepsiBurada");
        SendikaCustomer sendikaCustomer=new SendikaCustomer();
        sendikaCustomer.setCustomerNumber("564789");
        CustomerService customerService=new CustomerService();
        customerService.add(engin);
        customerService.add(enginCompany);
        Customer[] customers={engin,enginCompany,sendikaCustomer};
        customerService.addMultiple(customers);
    }
}
