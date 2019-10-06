
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FxShapes extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setHgap(12);
        root.setVgap(50);
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 500, 500);
        
        Circle circle = getCircle();
        Rectangle rect = getRectangle();
        
        GridPane.setHalignment(circle, HPos.LEFT);
        GridPane.setValignment(rect, VPos.TOP);
        
        root.addRow(0, getRectangle(),getEllipse());
        root.addRow(1, getCircle(),getPolygon());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Java FX shapes");
        primaryStage.show();
    }

    public Rectangle getRectangle() {
        Rectangle rect = new Rectangle(); // Create object of Rectangle
        rect.setX(20); // X Position of Ellipse
        rect.setY(20); // Y Position of Ellipse
        rect.setWidth(100); // Width of Rectangle
        rect.setHeight(100); // Height of Rectangle
        rect.setArcHeight(35); // Arc Height of Rectangle
        rect.setArcWidth(35); // Arc Width of Rectangle
        rect.setFill(Color.valueOf("#a1291e")); // hex color value for Rectangle
        
        return rect;
    }

    public Ellipse getEllipse() {
        Ellipse elipse = new Ellipse(); // Create object of Ellipse
        elipse.setCenterX(100); // X Position of Ellipse
        elipse.setCenterY(100); // Y Position of Ellipse
        elipse.setRadiusX(50); // X Radius of Ellipse
        elipse.setRadiusY(80); // Y Radius of Ellipse
        elipse.setFill(Color.valueOf("#685e5d")); // hex color value for Ellipse
        
        return elipse;
    }

    public Circle getCircle() {
        Circle circle = new Circle(); // Create object of JavaFX Circle
        circle.setCenterX(200); // X Position of circle
        circle.setCenterY(200); // Y Position of circle
        circle.setRadius(100); // Radius of circle
        circle.setFill(Color.valueOf("#685e5d")); // hex color value for circle
        
        return circle;
    }

    public Polygon getPolygon() {
        Polygon polygon = new Polygon(); // Create object of Polygon
        polygon.setFill(Color.valueOf("#a1291e")); // background color of Polygon
        polygon.getPoints().addAll(new Double[]{ // Points for Polygon, there can more points
            0.0, 0.0,
            100.0, 200.0,
            200.0, 100.0});
        
        return polygon;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
