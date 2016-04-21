package cs1302.calc;

import cs1302.calc.Calculator;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
 
public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main
    
    @Override
    public void start(Stage primaryStage) {

//	Parent root = null;

	// try {
	//     root = FXMLLoader.load(getClass().getResource("/calc.fxml"));
	// } catch (IOException e) {
	//     System.out.println(e);
	//     System.exit(1);
	// } // try

 //        primaryStage.setTitle("CalcFX!");
	// primaryStage.setScene(new Scene(root, 640, 480));
 //        primaryStage.show();

    Calculator root = new Calculator();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
    primaryStage.setResizable(false);


    } // start

} // Driver


