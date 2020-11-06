import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        GridPane root = new GridPane();

        VBox vbox = new VBox(10);

        Button[] numbers = new Button[4];

        numbers[0] = new Button("0");
        numbers[0].setPrefSize(50, 50);
        numbers[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("0");
            }
        });

        numbers[1] = new Button("1");
        numbers[1].setPrefSize(50, 50);
        numbers[1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("1");
            }
        });

        numbers[2] = new Button("2");
        numbers[2].setPrefSize(50, 50);
        numbers[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("2");
            }
        });

        numbers[3] = new Button("3");
        numbers[3].setPrefSize(50, 50);
        numbers[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("3");
            }
        });

        vbox.getChildren().addAll(numbers);

        root.getChildren().add(vbox);

        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();


    }
}

