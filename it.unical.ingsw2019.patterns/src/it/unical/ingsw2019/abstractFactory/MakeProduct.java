package it.unical.ingsw2019.abstractFactory;

import java.util.Scanner;

//Uso MakeFactory per ottenere AbstractFactory al fine di ottenere fabbriche di classi concrete passando informazioni come il tipo.


public class MakeProduct {

	static Scanner in = new Scanner(System.in);

	public static void makeProduct(int categoria){

		if(categoria == 1) {											// se è 1 mi avvalgo della fabbrica dei caffè
			AbstractFactory CoffeeFactory = MakeFactory.getFactory(true);
			
			System.out.println("Digita: COFFEE per caffè!");
			System.out.println("Digita: CAPPUCCINO per cappuccino!");
			System.out.println("_______________________________________________");
			
			String input = in.next();
			Articles product01 = CoffeeFactory.getArticles(input);
			product01.makeArticles();

			
		}else if(categoria == 2){										// se è 2 mi avvalgo della fabbrica delle bevande
			AbstractFactory BeverageFactory = MakeFactory.getFactory(false);
			
			System.out.println("Digita: HOTCHOC per una cioccolata calda!");
			System.out.println("Digita: TEA per cappuccino!");
			System.out.println("_______________________________________________");
			
			String input01 = in.next();
			Articles product01 = BeverageFactory.getArticles(input01);
			product01.makeArticles();
		}
	}
}
