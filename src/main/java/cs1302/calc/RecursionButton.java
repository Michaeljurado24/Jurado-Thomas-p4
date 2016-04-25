package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.beans.property.SimpleBooleanProperty;

import javafx.scene.control.Label;

/**
 * 
 * @author Michael Jurado
 *
 */
public class RecursionButton extends Button{
	/**
	 * 
	 * The Recursion Button extends the Button class. This Button takes in a SimpleBooleanProperty and two doubles and has a predefined color and dimensions.
	 * These three parameters are used in the lambda expression found in the setOnAction method of the button.
	 * 
	 * If the button is clicked the program runs through and if-else statement to check if the the value of the SimpleBoolean
	 * has been changed from true to false. If true, the calculator switches to using its recursive methods for calculations.
	 * If false the calculator continue to use generic iterative expressions.
	 * 
	 * @param useRecursion
	 * @param x
	 * @param y
	 */
	public RecursionButton(SimpleBooleanProperty useRecursion, double x, double y ) {
		super("Use Recursion");
		this.setOnAction( event -> {

		if (useRecursion.get()){
			useRecursion.set(false);
		}
		else{
			useRecursion.set(true);
		}
	});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #8080ff"); 
	}
	


	
}
