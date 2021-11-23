package Service;

import Abstuct.ICustomerCheckService;
import model.Customer;

import java.rmi.RemoteException;

public class StarbucksCustomerService extends BaseCustomerService {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerService (ICustomerCheckService customerCheckService) {
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
