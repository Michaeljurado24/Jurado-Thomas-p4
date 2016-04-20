package cs1302.calc;


import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;

public class calcFrame extends FlowPane{
	//constructor
	public calcFrame(){
		super(Orientation.HORIZONTAL);
		this.setVgap(20);
		this.setHgap(10);
		this.setPadding(new Insets(10,10,10,10) );
		this.setPrefWrapLength(400);
		calcButton[] numButtons = new calcButton[10];
		for(int i = 0; i< 10; i++) {
			numButtons[i] = new calcButton(Integer.toString(i),Color.BLACK, 100, 5  );
		}

		this.getChildren().addAll(  numButtons[7], numButtons[8], numButtons[9],
									numButtons[4], numButtons[5], numButtons[6],
								 	numButtons[1], numButtons[2], numButtons[3]
		);
		
	}
}