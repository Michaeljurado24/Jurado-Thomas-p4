package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


import javafx.beans.property.SimpleIntegerProperty;
/**
 * 
 * @author Michael Jurado
 *
 */
public class ClearButton extends Button{
		/**
		 * 
		 * The ClearButton extends the button class to create a new button who's label, width, height, and color are predefined.
		 *  Everytime the button is clicked the contents of the Label called input is completely cleared.
		 *  
		 * @param input
		 * @param x
		 * @param y
		 */
		public ClearButton(Label input, double x, double y) {
			super("X");
			this.setOnAction( event -> {
					input.setText("");
					//index.set(0);
			});
			this.setPrefSize(x, y);
			this.setStyle("-fx-base: #ff751a");
		}
}
