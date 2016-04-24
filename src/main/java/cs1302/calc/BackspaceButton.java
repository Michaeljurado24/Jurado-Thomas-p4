package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.SimpleIntegerProperty;

public class BackspaceButton extends Button{
	
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
