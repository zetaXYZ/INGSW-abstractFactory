package it.unical.ingsw2019.abstractFactory;

import java.util.Scanner;

public class CategorySelection {

		public static int getSelection(){
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ciao, prendiamoci una pausa, cosa vuoi da bere?");
		System.out.println("_______________________________________________");
		System.out.println("Digita 1 per caffè o cappuccino");
		System.out.println("Digita 2 per bevande calde");
		System.out.println("_______________________________________________");

		int num = in.nextInt();
		
		System.out.println("_______________________________________________");
		
		return num;
		


	}

}
