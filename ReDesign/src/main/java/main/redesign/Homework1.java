package main.redesign;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class Homework1 extends Application  {
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CS2450 Homework1");

        Label headerText = new Label("CS2450 Project 1");
        HBox topBox = new HBox(headerText);
        topBox.setAlignment(Pos.TOP_CENTER);
        topBox.setPadding(new Insets(20));

        Button b1 = new Button("Abdul Kalam");
        Button b2 = new Button("Hamza");
        Button b3 = new Button("Junaid");
        Button b4 = new Button("Selim");
        b1.setMinSize(100,50);
        b2.setMinSize(100,50);
        b3.setMinSize(100,50);
        b4.setMinSize(100,50);

        VBox centerBox = new VBox(b1, b2, b3, b4);
        centerBox.setAlignment(Pos.CENTER);
        centerBox.setSpacing(20);
        centerBox.setPadding(new Insets(20));

        Label teamName = new Label("Team Biryani");
        HBox bottomBox = new HBox(teamName);
        bottomBox.setAlignment(Pos.BOTTOM_RIGHT);
        bottomBox.setPadding(new Insets(15));

        VBox root = new VBox();
        root.getChildren().add(topBox);
        root.getChildren().add(centerBox);
        root.getChildren().add(bottomBox);

        Scene scene = new Scene(root,600,400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
