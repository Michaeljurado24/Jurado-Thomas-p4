package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClearButton extends Button{

		public ClearButton(Label text, double x, double y) {
			super("X");
			this.setOnAction( event -> {
					text.setText("");
			});
			this.setPrefSize(x, y);
		}
}
