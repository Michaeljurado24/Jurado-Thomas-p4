package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.SimpleIntegerProperty;
/**
 * 
 * @author Michael Jurado
 *
 */
public class BackspaceButton extends Button{
/**
 *  The BackspaceButton extends the button class to create a new button who's label, width, height, and color are predefined.
 *  Everytime the button is clicked the button adds it unique symbol to the Label used to show the user their input.
 *  
 * @param input
 * @param width
 * @param height
 */
	public BackspaceButton(Label input, double width, double height){
		super("<");
		this.setOnAction( event -> {
			String oldText = input.getText();
			if (oldText == ""){
				//do nothing
			}
			else{
			/*method calls go here */
				String newText = oldText.substring(0, oldText.length()-1);
				input.setText(newText);
			}
		});

		this.setPrefSize(width,height);		
	}
}
