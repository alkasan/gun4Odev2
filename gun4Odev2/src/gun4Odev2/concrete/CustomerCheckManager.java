package gun4Odev2.concrete;

import gun4Odev2.abstracts.ICustomerCheckService;
import gun4Odev2.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
	
	
}
