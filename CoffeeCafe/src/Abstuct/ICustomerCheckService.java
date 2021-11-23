package Abstuct;

import java.rmi.RemoteException;

import model.Customer;

public interface ICustomerCheckService {
    boolean checkifRealPerson(Customer customer) throws NumberFormatException,RemoteException;
}


