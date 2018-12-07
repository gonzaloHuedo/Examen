package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class MainFX extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        this.stage=primaryStage;
        mainWindow();
    }

    public void mainWindow(){
        try {

            FXMLLoader loader=new FXMLLoader(MainFX.class.getResource("../view/Profile.fxml"));
            AnchorPane pane=loader.load();
            Scene scene=new Scene(pane);
        scene.getStylesheets().addAll(MainFX.class.getResource("application.css").toExternalForm());

        stage.setTitle("MyView.fxml");
        stage.setScene(scene);
        stage.show();
        Font.loadFont(
				getClass().getResourceAsStream(
						"assets/PoiretOne-Regular.ttf"), 20);
		
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
    



    public static void main(String[] args) {
        launch();
    }
}
