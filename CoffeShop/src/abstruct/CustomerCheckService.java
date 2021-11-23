package abstruct;

import entities.Customer;

import java.rmi.RemoteException;

public interface CustomerCheckService {
    boolean checkifRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
