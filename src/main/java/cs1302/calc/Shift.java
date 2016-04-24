package cs1302.calc;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javafx.beans.property.SimpleIntegerProperty;
public class Shift extends Button{
	public Shift(boolean leftDirection, SimpleIntegerProperty index, double x, double y ) {
		super("");
		if (leftDirection){
			this.setText("<<");
		}
		else{
			this.setText(">>");
		}
		this.setOnAction( event -> {

			int current = index.get();
			if (leftDirection){
				if (!(current == 0)){
					index.set(current - 1);
				} //if 

			} // if
			else{
				index.set(current+1);
			} // else

		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #4d4d4d");
	}
	

	//setOnAction will modify the text
	
}
