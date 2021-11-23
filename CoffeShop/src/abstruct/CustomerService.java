package abstruct;

import entities.Customer;

import java.rmi.RemoteException;

public interface CustomerService{
    void save (Customer customer)throws NumberFormatException, RemoteException;
}
