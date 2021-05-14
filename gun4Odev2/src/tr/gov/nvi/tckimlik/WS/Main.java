package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;


public class Main {

	public static void main(String[] args) throws RemoteException {
	
		boolean result =KPSPublic.TCKimlikDogrula (
				Long.parseLong("56788276144"),
				"ESRA",
				"ALKASAN",
				1999
				);
				
		System.out.println("dogrulama: " + (result ? "baþarýlý" : "baþarýsýz"));		
				
		
		
	}

}
