package application.view;



import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;




public class ControladorFX {
	
	@FXML
	public Button boton;

	public void initialize() {
		boton.setTooltip(new Tooltip("Press it!"));
		
		sendStage();			
	}
	
	private Stage stage;
	
	private void sendStage() {
		try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("GetMe.fxml"));
	        AnchorPane mypane = (AnchorPane) loader.load();
	        Scene scene= new Scene(mypane);
	        stage = new Stage();
	        stage.setTitle("Descubre el botón para salir");
	        stage.setScene(scene);
	        stage.show();
	          
	    } catch (IOException e) {
	        
	    }
	}

	
	
}