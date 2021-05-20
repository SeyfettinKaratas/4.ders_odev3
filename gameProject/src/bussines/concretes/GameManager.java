package bussines.concretes;

import bussines.abstracts.GameService;
import entities.concretes.Discount;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi");
		
	}

	@Override
	public void sell(Game game, Discount discount, Gamer gamer) {
		if(gamer.getId()!=0) {
		System.out.println(game.getGameName()+ " oyunu y�zde " + discount.getDiscountRate()+ " indirimle "+gamer.getFirstName()+" taraf�ndan al�nd�.");
			}
		else { 
			System.out.println("paran �oksa bile alaman!!");
		}
	}
}
