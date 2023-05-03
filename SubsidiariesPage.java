package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SubsidiariesPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        ScrollPane root = getRoot();

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Subsidiaries!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static ScrollPane getRoot() {
        BorderPane root = new BorderPane();

        // Create navbar at the top
        HBox navbar = new HBox();
        navbar.setPadding(new Insets(20, 40, 20, 20));
        navbar.setSpacing(10);
        navbar.setStyle("-fx-background-color: #363842;");

        // Add company logo to the left of the navbar
        Image image = new Image(HomePage.class.getResourceAsStream("BH.png"));
        ImageView companyName = new ImageView(image);
        companyName.setFitHeight(50);
        companyName.setPreserveRatio(true);
        navbar.getChildren().add(companyName);

        //Home
        companyName.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showHomePage();
            }
        });

        // Create region node to push navbar items to the right
        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        // Create navbar items on the right of the navbar
        HBox navbarItems = new HBox();
        navbarItems.setSpacing(20);
        navbarItems.setAlignment(Pos.CENTER_RIGHT);

        //Navbar Label Event Handlers

        //News
        Label news = new Label("News");
        news.setStyle("-fx-text-fill: white;");
        news.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showNewsPage();
            }

        });

        //Reports
        Label reports = new Label("Reports");
        reports.setStyle("-fx-text-fill: white;");
        reports.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showReportsPage();
            }

        });

        //Letters
        Label letters = new Label("Letters");
        letters.setStyle("-fx-text-fill: white;");
        letters.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showLettersPage();
            }

        });

        //Subsidiaries
        Label subsidiaries = new Label("Subsidiaries");
        subsidiaries.setStyle("-fx-text-fill: white;");
        subsidiaries.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showSubsidiariesPage();
            }

        });

        //About
        Label about = new Label("About");
        about.setStyle("-fx-text-fill: white;");
        about.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showAboutPage();
            }

        });

        //Investors
        Label investors = new Label("Investors");
        investors.setStyle("-fx-text-fill: white;");
        investors.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                MainPage.showInvestorsPage();
            }

        });

        navbarItems.getChildren().addAll(news, reports, letters, subsidiaries, about, investors);

        // Add region node and navbar items to navbar
        navbar.getChildren().addAll(region, navbarItems);

        root.setTop(navbar);

        // Create HBox to hold content on the left half of the section
        HBox leftContent = new HBox();
        leftContent.setSpacing(10);
        leftContent.setAlignment(Pos.CENTER_LEFT);

        // Create content section with 4 main cards
        GridPane contentSection = new GridPane();
        contentSection.setPadding(new Insets(50));
        contentSection.setHgap(50);
        contentSection.setVgap(50);
        contentSection.setAlignment(Pos.CENTER);
        Label card1 = new Label("Subsidiaries 1");
        card1.setStyle("-fx-font-size: 450;");
        Label card2 = new Label("Subsidiaries 2");
        card2.setStyle("-fx-font-size: 450;");
        Label card3 = new Label("Subsidiaries 3");
        card3.setStyle("-fx-font-size: 450;");
        Label card4 = new Label("Subsidiaries 4");
        card4.setStyle("-fx-font-size: 450;");
        contentSection.add(card1, 0, 0);
        contentSection.add(card2, 0, 1);
        contentSection.add(card3, 0, 2);
        contentSection.add(card4, 0, 3);
        root.setCenter(contentSection);

        // Create footer section
        HBox footer = new HBox();
        footer.setPadding(new Insets(15, 50, 15, 50));
        footer.setSpacing(10);
        footer.setStyle("-fx-background-color: #333333;");

        Label legal = new Label("Legal");
        legal.setStyle("-fx-text-fill: white;");
        Label copyright = new Label("Copyright © 1978-2023");
        copyright.setStyle("-fx-text-fill: white;");
        Label privacyPolicy = new Label("Privacy Policy");
        privacyPolicy.setStyle("-fx-text-fill: white;");
        Label berkshireInc = new Label("Berkshire Hathaway Inc.");
        berkshireInc.setStyle("-fx-text-fill: white;");
        Label termsOfService = new Label("Terms of Service");
        termsOfService.setStyle("-fx-text-fill: white;");

        Label connectWithUs = new Label("Connect with us:");
        connectWithUs.setStyle("-fx-text-fill: white;");

        Label twitter = new Label("Twitter");
        twitter.setStyle("-fx-text-fill: white;");

        Label facebook = new Label("Facebook");
        facebook.setStyle("-fx-text-fill: white;");

        Label instagram = new Label("Instagram");
        instagram.setStyle("-fx-text-fill: white;");

        Label contactUs = new Label("Contact us:");
        contactUs.setStyle("-fx-text-fill: white;");

        Label email = new Label("Email: berkshire@berkshirehathaway.com");
        email.setStyle("-fx-text-fill: white;");

        Label phone = new Label("Phone: +1 402-346-1400.");
        phone.setStyle("-fx-text-fill: white;");

        // Left content
        VBox leftContent1 = new VBox(connectWithUs,
                new VBox(twitter,
                        facebook,
                        instagram));
        leftContent1.setSpacing(25);
        leftContent1.setPadding(new Insets(15, 80, 15, 50));
        leftContent1.setAlignment(Pos.CENTER_LEFT);

        // Middle content
        VBox middleContent = new VBox(contactUs,
                email,
                phone);
        middleContent.setSpacing(25);
        middleContent.setAlignment(Pos.CENTER);
        middleContent.setPadding(new Insets(0, 0, 0, 100));


        // Right content
        VBox rightContent = new VBox(legal,
                privacyPolicy,
                termsOfService,
                berkshireInc,
                copyright);
        rightContent.setSpacing(10);
        rightContent.setPadding(new Insets(15, 50, 15, 0));
        rightContent.setAlignment(Pos.CENTER_RIGHT);

        // Set each content to take up equal space in the footer
        HBox.setHgrow(leftContent, Priority.ALWAYS);
        HBox.setHgrow(middleContent, Priority.ALWAYS);
        HBox.setHgrow(rightContent, Priority.ALWAYS);

        footer.getChildren().addAll(leftContent1, middleContent, rightContent);
        root.setBottom(footer);

        // Implements Scroll Pane
        ScrollPane scrollpane = new ScrollPane();
        scrollpane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollpane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollpane.setContent(root);
        scrollpane.setFitToWidth(true);
        scrollpane.setFitToHeight(true);

        return scrollpane;

    }

    public static void main(String[] args) {
        launch(args);
    }
}