package javafx;
import java.io.IOException;
import javax.swing.JPanel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DistributoreFX extends Application {

	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));			
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setTitle("Distributore");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public static void main(String[] args) {
			launch(args);
		}	
	}








//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());