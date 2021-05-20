package bussines.concretes;

import java.rmi.RemoteException;

import bussines.abstracts.ValidationService;
import entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements ValidationService {

	@Override
	public boolean checkGamer(Gamer gamer) {
		
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()),gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getBirthDate().getYear());
		} catch (NumberFormatException e) {
			result = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		
		return result;
		
		
	}

}
