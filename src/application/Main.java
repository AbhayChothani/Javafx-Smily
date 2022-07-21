package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Rectangle rect = new Rectangle();
			rect.setX(80);
			rect.setY(80);
			rect.setFill(Color.BLANCHEDALMOND);
			rect.setHeight(600);
			rect.setWidth(600);
			rect.setStroke(Color.BLACK);
			rect.setStrokeWidth(5);

			Circle cir1 = new Circle();
			cir1.setCenterX(380);
			cir1.setCenterY(380);
			cir1.setRadius(270);
			cir1.setFill(Color.MAGENTA);
			cir1.setStroke(Color.BLACK);
			cir1.setStrokeWidth(3);

			Circle cir2 = new Circle();
			cir2.setCenterX(280);
			cir2.setCenterY(280);
			cir2.setRadius(45);
			cir2.setFill(Color.BEIGE);
			cir2.setStroke(Color.BLACK);
			cir2.setStrokeWidth(3);
			
			Circle cir5 = new Circle();
			cir5.setCenterX(280);
			cir5.setCenterY(290);
			cir5.setRadius(15);
			cir5.setFill(Color.BLACK);
			cir5.setStroke(Color.BLACK);
			cir5.setStrokeWidth(3);

			Circle cir3 = new Circle();
			cir3.setCenterX(480);
			cir3.setCenterY(280);
			cir3.setRadius(45);
			cir3.setFill(Color.BEIGE);
			cir3.setStroke(Color.BLACK);
			cir3.setStrokeWidth(3);
			
			Circle cir4 = new Circle();
			cir4.setCenterX(480);
			cir4.setCenterY(290);
			cir4.setRadius(15);
			cir4.setFill(Color.BLACK);
			cir4.setStroke(Color.BLACK);
			cir4.setStrokeWidth(3);


			Line line1 = new Line(380, 360, 440, 450);
			line1.setStrokeWidth(3);
			Line line2 = new Line(380, 450, 440, 450);
			line2.setStrokeWidth(3);
			Line line3 = new Line(245,560,285,520);
			line3.setStrokeWidth(3);
			Line line4 = new Line(510,560,480,520);
			line4.setStrokeWidth(3);
					
			Arc mouth = new Arc();
			mouth.setCenterX(380);
			mouth.setCenterY(480);
			mouth.setLength(100);
			mouth.setRadiusX(150);
			mouth.setRadiusY(100);
			mouth.setStartAngle(220);
			mouth.setFill(Color.TRANSPARENT);
			mouth.setStroke(Color.BLACK);
			mouth.setStrokeWidth(3);

			Group root = new Group(rect, cir1, cir2, cir3 , cir4,cir5, line1, line2,line3,line4, mouth);
			BorderPane T = new BorderPane();
			T.setCenter(root);
			Scene scene = new Scene(T, 720, 720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
