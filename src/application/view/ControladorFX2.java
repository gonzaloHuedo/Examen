package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControladorFX2 {
	@FXML
	public Button cerrar;
	@FXML
	private void closeStage() {
		Stage stage = (Stage) cerrar.getScene().getWindow();
	    stage.close();
	}
}



