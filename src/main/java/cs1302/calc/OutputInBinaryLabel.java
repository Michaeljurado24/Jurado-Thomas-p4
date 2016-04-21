package cs1302.calc;

//import javafx.scene.control
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class OutputInBinaryLabel extends Label{

	public OutputInBinaryLabel(double width){
			super("0000000000000000000000000000000\n000000000000000000000000000000000"); /* Is there a way to get this entire label to show without using this escape character? 
																							If you know then please fix this. */
			this.setPrefWidth(width);
			this.setFont(new Font(20));
	}
}
