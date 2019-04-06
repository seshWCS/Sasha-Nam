package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	
	@FXML
	private TextField field;
	
	@FXML
	private Label label;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void printname(ActionEvent event) {
		String aaa = field.getText();
		
		if (aaa == "") {
			label.setText("Hello there");
		}
		else {
			label.setText("Hello "+ aaa);
		}
		
	}

}
