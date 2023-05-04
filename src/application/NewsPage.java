package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NewsPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = getRoot();

        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setTitle("News!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static BorderPane getRoot() {
        BorderPane root = new BorderPane();

/* ------- HEADER SECTION ------- */
/* ----- (top of each page)----- */
        
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
        
        //Investments
        Label investments = new Label("Investments");
        investments.setStyle("-fx-text-fill: white;");
        investments.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showInvestorsPage();
			}
        	
		});
        
        navbarItems.getChildren().addAll(news, reports, letters, subsidiaries, about, investments);

        // Add region node and navbar items to navbar
        navbar.getChildren().addAll(region, navbarItems);

        root.setTop(navbar);
/* ------- END OF HEADER SECTION ------- */

        
/* ------- CONTENT SECTION ------- */
/* -- (between Header and Footer) -- */

        // News label on page
        Label card1 = new Label("Latest News:");
        //card1.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
        card1.setStyle("-fx-font-size: 20; -fx-text-fill: red;");
        Label card2 = new Label("April 27, 2023 News Release");
        card2.setStyle("-fx-text-fill: blue;");
        card2.setUnderline(true);
        card2.setOnMouseEntered(e -> {
            card2.setStyle("-fx-text-fill: deepskyblue;");
        });
        card2.setOnMouseExited(e -> {
            card2.setStyle("-fx-text-fill: blue;");
        });

        // Tabpane which contains all relevant information
        TabPane tabpane = new TabPane();
        tabpane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        tabpane.setSide(Side.TOP);
        for (int i = 2023; i >= 1996; i--) {
            Tab tab = new Tab(Integer.toString(i));
            Image emptyImage = new Image(HomePage.class.getResourceAsStream("Empty.jpg"));
            Image newsReleaseImage = new Image(HomePage.class.getResourceAsStream("AnnualNewsRelease.png"));
            Image quarterlyEarningsImage = new Image(HomePage.class.getResourceAsStream("QuarterlyEarnings2.png"));
            Image annualMeetingsImage = new Image(HomePage.class.getResourceAsStream("AnnualMeetings.png"));
            Image miscImage = new Image(HomePage.class.getResourceAsStream("Misc.png"));
            Image Q1Image = new Image(HomePage.class.getResourceAsStream("Misc.png"));
            ImageView newsView = new ImageView(emptyImage);
            Button button = new Button(Integer.toString(i) + " News Releases");
            button.setStyle("-fx-background-color: #E5E4DA;");
            Button button2 = new Button(Integer.toString(i) + " Quarterly Earnings");
            button2.setStyle("-fx-background-color: #E5E4DA;");
            Button button3 = new Button(Integer.toString(i) + " Annual Meetings");
            button3.setStyle("-fx-background-color: #E5E4DA;");
            Button button4 = new Button(Integer.toString(i) + " Miscellaneous");
            button4.setStyle("-fx-background-color: #E5E4DA;");
            GridPane gridpane = new GridPane();
        	for (int j = 0; j <= 4; j++) {
        		Button jbutton = new Button("Quarter 1");
        		jbutton.setStyle("-fx-background-color: #E5E4DA;");
        		Button jbutton2 = new Button("Quarter 2");
        		jbutton2.setStyle("-fx-background-color: #E5E4DA;");
        		Button jbutton3 = new Button("Quarter 3");
        		jbutton3.setStyle("-fx-background-color: #E5E4DA;");
        		Button jbutton4 = new Button("Annual");
        		jbutton4.setStyle("-fx-background-color: #E5E4DA;");
        		jbutton.setOnAction(e -> {
                    newsView.setImage(Q1Image);
                });
        		jbutton2.setOnAction(e -> {
                    newsView.setImage(Q1Image);
                });
        		jbutton3.setOnAction(e -> {
                    newsView.setImage(Q1Image);
                });
        		jbutton4.setOnAction(e -> {
                    newsView.setImage(Q1Image);
                });
        		gridpane.add(jbutton, 0, 0);
        		gridpane.add(jbutton2, 0, 1);
        		gridpane.add(jbutton3, 1, 0);
        		gridpane.add(jbutton4, 1, 1);
        		gridpane.setHgap(10);
                gridpane.setVgap(10);
        	}
            if (i == 2023) {
                card2.setOnMouseClicked(e -> {
                    tabpane.getSelectionModel().select(tab);
                    newsView.setImage(newsReleaseImage);
                });
            }
            button.setOnAction(e -> {
                newsView.setImage(newsReleaseImage);
            });
            button2.setOnAction(e -> {
                newsView.setImage(quarterlyEarningsImage);
            });
            button3.setOnAction(e -> {
                newsView.setImage(annualMeetingsImage);
            });
            button4.setOnAction(e -> {
                newsView.setImage(miscImage);
            });
            
            Label newsLabel = new Label("NEWS");
            newsLabel.setStyle("-fx-font-size: 15;");
            newsLabel.setUnderline(true);
            VBox vbox1 = new VBox(10, newsLabel, button, button2, button3, button4);
            Label reportsLabel = new Label("REPORTS");
            reportsLabel.setStyle("-fx-font-size: 15;");
            reportsLabel.setUnderline(true);
            VBox vbox2 = new VBox(10, reportsLabel, gridpane);
            VBox vbox3 = new VBox(100, vbox1, vbox2);
            vbox3.setPadding(new Insets(40, 40, 40, 40));
            vbox3.setAlignment(Pos.CENTER_LEFT);
            ScrollPane newsScroll = new ScrollPane();
            newsScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            newsScroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            newsScroll.setContent(newsView);
            newsScroll.setPrefViewportWidth(1200);
            newsScroll.setPrefViewportHeight(1000);
            HBox hbox = new HBox(10, vbox3, newsScroll);
            tab.setContent(hbox);
            tabpane.getTabs().add(tab);
        }
        tabpane.setStyle("-fx-border-color: black; -fx-background-color: white;");
        //HBox hbox2 = new HBox(5, card1, card2);
        //VBox vbox2 = new VBox(10, hbox2,  tabpane);
        VBox vbox2 = new VBox(10, card1, card2,  tabpane);
        vbox2.setStyle("-fx-background-color: #e5e4da;");
        vbox2.setPadding(new Insets(20, 20, 20, 20));
        root.setCenter(vbox2);
        
