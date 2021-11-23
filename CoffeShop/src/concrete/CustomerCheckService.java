package concrete;

import entities.Customer;

public class CustomerCheckService implements abstruct.CustomerCheckService {
    @Override
    public boolean checkifRealPerson(Customer customer) {
        return true;
    }
}
