package it.unical.ingsw2019.abstractFactory;

//Creo una classe astratta per ottenere fabbriche per i vari Articles richiesti (Coffee or Beverage)

public abstract class AbstractFactory {
	
	public abstract Articles getArticles(String articlesType);
	
}
