package cs1302.calc;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.beans.property.SimpleStringProperty;

/*A wise man once said: Use harms and even destroys beauty. The noblest function of an object is to be contemplated.
Miguel de Unamuno*/

public class BinaryPane  extends FlowPane{
	private double WIDTH;

	public BinaryPane(String binaryString, double WIDTH){
		super(Orientation.HORIZONTAL);
		this.WIDTH = WIDTH;

		this.setFormat();
		this.setChildren(binaryString);

	}

	public void setChildren(String binaryString){
		int i = 0;
		int counter = 0;
		VBox[] boxList = new VBox[16];
		int boxIndex = 0;
		while ( i < binaryString.length()) {

			VBox flow = new VBox();
			flow.setPrefWidth(45);
			Label label = new Label("");
			flow.getChildren().add(label);

			int innerIndex = 0;
			String sum = "";
			while (innerIndex < 4){
				if (i >= binaryString.length() ){
					break;
				}
				else{
					sum+= binaryString.substring(i, i+1);
					innerIndex+=1;
					i += 1;
				}
			}// second while

			label.setText(sum);
			boxList[boxIndex] = flow;
			boxIndex++;
			
		} //first while
		Label label1 = new Label("63");
		label1.setTextFill(Color.BLUE);
		boxList[0].getChildren().add(label1);

		Label label2 = new Label("47");
		boxList[4].getChildren().add(label2);
		label2.setTextFill(Color.BLUE);
		
		Label label3 = new Label("    32");
		label3.setTextFill(Color.BLUE);
		boxList[7].getChildren().add(label3);

		Label label4 = new Label("31");
		boxList[8].getChildren().add(label4);
		label4.setTextFill(Color.BLUE);

		Label label5 = new Label("15");
		boxList[12].getChildren().add(label5);
		label5.setTextFill(Color.BLUE);

		Label label6 = new Label("     0");
		boxList[15].getChildren().add(label6);
		label6.setTextFill(Color.BLUE);

		this.getChildren().clear();
		for(VBox box: boxList){
			this.getChildren().add(box);
		}
	}



	public void setFormat(){
		this.setVgap(0);
		this.setHgap(0);
		this.setPadding(new Insets(10,10,10,10) );
		this.setPrefWrapLength(WIDTH);		
	}
}
