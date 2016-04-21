package cs1302.calc;

//import javafx.scene.control
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class OutputLabel extends Label{

	public OutputLabel(double width){
			super("");
			this.setPrefWidth(width);
			this.setFont(new Font(70));
	}
}