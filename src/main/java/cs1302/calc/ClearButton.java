package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


import javafx.beans.property.SimpleIntegerProperty;
public class ClearButton extends Button{

		public ClearButton(SimpleIntegerProperty index, Label input, double x, double y) {
			super("X");
			this.setOnAction( event -> {
					input.setText("");
					index.set(0);
			});
			this.setPrefSize(x, y);
			this.setStyle("-fx-base: #ff751a");
		}
}
