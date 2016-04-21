package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BackspaceButton extends Button{
	
	public BackspaceButton(Label input, double width, double height){
		super("<");
		this.setOnAction( event -> {
			String oldText = input.getText();
			/*method calls go here */
			if (oldText.length() > 0){
				String newText = oldText.substring(0,oldText.length()-1);
				input.setText(newText);
			}
		});

		this.setPrefSize(width,height);		
	}
}
