package cs1302.calc;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Construction extends Application{

	
private Group firstButtonSet;
private Group secondButtonSet;
private String userInput;
private Integer answer = new Integer(0); // The Integer wrapper is used to guarantee the answer is calculated with the highest pression possible.
private String correctedBinaryNumber;
private String sixtyFour; //= "0000000000000000000000000000000000000000000000000000000000000000";
private SimpleStringProperty answerInBinary; // contains a string within it that's a concatenation of a substring of the sixtyFour and inputAsBinary.
private SimpleStringProperty binaryPart1;
private SimpleStringProperty binaryPart2;
private Text input;
private Text inputAsBinary; // the answer of the input turned into binary
private Text txtAnswer;

/* Number buttons 0 - 9 */
private Button zero = new Button("0");
private Button one = new Button("1");
private Button two = new Button("2");
private Button three = new Button("3");
private Button four = new Button("4");
private Button five = new Button("5");
private Button six = new Button("6");
private Button seven = new Button("7");
private Button eight = new Button("8");
private Button nine = new Button("9");
//-------------------------------

/* Operator buttons and equal button*/
private Button multiply = new Button("*");
private Button divide = new Button("/");
private Button plus = new Button("+");
private Button minus = new Button("-");
private Button factorial = new Button("!");
private Button power = new Button("^");
private Button equal = new Button("   =   ");
//----------------------------

/* Less-than, X-variable, Navigation, Hide, and Recursion Buttons */
private Button lessThan = new Button("<");
private Button xVar = new Button("X");
private Button left = new Button("←");
private Button right = new Button("→");
private Button useRecursion = new Button("Use Recusion");
private Button hideBinary = new Button("  Hide Binary  ");
//----------------------------------

/* container nodes and other variables and objects used for returning the results of the methods found within this class.*/
private VBox allButtons = new VBox(3);
//private FlowPane flow = new FlowPane();
//----------------------------------

	public Construction(){
		Button zero;
		Button one;	
		Button two;	
		Button three;	
		Button four;	
		Button five;	
		Button six;
		Button seven;
		Button eight;	
		Button nine;	
		Button multiply;	
		Button divide;
		Button plus;	
		Button minus;	
		Button factorial;	
		Button power;	
		Button equal;	
		Button lessThan;	
		Button xVar;	
		Button left;
		Button right;	
		Button useRecursion;
		Button hideBinary;
		GridPane firstButtonSet;
		GridPane secondButtonSet;
		String userInput;
		Integer answer;
		String correctedBinaryNumber;
		String sixtyFour = "0000000000000000000000000000000000000000000000000000000000000000";
		SimpleStringProperty answerInBinary = new SimpleStringProperty();
		SimpleStringProperty binaryPart1 = new SimpleStringProperty();
		SimpleStringProperty binarypart2 = new SimpleStringProperty();
/**
 *  Use a FlowPane and one SimpleString for binary rather than two might be more convenient.
 */
//		answerInBinary.bind(binaryPart1);
//		answerInBinary.bind(binaryPart2);
		VBox allButtons;
		Text input = new Text("1*2*3");
		Text inptAsBinary = new Text(sixtyFour.substring(0,sixtyFour.length()-4) + "0110");
		Text txtAnswer = new Text ("6");
	}


	public VBox buttonLayout(){ /* The containers firstButtonSet and secondButtonSet will be returned in a VBox.*/
		firstButtonSet = new Group();
		secondButtonSet = new Group();
	
		
		/* Buttons 6 to 9, multiply, divide, power, factorial, less-than,
		 x variable, navigation buttons, buttons 0 to 3, equal, plus, minus, Use Recursion and Hide Binary resized, organized,
		and placed in the container  firstButonSet*/
		seven.setLayoutX(0);
		seven.setLayoutY(0);
		seven.setScaleX(2);
		seven.setScaleY(2);
		
		eight.setLayoutX(48);
		eight.setLayoutY(0);
		eight.setScaleX(2);
		eight.setScaleY(2);
		
		nine.setLayoutX(96);
		nine.setLayoutY(0);
		nine.setScaleX(2);
		nine.setScaleY(2);
		
		divide.setLayoutX(144);
		divide.setLayoutY(0);
		divide.setScaleX(2);
		divide.setScaleY(2);
		
		factorial.setLayoutX(194);
		factorial.setLayoutY(0);
		factorial.setScaleX(2);
		factorial.setScaleY(2);
		
		lessThan.setLayoutX(247);
		lessThan.setLayoutY(0);
		lessThan.setScaleX(2);
		lessThan.setScaleY(2);
		lessThan.setStyle("-fx-base: #ff8c00");
		
		xVar.setLayoutX(310);
		xVar.setLayoutY(0);
		xVar.setScaleX(2);
		xVar.setScaleY(2);
		xVar.setStyle("-fx-base: #ff8c00");
		
		four.setLayoutX(0);
		four.setLayoutY(60);
		four.setScaleX(2);
		four.setScaleY(2);
		
		five.setLayoutX(48);
		five.setLayoutY(60);
		five.setScaleX(2);
		five.setScaleY(2);
		
		six.setLayoutX(96);
		six.setLayoutY(60);
		six.setScaleX(2);
		six.setScaleY(2);
		
		multiply.setLayoutX(144);
		multiply.setLayoutY(60);
		multiply.setScaleX(2);
		multiply.setScaleY(2);
		
		power.setLayoutX(192);
		power.setLayoutY(60);
		power.setScaleX(2);
		power.setScaleY(2);
		
		left.setLayoutX(246);
		left.setLayoutY(60);
		left.setScaleX(2);
		left.setScaleY(2);
		
		right.setLayoutX(305);
		right.setLayoutY(60);
		right.setScaleX(2);
		right.setScaleY(2);
		
		one.setLayoutX(0);
		one.setLayoutY(120);
		one.setScaleX(2);
		one.setScaleY(2);
		
		two.setLayoutX(48);
		two.setLayoutY(120);
		two.setScaleX(2);
		two.setScaleY(2);
		
		three.setLayoutX(96);
		three.setLayoutY(120);
		three.setScaleX(2);
		three.setScaleY(2);
		
		minus.setLayoutX(144);
		minus.setLayoutY(120);
		minus.setScaleX(2);
		minus.setScaleY(2);
		
		useRecursion.setLayoutX(225);
		useRecursion.setLayoutY(120);
		useRecursion.setScaleX(2);
		useRecursion.setScaleY(2);
		useRecursion.setStyle("-fx-base: #40e0d0");
		
		zero.setLayoutX(0);
		zero.setLayoutY(180);
		zero.setScaleX(2);
		zero.setScaleY(2);
		
		equal.setLayoutX(60);
		equal.setLayoutY(180);
		equal.setScaleX(2);
		equal.setScaleY(2);
		equal.setStyle("-fx-base: #228b22");
		
		plus.setLayoutX(145);
		plus.setLayoutY(180);
		plus.setScaleX(2);
		plus.setScaleY(2);
		
		hideBinary.setLayoutX(230);
		hideBinary.setLayoutY(180);
		hideBinary.setScaleX(2);
		hideBinary.setScaleY(2);
		hideBinary.setStyle("-fx-base: #40e0d0");
		/* Adding the aforementioned buttons to their proper container*/
		firstButtonSet.getChildren().addAll(seven,eight,nine,divide,factorial,lessThan,xVar,four,five,six,multiply,power,left,right,one,two,three,minus,useRecursion,zero,equal,plus,hideBinary);
		//-------------------------------------------
		
		allButtons.getChildren().addAll(firstButtonSet);// Both containers are placed in the VBox allButtons and then returned.
		return allButtons;
		
	}

	public Text getInput(){
	return input;
	}
	
	public Text getInputAsBinary(){
	return inputAsBinary;
	}
	
	public Text getTxtAnswer(){
	return txtAnswer;	
	}
	public static void main(String[] args) {
		Application.launch(args);

	}
	
	public void start( Stage primaryStage){

		primaryStage.setTitle("Programmer's Calculator");
		primaryStage.setOpacity(.9);// By making the stage and window itself slightly transparent, its background and even the nodes inside of it become transparent.
		
		Construction c = new Construction();
	
		Group root = new Group();
		FlowPane flow = new FlowPane();
		
		Rectangle r = new Rectangle(600,150);
		VBox theButtons = new VBox();
		
		theButtons = c.buttonLayout();
		r.setFill(Color.rgb(255, 255, 255, .9));
		
		root.getChildren().addAll(r,theButtons);
		r.setX(0);
		r.setY(0);
		theButtons.setLayoutX(110);
		theButtons.setLayoutY(320);
		Scene s = new Scene(root, 600,600,Color.rgb(190,190,190,.5));
		
		primaryStage.setScene(s);
		primaryStage.show();
		
	}

}
