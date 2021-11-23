package Adapters;

import Abstuct.ICustomerCheckService;
import model.Customer;

import java.rmi.RemoteException;


public class MernisServiceAdapter implements ICustomerCheckService {
    AJQKPSPublicSoap kpsPublicSoapProxy = new AJQKPSPublicSoap();

    public boolean checkifRealPerson(Customer customer) throws NumberFormatException, RemoteException {
        boolean result=false;
        try {
             result = kpsPublicSoapProxy.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getDateOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
