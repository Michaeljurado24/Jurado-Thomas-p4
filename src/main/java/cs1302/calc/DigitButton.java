package cs1302.calc;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javafx.scene.control.Label;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * 
 * @author Michael Jurado
 *
 */
public class DigitButton extends Button{
	/**
	 * 
	 * The DigitButton extends the button class and is used  to create a set of new button who's label, width, height, and color are predefined.
	 *  Everytime the button a button is clicked it adds its unique predefined symbol used as its label to the Label called input. Once again, Label
	 *  input displays the user's current input into calculator. 
	 *  
	 * @param text
	 * @param symbol
	 * @param x
	 * @param y
	 */
	public DigitButton( Label text, String symbol,double x, double y ) {
		super(symbol);
		this.setOnAction( event -> {
			String oldText = text.getText();
			String newText = oldText + symbol;
			text.setText(newText);
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #4d4d4d");
	}
	

	//setOnAction will modify the text
	
}
