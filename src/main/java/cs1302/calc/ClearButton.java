package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClearButton extends Button{

		public ClearButton(Label input, double x, double y) {
			super("X");
			this.setOnAction( event -> {
					input.setText("");
			});
			this.setPrefSize(x, y);
		}
}
