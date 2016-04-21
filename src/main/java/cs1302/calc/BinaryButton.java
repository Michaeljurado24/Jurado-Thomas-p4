package cs1302.calc;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Label;
public class BinaryButton extends Button{
	public BinaryButton(Label result,Label outputInBinary, String symbol,double x, double y ) {
		super(symbol);
		
		this.setOnAction( event -> {
		/* Call the binary function on output Label here 
		 * and save the result to the secondary Label ouputInBinary*/
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #8080ff");
	}
	

	//setOnAction will modify the text
	
}
