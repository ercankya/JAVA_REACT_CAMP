package Service;

import Abstuct.ICustomerServices;
import model.Customer;

import java.rmi.RemoteException;

public abstract class BaseCustomerService implements ICustomerServices {
    public void save (Customer customer)throws NumberFormatException, RemoteException {
        System.out.println("Saved to db : " + customer.getFirstName()+""+customer.getLastName());
    }
}
