import javafx.application.Application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

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
		Group root = new Group();
		calcFrame frame = new calcFrame();

		root.getChildren().addAll(frame);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
