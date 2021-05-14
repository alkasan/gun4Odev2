package gun4Odev2.adapter;

import java.rmi.RemoteException;

import gun4Odev2.abstracts.ICustomerCheckService;
import gun4Odev2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(),customer.getDateOFBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		}
	}
