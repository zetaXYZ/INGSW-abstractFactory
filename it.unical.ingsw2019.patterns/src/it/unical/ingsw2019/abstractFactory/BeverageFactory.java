package it.unical.ingsw2019.abstractFactory;

//Estendendo AbstractFactory posso generare oggetti di classe specifica in base al tipo fornito (Coffee or Beverage)


public class BeverageFactory extends AbstractFactory {
	
	@Override
	public Articles getArticles(String articlesType){ 

		if(articlesType == null){
			return null;
		}    

		if(articlesType.equalsIgnoreCase("HOTCHOC")){
			return new HotChocolate();

		}else if(articlesType.equalsIgnoreCase("TEA")){
			return new Tea();

		}
		
		return null;
	}

}