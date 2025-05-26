
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label with the text "Hello, World!"
        Label helloWorldLabel = new Label("Hello, World!");

        // Create a layout and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(helloWorldLabel);

        // Create a scene with the layout
        Scene scene = new Scene(root, 300, 200);

        // Set the title of the stage (window)
        primaryStage.setTitle("Hello World JavaFX");

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}


