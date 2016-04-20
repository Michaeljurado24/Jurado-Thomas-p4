import javafx.application.Application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

//flowPane Helper
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.Group;
//custom import
public class testDriver extends Application{
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Used to test calcButton class");
		FlowPane root = new FlowPane(Orientation.HORIZONTAL);
		root.setVgap(20);
		root.setHgap(10);
		root.setPadding(new Insets(10,10,10,10) );
		root.setPrefWrapLength(400);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		calcButton[] numButtons = new calcButton[10];
		for(int i = 0; i< 10; i++) {
			numButtons[i] = new calcButton(Integer.toString(i) );
		}
			
		root.getChildren().addAll(numButtons[7], numButtons[8], numButtons[9],
					numButtons[4], numButtons[5], numButtons[6],
					numButtons[1], numButtons[2], numButtons[3]
					);
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
