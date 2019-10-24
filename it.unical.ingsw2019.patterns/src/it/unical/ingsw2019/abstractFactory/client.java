package it.unical.ingsw2019.abstractFactory;

public class client {
	
	public static void main(String[] args) {
		
		int categoria = CategorySelection.getSelection();
		MakeProduct.makeProduct(categoria);
		
	}
}





	
	
	
	



	
	
	
	
	
	
	
	




/*Scanner in = new Scanner(System.in);

System.out.println("Ciao, prendiamoci una pausa, cosa vuoi da bere?");
System.out.println("Digita 1 per caffè o cappuccino");
System.out.println("Digita 2 per bevande calde");

int num = in.nextInt();

int categoria = CategorySelection.getSelection();
MakeProduct.makeProduct(categoria);

if(categoria == 1) {				// se è 1 mi avvalgo della fabbrica dei caffè
	AbstractFactory CoffeeFactory = MakeFactory.getFactory(true);
	System.out.println("Digita: COFFEE per caffè!");
	System.out.println("Digita: CAPPUCCINO per cappuccino!");
	String input = in.next();
	Articles product01 = CoffeeFactory.getArticles(input);
	product01.makeArticles();
}else if(Scanner in = new Scanner(System.in); == 2){				// se è 2 mi avvalgo della fabbrica delle bevande
	AbstractFactory BeverageFactory = MakeFactory.getFactory(false);
	System.out.println("Digita: HOTCHOC per una cioccolata calda!");
	System.out.println("Digita: TEA per cappuccino!");
	String input01 = in.next();
	Articles product03 = BeverageFactory.getArticles(input01);
	product03.makeArticles();
}*/






/*	Articles product01 = CoffeeFactory.getArticles("COFFEE");
product01.makeArticles();
Articles product02 = choice.getArticles("CAPPUCCINO");
product02.makeArticles();
AbstractFactory BeverageFactory = MakeProduct.getFactory(false);
Articles product03 = BeverageFactory.getArticles("HOTCHOCOLATE");
product03.makeArticles();
Articles product04 = BeverageFactory.getArticles("TEA");
product04.makeArticles();*/