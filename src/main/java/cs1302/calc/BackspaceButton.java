package cs1302.calc;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.SimpleIntegerProperty;

public class BackspaceButton extends Button{
	
	public BackspaceButton(SimpleIntegerProperty index, Label input, double width, double height){
		super("<");
		this.setOnAction( event -> {
			String oldText = input.getText();
			/*method calls go here */
			if (oldText.length() > 0){
				String newText = oldText.substring(0,oldText.length()-1);
				input.setText(newText);
			}


			int currentIndex = index.get();
			if (currentIndex == 0){
				//do nothing
			}
			else{
				index.set(currentIndex-1);
			}
		});

		this.setPrefSize(width,height);		
	}
}
