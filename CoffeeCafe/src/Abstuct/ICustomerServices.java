package Abstuct;

import model.Customer;

import java.rmi.RemoteException;

public interface ICustomerServices {
    void save (Customer customer)throws NumberFormatException, RemoteException;;
}
