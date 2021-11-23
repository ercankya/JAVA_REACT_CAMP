package concrete;

import abstruct.CustomerService;
import entities.Customer;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerService {
    public void save (Customer customer)throws NumberFormatException, RemoteException {
        System.out.println("Saved to db : " + customer.getFirstName()+""+customer.getLastName());
    }
}
