package de.barkei.lightpaint;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LightPaint extends Application {

	@Override
	public void start(final Stage primaryStage) {
		try {
			//FXMLLoader loader = new FXMLLoader(
			//		new URL("file:///C:/Users/u020134/eclipse-workspace/Lightpaint/src/scene/lightpainter.fxml"));
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("lightpainter.fxml"));
			
			Parent parent = (Parent) loader.load();

			Controller controller = loader.getController();

			controller.setStage(primaryStage);
			
			Scene scene = new Scene(parent);
			primaryStage.setTitle("LightPaint Image Resizer");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			System.out.println("Kann fxml Datei nicht laden!");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}