/* ------- END OF CONTENT SECTION ------- */


/* ------- FOOTER SECTION ------- */
/* --- (bottom of each page) --- */
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
        VBox footerLeft = new VBox(connectWithUs,
                                    new VBox(twitter, 
                                    		facebook, 
                                    		instagram));
        footerLeft.setSpacing(25);
        footerLeft.setPadding(new Insets(15, 80, 15, 50));
        footerLeft.setAlignment(Pos.CENTER_LEFT);

        // Middle content
        VBox footerMiddle = new VBox(contactUs,
                                      email,
                                      phone);
        footerMiddle.setSpacing(25);
        footerMiddle.setAlignment(Pos.CENTER);


        // Right content
        VBox footerRight = new VBox(legal,
                                     privacyPolicy,
                                     termsOfService,
                                     berkshireInc,
                                     copyright);
        footerRight.setSpacing(10);
        footerRight.setPadding(new Insets(15, 50, 15, 0));
        footerRight.setAlignment(Pos.CENTER_RIGHT);
        
        // Set each content to take up equal space in the footer
        HBox.setHgrow(footerLeft, Priority.ALWAYS);
        HBox.setHgrow(footerMiddle, Priority.ALWAYS);
        HBox.setHgrow(footerRight, Priority.ALWAYS);

        footer.getChildren().addAll(footerLeft, footerMiddle, footerRight);
        root.setBottom(footer);
        
 /* ------- END OF FOOTER SECTION ------- */

        // Implements Scroll Pane
        ScrollPane scrollpane = new ScrollPane();
        scrollpane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollpane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollpane.setContent(root);
        scrollpane.setFitToWidth(true);
        scrollpane.setFitToHeight(true);

        return root;

    }

    public static void main(String[] args) {
        launch(args);
    }
}