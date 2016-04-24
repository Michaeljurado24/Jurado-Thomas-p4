package cs1302.calc;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Label;
public class BinaryButton extends Button{
	private SimpleBooleanProperty status = new SimpleBooleanProperty(true);
	
	public BinaryButton(Label result,Label outputInBinary, Text counter, String symbol,double x, double y, SimpleBooleanProperty status) {
		super(symbol);
		
		this.setOnAction( event -> {
			if(status.get() == true){
				status.set(false);	
			}
			else{
				status.set(true);
			}
			
			outputInBinary.setVisible(status.get());
			counter.setVisible(status.get());
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #8080ff");
	}
	

	//setOnAction will modify the text
	
}
