package cs1302.calc;

//import javafx.scene.control
import javafx.scene.control.Label;
import javafx.scene.text.Font;
/**
 * 
 * @author Michael Jurado
 *
 */
public class InputLabel extends Label{

	/**
	 * 
	 * * The InputLabel extends the Label class to create a new Label who's label, font size, and  width are predefined.
	 *  
	 * 
	 * @param width
	 */
	public InputLabel(double width){
			super("");
			this.setPrefWidth(width);
			this.setFont(new Font(40));
	}
}
