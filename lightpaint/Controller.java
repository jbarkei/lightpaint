package de.barkei.lightpaint;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Controller implements Initializable {

	private Stage _stage;

	

	public void setStage(Stage stage) {
		_stage = stage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblOriginalHeight"
	private Label lblOriginalHeight; // Value injected by FXMLLoader

	@FXML // fx:id="lblOriginalWidth"
	private Label lblOriginalWidth; // Value injected by FXMLLoader
	
	@FXML 
	private TextField tbNewHeight;
	
	@FXML
	private TextField tbNewWidth; 
	
	@FXML // fx:id="imageView"
	private ImageView imageView; 

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		imageView.setVisible(false);
	}

	@FXML
	private void menuOpenClick(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Image File");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif", "*.bmp"),
				new ExtensionFilter("All Files", "*.*"));

		File selectedFile = fileChooser.showOpenDialog(_stage);
		if (selectedFile != null) {
			String path = (selectedFile.getAbsoluteFile().toURI().toString());
			Image image = new Image(path);
			
			imageView.setImage(image);
			imageView.setVisible(true); 
		}
		
		//TODO berechnen der neuen breite anhand der höhe in leds und eintragen ins feld
	}

	@FXML
	private void menuCloseClick(ActionEvent event) {
		imageView.setVisible(false); 
	}

	@FXML
	private void menuSaveClick(ActionEvent event) {

	}

	@FXML
	private void menuSaveAsClick(ActionEvent event) {

	}

	@FXML
	private void menuQuitClick(ActionEvent event) {

	}

	@FXML
	private void btnResizeClick(ActionEvent event) {
			//BufferedImage bim = ImageTools.toBufferedImage(imageView.getImage());
	}

}
