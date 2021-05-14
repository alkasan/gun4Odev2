package gun4Odev2.concrete;

import gun4Odev2.abstracts.BaseCustomerManager;
import gun4Odev2.abstracts.ICustomerCheckService;
import gun4Odev2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.CheckIfRealPerson(customer))
        {
            System.out.println("Person Checked!");
        }else{
            System.out.println("Not a valid person!");
        }

    }
}
