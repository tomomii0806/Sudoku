import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Main extends Application {


	// Declare the class properties
	private Stage stage;
	private Scene scene1;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		stage = primaryStage;
		stage.setTitle("Sudoku home");

	
		Parent root = FXMLLoader.load(getClass().getResource("/tnakamura/Intro.fxml"));
		
		scene1 = new Scene(root, 900, 600); 
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		// TODO: Set scene to be the scene for stage and show the stage
		stage.setScene(scene1);		
		stage.show();
	
	}

	
	// Start the application in the main method
	public static void main(String[] args) {
	    Application.launch(args);
	}

}
