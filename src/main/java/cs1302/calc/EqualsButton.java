package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.SimpleBooleanProperty;

public class EqualsButton extends Button{
	
	public EqualsButton(Label output,SimpleBooleanProperty useRecursion,double width, double height){
		super("="); /* Calls the constructor of the Button parent class and gives it a String input to label the button with. */
		this.setOnAction( event -> {
			/*method calls go here */
			if (useRecursion.get()){
				/*call reecursive methods */
			}
			else{
				//*call iteratiive or whateever */
			}
			output.setText("result");
		});

		this.setPrefSize(width,height);
		this.setStyle("-fx-base: #53c653");
	}
}
