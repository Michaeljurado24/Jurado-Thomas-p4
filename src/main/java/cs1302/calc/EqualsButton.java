package cs1302.calc;

//class imports
import cs1302.calc.ReversePolishNotation;

//Math Imports
	/*Recursive*/
		import cs1302.calc.RecursiveMath;
	/*Iterative*/
		import cs1302.calc.IterativeMath;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.SimpleBooleanProperty;

public class EqualsButton extends Button{
	

	public EqualsButton(Label input, Label output,SimpleBooleanProperty useRecursion){
		super("="); /* Calls the constructor of the Button parent class and gives it a String input to label the button with. */
		this.setOnAction( event -> {
			/*Converts inputLabel to StringList*/
			String[] infix = input.getText().split(""); //thank god this works
			String[] postFix = ReversePolishNotation.infixToPostfix(infix);
			// for(String i: infix){
			// 	System.out.println("infx"+infix);
			// }
			// for(String p: postFix){
			// 	System.out.println("postfix"+p);
			// }
			System.out.println("useRecursion: " + useRecursion.get());
			/*method calls go here */
			int result;
			if (useRecursion.get()){
				/*call reecursive methods */
				result = ReversePolishNotation.evaluate( new RecursiveMath(),postFix);


			}
			else{
				//*call iteratiive or whateever */
				result = ReversePolishNotation.evaluate( new IterativeMath(),postFix);
			}
			output.setText(""+result);
		});

		this.setPrefSize(108.5,50);
		this.setStyle("-fx-base: #53c653");
	}
}
