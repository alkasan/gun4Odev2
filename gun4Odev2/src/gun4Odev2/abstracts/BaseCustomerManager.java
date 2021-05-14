package gun4Odev2.abstracts;

import gun4Odev2.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerServices{


	@Override
	public void save(Customer customer) {
		System.out.println("Save to Database: " +customer.getFirstName());
		
	}

	
}
