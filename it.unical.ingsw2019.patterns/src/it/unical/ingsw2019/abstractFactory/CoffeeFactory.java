package it.unical.ingsw2019.abstractFactory;

//Estendendo AbstractFactory posso generare oggetti di classe specifica in base al tipo fornito (Coffee or Beverage)

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