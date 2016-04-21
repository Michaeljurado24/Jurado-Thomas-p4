package cs1302.calc;

//import javafx.scene.control
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class OutputInBinaryLabel extends Label{

	public OutputInBinaryLabel(double width){
			super("");
			this.setPrefWidth(width);
			this.setFont(new Font(40));
	}
}
