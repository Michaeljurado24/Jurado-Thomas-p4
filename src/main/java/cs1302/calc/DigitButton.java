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
public class DigitButton extends Button{
	public DigitButton(Label text, String symbol,double x, double y ) {
		super(symbol);
		//this.setBackground(new Background( new BackgroundFill(Color.BLACK, null, null) ) );
		this.setOnAction( event -> {
			System.out.println("made it this far;");
			text.setText(symbol);
		});

		this.setPrefSize(x,y);
	}
	

	//setOnAction will modify the text
	
}
