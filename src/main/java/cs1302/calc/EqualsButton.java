package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EqualsButton extends Button{
	
	public EqualsButton(Label input, Label output, double width, double height){
		super("=");
		this.setOnAction( event -> {
			input.setText("");
			/*method calls go here */

			output.setText("result");
		});

		this.setPrefSize(width,height);		
	}
}
