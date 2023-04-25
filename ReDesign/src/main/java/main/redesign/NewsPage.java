package main.redesign;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NewsPage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //COPIED SELIM'S CODE FOR STYLING/PROOF OF CONCEPT *********************

        BorderPane root = new BorderPane();
        HBox navbar = new HBox();
        navbar.setPadding(new Insets(20, 40, 20, 20));
        navbar.setSpacing(10);
        navbar.setStyle("-fx-background-color: #c8cbcc;");

        // CHANGE NAME WITH PICTURE OF LOGO ***************************************

        //Image image = new Image("file:/Users/hamzah/school/pictures/BH.png");
        Image image = new Image("file:/Users/hamzah/school/pictures/BH.png");
        ImageView companyName = new ImageView(image);
        /*Label companyName = new Label("BERKSHIRE HATHAWAY");
        companyName.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");*/
        navbar.getChildren().add(companyName);

        // Create region node to push navbar items to the right
        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        // Create navbar items on the right of the navbar
        HBox navbarItems = new HBox();
        navbarItems.setSpacing(20);
        navbarItems.setAlignment(Pos.CENTER_RIGHT);
        Label news = new Label("News");
        news.setStyle("-fx-text-fill: white;");
        Label reports = new Label("Reports");
        reports.setStyle("-fx-text-fill: white;");
        Label letters = new Label("Letters");
        letters.setStyle("-fx-text-fill: white;");
        Label subsidiaries = new Label("Subsidiaries");
        subsidiaries.setStyle("-fx-text-fill: white;");
        Label about = new Label("About");
        about.setStyle("-fx-text-fill: white;");
        Label emptyLabel = new Label("");
        emptyLabel.setStyle("-fx-text-fill: white;");
        navbarItems.getChildren().addAll(news, reports, letters, subsidiaries, about, emptyLabel);

        // Add region node and navbar items to navbar
        navbar.getChildren().addAll(region, navbarItems);

        root.setTop(navbar);

        //CODE TO SWITCH BETWEEN TABS **********************************
        Label home = new Label("HOME PAGE");
        root.setCenter(home);

        companyName.setOnMouseClicked(event -> {
            root.setCenter(home);
        });
        news.setOnMouseClicked(event -> {
            Label n = new Label("NEWS");
            root.setCenter(n);
        });
        reports.setOnMouseClicked(event -> {
            Label r = new Label("REPORTS");
            root.setCenter(r);
        });
        letters.setOnMouseClicked(event -> {
            Label l = new Label("LETTERS");
            root.setCenter(l);
        });
        subsidiaries.setOnMouseClicked(event -> {
            Label s = new Label("SUBSIDIARIES");
            root.setCenter(s);
        });
        about.setOnMouseClicked(event -> {
            Label a = new Label("ABOUT");
            root.setCenter(a);
        });

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
