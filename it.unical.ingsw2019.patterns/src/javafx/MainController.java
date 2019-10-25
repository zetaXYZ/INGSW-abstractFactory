package javafx;

import java.awt.Panel;

import javax.swing.JPanel;
import javax.xml.ws.handler.Handler;

import it.unical.ingsw2019.abstractFactory.AbstractFactory;
import it.unical.ingsw2019.abstractFactory.Articles;
import it.unical.ingsw2019.abstractFactory.MakeFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainController implements EventHandler<ActionEvent>{
	
	@FXML
	private Label myLabel;
	
	//al click del mouse sul pulsante si crea una AbstractFactory che poi diventerà una CoffeeFactory
	public void makeCoffee(ActionEvent event) {
		
		AbstractFactory CoffeeFactory = MakeFactory.getFactory(true);
		
		String input = "COFFEE";
		Articles product01 = CoffeeFactory.getArticles(input);
		product01.makeArticles();
		myLabel.setText("Caffè :)");
	}

	public void makeCappuccino(ActionEvent event) {

		AbstractFactory CoffeeFactory = MakeFactory.getFactory(true);

		String input = "CAPPUCCINO";
		Articles product01 = CoffeeFactory.getArticles(input);
		product01.makeArticles();
		myLabel.setText("Cappuccino :)");

	}

	public void makeTea(ActionEvent event) {
		AbstractFactory BeverageFactory = MakeFactory.getFactory(false);

		String input01 = "TEA";
		Articles product01 = BeverageFactory.getArticles(input01);
		product01.makeArticles();
		myLabel.setText("Tea :)");
	}

	public void makeHotChocolate(ActionEvent event) {
		AbstractFactory BeverageFactory = MakeFactory.getFactory(false);

		String input01 = "HOTCHOC";
		Articles product01 = BeverageFactory.getArticles(input01);
		product01.makeArticles();
		myLabel.setText("Cioccolata calda :)");
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

