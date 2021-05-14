package gun4Odev2;

  

import gun4Odev2.abstracts.BaseCustomerManager;
import gun4Odev2.concrete.NeroCustomerManager;
import gun4Odev2.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"ESRA", "ALKASAN",1999, "12345678"));
		
	}

}
