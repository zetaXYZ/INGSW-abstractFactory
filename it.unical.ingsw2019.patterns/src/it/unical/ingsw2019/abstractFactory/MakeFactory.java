package it.unical.ingsw2019.abstractFactory;

//Classe che serve ad ottenere fabbriche passando il tipo

public class MakeFactory {
	
	public static AbstractFactory getFactory(boolean coffee){   
		if(coffee){
			return new CoffeeFactory();         
		}else {
			return new BeverageFactory();
		}
	}
}