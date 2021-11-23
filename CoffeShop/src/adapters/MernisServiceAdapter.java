package adapters;

import Mernis.MPEKPSPublicSoap;
import abstruct.CustomerCheckService;
import entities.Customer;

import java.rmi.RemoteException;


public class MernisServiceAdapter implements CustomerCheckService {

    MPEKPSPublicSoap mernis=new MPEKPSPublicSoap();

    public boolean checkifRealPerson(Customer customer) throws NumberFormatException, RemoteException {
        boolean result=false;
        try {
             result = mernis.TCKimlikNoDogrula(
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
