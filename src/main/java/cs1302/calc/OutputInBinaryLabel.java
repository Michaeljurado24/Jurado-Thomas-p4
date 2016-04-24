package cs1302.calc;

import javafx.beans.property.SimpleStringProperty;
//import javafx.scene.control
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class OutputInBinaryLabel extends Label{
	
	private SimpleStringProperty mainString ;
	private SimpleStringProperty first ;
	private SimpleStringProperty second ;
	private String forMain;

	
	/* three read/write strings. have two bounded to the main if possible*/
	public OutputInBinaryLabel(String i, double width){
			forMain = i;
			this.setPrefWidth(width);
			this.setFont(new Font(20));
			this.propertyBounding();

			
	}
	
	public void propertyBounding(){
		this.mainString = new SimpleStringProperty(forMain);
		this.first = new SimpleStringProperty(mainString.get().substring( 0, 32) + "\n");
		this.second = new SimpleStringProperty(mainString.get().substring(32, 64)); // [Note on Substrings]: the substring is comprised of the char at the first index and all other chars including the char in the last index.
		
		this.mainString.bind(first);
		this.mainString.bind(second);
		this.setText(first.get() + second.get());
		
	}
	
	public void changeMain( String a){
		this.mainString = new SimpleStringProperty(a);
		this.first = new SimpleStringProperty(mainString.get().substring( 0, 32) + "\n");
		this.second = new SimpleStringProperty(mainString.get().substring(32, 64));
		this.setText(first.get() + second.get());
	}
}
