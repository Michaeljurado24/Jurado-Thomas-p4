package cs1302.calc;

//class imports
import cs1302.calc.ReversePolishNotation;
import cs1302.calc.BinaryPane;

//Math Imports
	/*Recursive*/
		import cs1302.calc.RecursiveMath;
	/*Iterative*/
		import cs1302.calc.IterativeMath;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 * 
 * @author Michael Jurado
 *
 */

/**
 * 
 * The EqualsButton extends the button class to create a new button who's label, width, height, and color are predefined.
 *  Everytime the button is clicked the string inside of Label input is retrieved and then ran through the .getInfixText() method.
 *  This returnes an array that is then sent through a static method of the ReversePolishNotation class. The ReversePolishNotation method
 *  uses either the IterativeMath or RecursiveMath class to return an answer.
 *  
 * 
 */
public class EqualsButton extends Button{
	
	/* Theory: Saving a reference to a object that is a subclass of the class of the reference variable blocks you from using methods of the object created in the object class file. 
	 * This is correct, after switching the ref var of outputInBinary from Label to OutputInBinaryLabel, I was granted access to the method getMainString()*/
/**
 * 
 * This method takes in a String and then runs it through a loop. This loop returns the string's contents saved under a new String called infix.
 * The variable infix holds the original content of String text in infix notation. This function is used inside of the EqualsButton's setOnAction method.
 * 
 * @param text
 * @return String
 */
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
	
	/**
	 * 
	 * The EqualsButton constructor takes in a BinaryPane object, two Label objects, an OutputInBinaryLabel object, and SimpleBooleanProperty object.
	 * The button's constructor has a predefined label, width, color, and setOnAction method.
	 * When the button is clicked, the contents of the Label input is ran through the getInfixText() method.  The string taken from the input Label is now in
	 * infix notation and saved as the String infixString. infixString is converted into an array of Strings. That array is saved under a unary array called String[] infix.
	 * Another unary String array called String[] postFix is used to save the result of processing the String infixString through the InfixtoPostfix method, a static method 
	 * of the ReversePolishNotation class. 
	 * 
	 * With the the input in postfix notation it is ran through a try catch block. The block checks to see if it should evaluate String[] postFix in using the functions
	 * of the RecursiveMath class or the IterativeMath class. Whichever class that is chosen leads to the same numeric result. That result is then turned into a String 
	 * that String replaces the contents of the Label output. The output Label's content's is displayed to the user.
	 * 
	 * If a user enters two operands behind eachother the lambda expression of the EqualsButton fails to process the input into proper postFix notation.
	 * The message "erOr" is displayed as a response.
	 * 
	 * @param binaryPane
	 * @param input
	 * @param output
	 * @param outputInBinary
	 * @param useRecursion
	 */
	public EqualsButton(BinaryPane binaryPane, Label input, Label output, OutputInBinaryLabel outputInBinary, SimpleBooleanProperty useRecursion){
		super("="); /* Calls the constructor of the Button parent class and gives it a String input to label the button with. */
		this.setOnAction( event -> {
			String infixString = this.getInfixText(input.getText().replace(">>", "A").replace("<<", "B") );
			infixString = infixString.replace("A", ">>").replace("B", "<<");
			

			String[] infix = infixString.split(" "); //thank god this works
			String[] postFix = ReversePolishNotation.infixToPostfix(infix);
			
			
			postFix = ReversePolishNotation.infixToPostfix(infix);
			System.out.println("Postfix: " + infixString);
			String result;
			if (useRecursion.get() == true){
				/*call reecursive methods */
				try{
					result = ""+ ReversePolishNotation.evaluate( new RecursiveMath(),postFix);
				} catch (MalformedPostfixException e){

					result = "ErOr";
				}

			}
			else{
				//*call iteratiive or whateever */
				try{
					result = ""+ ReversePolishNotation.evaluate( new IterativeMath(),postFix);
				} catch (MalformedPostfixException e){
					result = "ErOr";
				}
			}
			output.setText(result);
			if (result.equals("Eror") ){
				//do nothing
			}
			else{
	//		System.out.println(result.parseInt());

			String resultAsBinaryString = EqualsButton.binaryConversion( Integer.parseInt(result) ); /* converts the integer into binary */
			 /* substracts a certain number of zeros from the string used by the Label outputInBinary and plugs in the binary value of result in. This should bring the length of the string by to 64. */
			
			EqualsButton.newStringForBinaryLabel(resultAsBinaryString, outputInBinary, binaryPane);
		}
		
		});

		this.setPrefSize(108.5,50);
		this.setStyle("-fx-base: #53c653");
	}
	/**
	 * 
	 * Takes in a int value i and creates a String containing the value of i in binary using the .toBinaryString() method
	 * of the Integer class. This String is returned by the method.
	 * 
	 * @param int i
	 * @return
	 */
    static String binaryConversion( int i){
    	return Integer.toBinaryString(i);
    }
    
    /**
     * 
     * This method takes in a String object, a OutputInBinaryLabel object, and BinaryPane object. 
     * The method creates a String called zeros. Zeros holds a string of 64 zeros. The String mod holds a string created by the user.
     * 
     * 
     * @param mod
     * @param binaryLabel
     * @param pane
     */
    static void newStringForBinaryLabel(String mod, OutputInBinaryLabel binaryLabel, BinaryPane pane){
    	String zeros = "0000000000000000000000000000000000000000000000000000000000000000";
    	String partOfOld = zeros.substring(0, (zeros.length() - mod.length()) );
    	
    	String newString = partOfOld + mod;
    	pane.setChildren(newString);
    	binaryLabel.changeMain( newString);
    	
    }
}