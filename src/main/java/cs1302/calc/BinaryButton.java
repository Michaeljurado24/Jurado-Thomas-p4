package cs1302.calc;

import cs1302.calc.BinaryPane;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Label;

/**
 * 
 * @author Michael Jurado
 *
 */
public class BinaryButton extends Button{

	private SimpleBooleanProperty status = new SimpleBooleanProperty(true);
	/**
	 * 
	 * The BinaryButton extends the button class to create a new button who's label, width, height, and color are predefined.
	 *  Every time the button is clicked the button sets the .setVisibility property of the BiaryPane object to false or true.
	 *  
	 * 
	 * @param pane
	 * @param result
	 * @param outputInBinary
	 * @param counter
	 * @param symbol
	 * @param x
	 * @param y
	 * @param status
	 */
	public BinaryButton(BinaryPane pane, Label result, String symbol,double x, double y, SimpleBooleanProperty status) {
		super(symbol);
		
		this.setOnAction( event -> {
			if(status.get() == true){
				status.set(false);	
			}
			else{
				status.set(true);
			}
			
			
			pane.setVisible(status.get());
			
		});

		this.setPrefSize(x,y);
		this.setStyle("-fx-base: #8080ff");
	}
	

	//setOnAction will modify the text
	
}
