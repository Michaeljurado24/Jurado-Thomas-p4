package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.beans.property.SimpleBooleanProperty;

import javafx.scene.control.Label;
public class RecursionButton extends Button{
	public RecursionButton(SimpleBooleanProperty useRecursion, double x, double y ) {
		super("Use Recursion");
		this.setOnAction( event -> {

		if (useRecursion.get()){
			useRecursion.set(false);
		}
		else{
			useRecursion.set(true);
		}
		/* When this button is pressed, the add, substract, multiply, divide, power, and factorial button's have
		 * their setOnAction()'s switched to the recursive definition...So I'm guessing this means we might as well
		 * add six Button parameters to the parameter list that way we can recode the buttons in this one lambda expression.*/

		//Please Read this: no set aactions need to be chhanged. Take a llook at the equuals Buttton and the neew simpleBooleanProperty. 
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #8080ff"); 
	}
	


	
}
