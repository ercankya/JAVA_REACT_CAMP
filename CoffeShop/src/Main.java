import adapters.MernisServiceAdapter;
import concrete.BaseCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerService = new StarbucksCustomerManager(new MernisServiceAdapter());
        try {
            customerService.save(new Customer(2,"ERCAN","KAYA",1993,"25252525682"));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
