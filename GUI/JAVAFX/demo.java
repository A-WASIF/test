
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.IOException;

class HelloEvent implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event){
        System.out.println("Hello World!");
    }
}

public class demo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a label with the text "Hello, JavaFX!"
        Label label = new Label("Hello, JavaFX!");

        // Create a layout pane and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a scene with the layout pane
        Scene scene = new Scene(root, 200, 200);

        // Set the scene for the primary stage
        primaryStage.setTitle("Hello, JavaFX!");
        primaryStage.setScene(scene);

        Button button = new Button("Print");

        button.setOnAction(new HelloEvent());
        button.setOnAction(e -> {
            System.out.println("Heheheheh");
        });

        root.getChildren().add(button);
//        Scene scene1 = new Scene(button, 100, 100);
        primaryStage.setScene(scene);
//        primaryStage.setScene(root.getScene());

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}