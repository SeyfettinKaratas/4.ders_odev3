package bussines.concretes;

import bussines.abstracts.GamerService;
import bussines.abstracts.ValidationService;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {
	private ValidationService validationService;

	public GamerManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Gamer gamer) {
		
		
		if(validationService.checkGamer(gamer)) {
			System.out.println(gamer.getFirstName()+" Oyuncu eklendi");
		}
		else {
			System.out.println("Böyle bir mahlukat bulunamadý.!!");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu gücellendi");
		
	}

}
