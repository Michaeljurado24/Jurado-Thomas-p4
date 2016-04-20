package cs1302.calc;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import javafx.event.Event;

public class calcButton extends Button{
	private String symbol;

	public calcButton(Text text, String symbol,Color color, int x, int y ) {
		super(symbol);
		this.setBackground(new Background( new BackgroundFill(Color.GREY, null, null) ) );
		this.symbol = symbol;
		this.setPrefSize(x,y);
	}
	public void setOnAction(Event event){
		System.out.println("pretend i modify some text");
	}

	//setOnAction will modify the text
	
}
