package cs1302.calc;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javafx.scene.control.Label;
import javafx.beans.property.SimpleIntegerProperty;
public class DigitButton extends Button{
	public DigitButton( SimpleIntegerProperty index, Label text, String symbol,double x, double y ) {
		super(symbol);
		this.setOnAction( event -> {
			int currentIndex = index.get();
			System.out.println("currentIndex: " + currentIndex);
			String oldText = text.getText();

			String leftText = oldText.substring(0, currentIndex) + symbol;
			String rightText = oldText.substring(currentIndex, oldText.length());
			String newText = leftText + rightText;
			text.setText(newText);
			index.set(currentIndex+1);
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #4d4d4d");
	}
	

	//setOnAction will modify the text
	
}
