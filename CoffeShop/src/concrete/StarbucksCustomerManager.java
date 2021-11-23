package concrete;

import abstruct.CustomerCheckService;
import entities.Customer;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws NumberFormatException, RemoteException {
        try {
            if(customerCheckService.checkifRealPerson(customer)) {
                super.save(customer);
            }else {
                System.out.println("Not a valid person");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
