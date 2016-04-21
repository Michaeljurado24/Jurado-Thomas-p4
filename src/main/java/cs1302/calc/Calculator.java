package cs1302.calc;

//class imports
import cs1302.calc.DigitButton;
import cs1302.calc.InputLabel;
import cs1302.calc.ClearButton;
import cs1302.calc.EqualsButton;

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
	private InputLabel output;
	//
	private final double WIDTH = 700;
	private final double HEIGHT = 30;
	private final double BUTTONHEIGHT = 5;
	private final double BUTTONWIDTH = 100;


	public void setFormat(){
		this.setVgap(20);
		this.setHgap(10);
		this.setPadding(new Insets(10,10,10,10) );
		this.setPrefWrapLength(WIDTH);
	} // setFormat

 
	//constructo
	public Calculator(){
		super(Orientation.HORIZONTAL);

		//attrivute instantiation
		input = new InputLabel(WIDTH);//starts out blank
		output = new InputLabel(WIDTH);
		//formating
		this.setFormat();

		//Digit Buttons
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
		EqualsButton equals = new EqualsButton(input, output, BUTTONWIDTH, BUTTONHEIGHT);
		this.getChildren().addAll(
		  						input,
		  						output,
				numButtons[7], numButtons[8], numButtons[9], div, fac, clear,
				numButtons[4], numButtons[5], numButtons[6], mul, pow, left, right,
				numButtons[1], numButtons[2], numButtons[3], minus,
				numButtons[0], equals
		);
		
	}
}