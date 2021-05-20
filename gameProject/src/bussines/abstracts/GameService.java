package bussines.abstracts;

import entities.concretes.Discount;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface GameService {

	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
	void sell(Game game, Discount discount, Gamer gamer);
}
