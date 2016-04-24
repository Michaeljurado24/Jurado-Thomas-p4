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
	
	public String getInfixText(String text){

		String infix = ""; //will return this

		int tLength = text.length();

		String temp ="";
		int i = 0; 
	//	while(i< tLength){
		int charValue = 0;
		String newChar = "";
		charValue = 50;
		temp = "";
		while  (i< tLength) {
				charValue = text.charAt(i);
				if ( (charValue <= 57) && (charValue >= 48) && (i< tLength) ){
					infix += text.substring(i, i+1);
				}
				else{
					infix += " " + text.substring(i, i+1) + " ";
				}
				i++;
		}
		return infix;		
	}

	public EqualsButton(Label input, Label output,SimpleBooleanProperty useRecursion){
		super("="); /* Calls the constructor of the Button parent class and gives it a String input to label the button with. */
		this.setOnAction( event -> {
			/*Converts inputLabel to StringList*/
			String infixString = this.getInfixText(input.getText());
			System.out.println("Infec string" + infixString);

			String[] infix = infixString.split(" "); //thank god this works
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
