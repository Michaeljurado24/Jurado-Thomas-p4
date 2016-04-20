import javafx.application.Application;
import javafx.scene.control.Button;

public class calcButton extends Button{
	private String symbol;

	public calcButton(String symbol) {
		super(symbol);
		this.symbol = symbol;
		this.setPrefSize(100,5);
	}
	public static void main(String[] args) {
	}
}
