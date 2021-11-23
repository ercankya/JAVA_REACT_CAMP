import Adapters.MernisServiceAdapter;
import Service.BaseCustomerService;
import Service.StarbucksCustomerService;
import model.Customer;

import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args)throws NumberFormatException, RemoteException {
        BaseCustomerService customerService = new StarbucksCustomerService(new MernisServiceAdapter());
        customerService.save(new Customer(2,"ERCAN","KAYA",1993,"27133577162"));
    }
}
