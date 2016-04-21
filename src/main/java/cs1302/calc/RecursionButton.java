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
public class RecursionButton extends Button{
	public RecursionButton(/* Button add, Button subtract, Button multiply, Button divide, Button power, Button factorial, */String symbol,double x, double y ) {
		super(symbol);
		//this.setBackground(new Background( new BackgroundFill(Color.BLACK, null, null) ) );
		this.setOnAction( event -> {
		/* When this button is pressed, the add, substract, multiply, divide, power, and factorial button's have
		 * their setOnAction()'s switched to the recursive definition...So I'm guessing this means we might as well
		 * add six Button parameters to the parameter list that way we can recode the buttons in this one lambda expression.*/
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #8080ff"); 
	}
	


	
}
