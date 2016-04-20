import javafx.application.Application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.Group;
//custom import
public class testDriver extends Application{
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Used to test calcButton class");
		HBox root = new HBox();
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		calcButton five = new calcButton("5");
		calcButton six = new calcButton("6");
		calcButton seven = new calcButton("7");
		root.getChildren().addAll(five, six, seven);
			
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
