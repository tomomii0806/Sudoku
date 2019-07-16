import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Button beginner; 
	@FXML
	private Button elementary; 
	@FXML
	private Button intermediate; 
	@FXML
	private Button advanced; 
	
	
	public void playBeginner(ActionEvent event) {
		
		try {
			
			
			Stage primatyStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = FXMLLoader.load(getClass().getResource("/tnakamura/Play.fxml"));
			
			Scene scene = new Scene(root, 900, 600); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// TODO: Set scene to be the scene for stage and show the stage
			primatyStage.setScene(scene);
			primatyStage.show();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void playElementry(ActionEvent event) {
		
		try {
			
			Stage primatyStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = FXMLLoader.load(getClass().getResource("/tnakamura/Play2.fxml"));
			
			Scene scene = new Scene(root, 900, 600); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// TODO: Set scene to be the scene for stage and show the stage
			primatyStage.setScene(scene);
			primatyStage.show();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void playIntermediate(ActionEvent event) {
		
		try {
			
			Stage primatyStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = FXMLLoader.load(getClass().getResource("/tnakamura/Play3.fxml"));
			
			Scene scene = new Scene(root, 900, 600); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// TODO: Set scene to be the scene for stage and show the stage
			primatyStage.setScene(scene);
			primatyStage.show();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void playAdvanced(ActionEvent event) {
		
		try {
			
			Stage primatyStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = FXMLLoader.load(getClass().getResource("/tnakamura/Play4.fxml"));
			
			Scene scene = new Scene(root, 900, 600); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// TODO: Set scene to be the scene for stage and show the stage
			primatyStage.setScene(scene);
			primatyStage.show();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void handleBtn1(MouseEvent e) {
		beginner.setScaleX(1.3);
		beginner.setScaleY(1.3);
		beginner.setScaleZ(1.3);
	}
	
	public void handleBtn1Exit(MouseEvent e) {
		beginner.setScaleX(1);
		beginner.setScaleY(1);
		beginner.setScaleZ(1);
	}
	public void handleBtn2(MouseEvent e) {
		elementary.setScaleX(1.3);
		elementary.setScaleY(1.3);
		elementary.setScaleZ(1.3);
	}
	
	public void handleBtn2Exit(MouseEvent e) {
		elementary.setScaleX(1);
		elementary.setScaleY(1);
		elementary.setScaleZ(1);
	}
	public void handleBtn3(MouseEvent e) {
		intermediate.setScaleX(1.3);
		intermediate.setScaleY(1.3);
		intermediate.setScaleZ(1.3);
	}
	
	public void handleBtn3Exit(MouseEvent e) {
		intermediate.setScaleX(1);
		intermediate.setScaleY(1);
		intermediate.setScaleZ(1);
	}
	public void handleBtn4(MouseEvent e) {
		advanced.setScaleX(1.3);
		advanced.setScaleY(1.3);
		advanced.setScaleZ(1.3);
	}
	
	public void handleBtn4Exit(MouseEvent e) {
		advanced.setScaleX(1);
		advanced.setScaleY(1);
		advanced.setScaleZ(1);
	}
}
