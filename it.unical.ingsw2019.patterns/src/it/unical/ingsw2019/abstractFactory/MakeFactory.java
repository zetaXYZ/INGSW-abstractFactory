package it.unical.ingsw2019.abstractFactory;

public class MakeFactory {
	
	public static AbstractFactory getFactory(boolean coffee){   
		if(coffee){
			return new CoffeeFactory();         
		}else {
			return new BeverageFactory();
		}
	}
}