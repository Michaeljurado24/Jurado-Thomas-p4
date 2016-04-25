package cs1302.calc;

//import javafx.scene.control
import javafx.scene.control.Label;
import javafx.scene.text.Font;
/**
 * 
 * @author Michael Jurado
 *
 */
public class OutputLabel extends Label{
	
/**
 * 
 * The OutputLabel extends the Label class and creates a Label with a predefined width and font size.
 * 
 * @param width
 */
	public OutputLabel(double width){
			super("");
			this.setPrefWidth(width);
			this.setFont(new Font(70));
	}
}