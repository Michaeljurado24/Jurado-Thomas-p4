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
import javafx.beans.property.SimpleStringProperty;


public class EqualsButton extends Button{
	
	/* Theory: Saving a reference to a object that is a subclass of the class of the reference variable blocks you from using methods of the object created in the object class file. 
	 * This is correct, after switching the ref var of outputInBinary from Label to OutputInBinaryLabel, I was granted access to the method getMainString()*/

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
	public EqualsButton(Label input, Label output, OutputInBinaryLabel outputInBinary, SimpleBooleanProperty useRecursion){
		super("="); /* Calls the constructor of the Button parent class and gives it a String input to label the button with. */
		this.setOnAction( event -> {
			
			/* I instantiated infix and postFix here to give them a wide enough scope to be used inside the for-loop and outside of it. */
			// String[] infix;
			// String[] postFix;
			

			// /*Converts inputLabel to StringList*/
			// if(input.getText().contains("<<")){ // delete << from the expression replaces it with a letter to serve as a place holder. the string is then turned into a array. The array is searched for the letter. Once the letter is found it's replaced with the << symbol.
			// 	String inputModified = input.getText().replace("<<", "A");
			// 	infix = inputModified.split("");
				
			// 	/* for loop to search through array, find "A", and replace it with "<<". */
			// 	for(int q = 0; q < infix.length; q++){
			// 		if( infix[q].equalsIgnoreCase("A") ){ /* Personal Reminder: .equals() that's called on a String and takes in a String is the only way to compare the value of two strings. String == String does not work. */
			// 			infix[q] = "<<";
			// 			break;
			// 		}
			// 	}
				
			// }
			// else{
			
			// infix = input.getText().split(""); 
			// }


			String infixString = this.getInfixText(input.getText().replace(">>", "A").replace("<<", "B") );
			infixString = infixString.replace("A", ">>").replace("B", "<<");
			System.out.println("Infec string" + infixString);

			String[] infix = infixString.split(" "); //thank god this works
			String[] postFix = ReversePolishNotation.infixToPostfix(infix);
			
			// thank god this works
			
			/*
			 *  Jarrad: This splits the expression where ever a "" is located. 
			 * Sadly this is a problem. We have two operands that consist of two symbols << and >>. 
			 * This the current set up splits these symbols in half and leads the custom error MalformedPostfixException
			 *  being thrown by the ReversePolishNotation class. This is why I made the following changes.
			 *  */
			
			postFix = ReversePolishNotation.infixToPostfix(infix);
			
			// for(String i: infix){
			// 	System.out.println("infx"+infix);
			// }
			// for(String p: postFix){
			// 	System.out.println("postfix"+p);
			// }
			System.out.println("useRecursion: " + useRecursion.get());
			/*method calls go here */
			int result;
			if (useRecursion.get() == true){
				/*call reecursive methods */

				result = ReversePolishNotation.evaluate( new RecursiveMath(),postFix);


			}
			else{
				//*call iteratiive or whateever */
				result = ReversePolishNotation.evaluate( new IterativeMath(),postFix);
			}
			output.setText(""+result);
			
			String resultAsBinaryString = EqualsButton.binaryConversion(result); /* converts the integer into binary */
			 /* substracts a certain number of zeros from the string used by the Label outputInBinary and plugs in the binary value of result in. This should bring the length of the string by to 64. */
			
			EqualsButton.newStringForBinaryLabel(resultAsBinaryString, outputInBinary);
		
		});

		this.setPrefSize(108.5,50);
		this.setStyle("-fx-base: #53c653");
	}
	
    static String binaryConversion( int i){
    	return Integer.toBinaryString(i);
    }
    
    /* Takes the string of 64 zeros subtracts off the number of zeros equal to the length of the binary number just calculated. 
     * What's left of the String zeros is concatenated with the String mod to make a new string newString.*/
    static void newStringForBinaryLabel(String mod, OutputInBinaryLabel binaryLabel){
    	String zeros = "0000000000000000000000000000000000000000000000000000000000000000";
    	String partOfOld = zeros.substring(0, (zeros.length() - mod.length()) );
    	
    	String newString = partOfOld + mod;
    	binaryLabel.changeMain( newString);
    	
    }
}