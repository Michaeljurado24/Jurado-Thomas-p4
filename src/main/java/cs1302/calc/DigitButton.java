package cs1302.calc;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javafx.scene.control.Label;
public class DigitButton extends Button{
	public DigitButton(Label text, String symbol,double x, double y ) {
		super(symbol);
		this.setOnAction( event -> {
			String oldText = text.getText();
			String newText = oldText+ symbol;
			text.setText(newText);
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #4d4d4d");
	}
	

	//setOnAction will modify the text
	
}
