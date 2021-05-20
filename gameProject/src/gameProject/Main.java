package gameProject;

import java.time.LocalDate;

import bussines.abstracts.GameService;
import bussines.concretes.GameManager;
import bussines.concretes.GamerManager;
import bussines.concretes.MernisAdapter;
import bussines.concretes.ValidationManager;
import entities.concretes.Discount;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1,"Küçüðü Kurtarmak",100) ;		
		Game game2 = new Game(2,"Aykan Tyson", 230) ;
		
		
		Gamer gamer1= new Gamer();
		
		gamer1.setId(1);
		gamer1.setFirstName("seyfo");
		gamer1.setLastName("kara");
		gamer1.setNationalIdentity("12345678");
		gamer1.setBirthDate(LocalDate.of(1994,	4, 25));
		gamer1.setEmail("skara@outlook.com");
		gamer1.setPassword("12345678");
		
		Discount discount=new Discount(1,"Küçük günlerine özel","Küçükleri sevindirmek",15);
		
		GamerManager gamerManager=new GamerManager(new MernisAdapter());
		gamerManager.add(gamer1);
		
		GameManager gameManager= new GameManager();
		gameManager.add(game1);
		
		gameManager.sell(game1, discount, gamer1);
		
	}
	
	

}
