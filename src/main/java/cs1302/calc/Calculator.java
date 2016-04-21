package cs1302.calc;

//class imports
import cs1302.calc.DigitButton;
import cs1302.calc.InputLabel;
import cs1302.calc.OutputLabel;
import cs1302.calc.ClearButton;
import cs1302.calc.EqualsButton;
import cs1302.calc.BackspaceButton;
//formating
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;



//attribute imports
import javafx.scene.control.Label;


public class Calculator extends FlowPane{
	//attributes
	private InputLabel input;
	private OutputLabel output;
	private OutputInBinaryLabel outputInBinary;
	
	//Represent the Actual WIdth of the Window
	private final double WIDTH = 400; // Changed from 700 to 400

	//These represent the desired Height and Width of the normal button
	private final double BUTTONHEIGHT = 5;
	private final double BUTTONWIDTH = 50;// Changed from 100 to 50
	
	private FlowPane background;

	//constructor
	public Calculator(){
		super(Orientation.HORIZONTAL);

		//attribute instantiation
		this.setLabels();

		//formating
		this.setFormat();

		//Digit Buttons
		this.addButtons();
		
	}

	public void setFormat(){
		/* Formating for the main FlowPane */
		this.setVgap(20);
		this.setHgap(10);
		this.setPadding(new Insets(10,10,10,10) );
		this.setPrefWrapLength(WIDTH);
		
		/* Formating for the other flow pane that's being used for the background */
		background.setVgap(20);
		background.setHgap(10);
		background.setPadding(new Insets(10,10,10,10) );
		background.setPrefWrapLength(WIDTH+12);
		background.setStyle("-fx-background-color: #ffd9cc");
	} // setFormat

	public void setLabels(){
		input = new InputLabel(WIDTH);
		output = new OutputLabel(WIDTH);
		outputInBinary = new OutputInBinaryLabel(WIDTH);
		background = new FlowPane(Orientation.HORIZONTAL);
	} //set Labels
 
 	public void addButtons(){
		DigitButton[] numButtons = new DigitButton[10];
		for(int i = 0; i< 10; i++) {
			numButtons[i] = new DigitButton(input, Integer.toString(i),BUTTONWIDTH, 
											BUTTONHEIGHT);
		}// CalcButtons

		DigitButton div = new DigitButton(input, "/", BUTTONWIDTH, BUTTONHEIGHT);	
		DigitButton fac = new DigitButton(input, "!", BUTTONWIDTH, BUTTONHEIGHT);
		DigitButton mul = new DigitButton(input, "*", BUTTONWIDTH, BUTTONHEIGHT);
		DigitButton plus = new DigitButton(input, "+", BUTTONWIDTH, BUTTONHEIGHT);
		DigitButton pow = new DigitButton(input, "^", BUTTONWIDTH, BUTTONHEIGHT);
		DigitButton minus = new DigitButton(input, "-", BUTTONWIDTH, BUTTONHEIGHT);
		DigitButton left = new DigitButton(input, "<<", BUTTONWIDTH, BUTTONHEIGHT);
		DigitButton right = new DigitButton(input, ">>", BUTTONWIDTH, BUTTONHEIGHT);

		//special buttons
		ClearButton clear = new ClearButton(input, BUTTONWIDTH, BUTTONHEIGHT);
		EqualsButton equals = new EqualsButton(input, output, (BUTTONWIDTH*2.17), BUTTONHEIGHT);
		BackspaceButton backspace = new BackspaceButton(input, BUTTONWIDTH, BUTTONHEIGHT);
		backspace.setStyle("-fx-base: #ff751a");
		BinaryButton hideBinaryButton = new BinaryButton(output, outputInBinary,"Hide Binary",(BUTTONWIDTH*3.4), BUTTONHEIGHT);
		RecursionButton recursionButton = new RecursionButton("Use Recursion", (BUTTONWIDTH*3.4), BUTTONHEIGHT);
		
		/* Stuffed all the buttons in 'background'. */
		background.getChildren().addAll(
				
					outputInBinary,
				numButtons[7], numButtons[8], numButtons[9], div, fac,backspace, clear,
				numButtons[4], numButtons[5], numButtons[6], mul, pow, left, right,
				numButtons[1], numButtons[2], numButtons[3], minus, recursionButton,
				numButtons[0], equals, plus, hideBinaryButton
				
				);
		
		 /* Main FlowPane collects background as a node now. */
		this.getChildren().addAll(
		  						input,
		  						output,
		  						background
		);
 	}

}