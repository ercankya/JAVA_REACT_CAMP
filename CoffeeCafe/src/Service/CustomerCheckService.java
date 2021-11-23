package Service;

import Abstuct.ICustomerCheckService;
import model.Customer;

public class CustomerCheckService implements ICustomerCheckService {

    @Override
    public boolean checkifRealPerson(Customer customer) {
        return true;
    }
}
