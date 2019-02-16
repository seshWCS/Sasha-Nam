package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	
	
	
	@FXML
    private TextField result;

    @FXML
    private TextField login;
    
    @FXML
    private TextField password;
    
    
    
    
    public void buttonpressed(ActionEvent event) {
    	
    	String log = "sasha";
    	String pas = "nam";
    	
    	if(login.getText().equals(log) && password.getText().equals(pas))
    	{
    		result.setText("ok");
    	}
    	else {
    		result.setText("wrong");
    	}
    	
    }

}
