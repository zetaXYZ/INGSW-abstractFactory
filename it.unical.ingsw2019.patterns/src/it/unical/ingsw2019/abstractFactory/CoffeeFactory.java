package it.unical.ingsw2019.abstractFactory;

public class CoffeeFactory extends AbstractFactory {
	
	@Override
	public Articles getArticles(String articlesType){

		if(articlesType == null){
			return null;
		}    

		if(articlesType.equalsIgnoreCase("COFFEE")){
			return new Coffee();

		}else if(articlesType.equalsIgnoreCase("CAPPUCCINO")){
			return new Cappuccino();

		}
		return null;
	}
}