package bussines.concretes;

import bussines.abstracts.ValidationService;
import entities.concretes.Gamer;

public class ValidationManager implements ValidationService {

	@Override
	public boolean checkGamer(Gamer gamer) {
		if (gamer.getPassword().length()>=6 && gamer.getFirstName()=="seyfo" && gamer.getEmail()=="skara@outlook.com") {
			return true;
		}
		return false;
	}

}
