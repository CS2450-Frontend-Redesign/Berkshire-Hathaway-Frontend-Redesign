package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AboutPage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	BorderPane root = getRoot();

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("About!!!");
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
        Rectangle companyName = new Rectangle(0,0,200,60);
        //companyName.setFill(Color.web("#E5E4DA"));
        Image image = new Image(HomePage.class.getResourceAsStream("BH.png"));
        //ImageView companyName = new ImageView(image);
        companyName.setFill(new ImagePattern(image));
        //companyName.setFitHeight(50);
        //companyName.setPreserveRatio(true);
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
        news.setStyle("-fx-text-fill: white; -fx-font-size: 14pt");
        news.setOnMouseEntered(e -> {
        	news.setUnderline(true);
        });
        news.setOnMouseExited(e -> {
        	news.setUnderline(false);
        });
        news.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showNewsPage();
			}
        	
		});
        
        //Reports
        Label reports = new Label("Reports");
        reports.setStyle("-fx-text-fill: white; -fx-font-size: 14pt");
        reports.setOnMouseEntered(e -> {
        	reports.setUnderline(true);
        });
        reports.setOnMouseExited(e -> {
        	reports.setUnderline(false);
        });
        reports.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showReportsPage();
			}
        	
		});
        
        //Letters
        Label letters = new Label("Letters");
        letters.setStyle("-fx-text-fill: white; -fx-font-size: 14pt");
        letters.setOnMouseEntered(e -> {
        	letters.setUnderline(true);
        });
        letters.setOnMouseExited(e -> {
        	letters.setUnderline(false);
        });
        letters.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showLettersPage();
			}
        	
		});
        
        //Subsidiaries
        Label subsidiaries = new Label("Subsidiaries");
        subsidiaries.setStyle("-fx-text-fill: white; -fx-font-size: 14pt");
        subsidiaries.setOnMouseEntered(e -> {
        	subsidiaries.setUnderline(true);
        });
        subsidiaries.setOnMouseExited(e -> {
        	subsidiaries.setUnderline(false);
        });
        subsidiaries.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showSubsidiariesPage();
			}
        	
		});
        
        //About
        Label about = new Label("About");
        about.setStyle("-fx-text-fill: white; -fx-font-size: 14pt");
        about.setOnMouseEntered(e -> {
        	about.setUnderline(true);
        });
        about.setOnMouseExited(e -> {
        	about.setUnderline(false);
        });
        about.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showAboutPage();
			}
        	
		});
        
        //Investments
        Label investments = new Label("Investments");
        investments.setStyle("-fx-text-fill: white; -fx-font-size: 14pt");
        investments.setOnMouseEntered(e -> {
        	investments.setUnderline(true);
        });
        investments.setOnMouseExited(e -> {
        	investments.setUnderline(false);
        });
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
        
        Rectangle box = new Rectangle(0, 0);
        box.setFill(null);
        box.setStroke(Color.web("#15158a",1.0));
        box.setStrokeWidth(2.0);
        Label aboutLabel = new Label("Corporate Governance and Sustainability");
        aboutLabel.setStyle("-fx-background-color: whitesmoke; -fx-text-fill: #542549; -fx-font-size: 24; -fx-padding: 0 5;");
        AnchorPane pane = new AnchorPane();
        pane.getChildren().addAll(box, aboutLabel);
        AnchorPane.setTopAnchor(box, 15.0);
        AnchorPane.setTopAnchor(aboutLabel, 0.0);
        AnchorPane.setLeftAnchor(box, 10.0);
        AnchorPane.setLeftAnchor(aboutLabel, 40.0);
        box.widthProperty().bind(pane.widthProperty().subtract(20));
        box.heightProperty().bind(pane.heightProperty().subtract(25));   
        root.setCenter(pane);
/* -- (between Header and Footer) -- */
/*
        // Content Section
        BorderPane centerPane = new BorderPane();

	    // Create Vboxes to hold card contents
	    VBox newsBox = new VBox();
	    newsBox.setPrefWidth(400);
	    newsBox.setMinHeight(300);
	    newsBox.setStyle("-fx-background-color: #363842; -fx-padding: 40;");
	    Label newsTitle = new Label("About 1");
	    newsTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label newsText = new Label("The latest news from Berkshire \nHathaway");
	    newsText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button newsButton = new Button("Read More");
	    newsBox.setAlignment(Pos.CENTER_LEFT);
	    newsBox.setSpacing(20);
	    newsBox.getChildren().addAll(newsTitle, newsText, newsButton);

	    VBox reportsBox = new VBox();
	    reportsBox.setMaxWidth(400);
	    reportsBox.setMinHeight(300);
	    reportsBox.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 40;");
	    Label reportsTitle = new Label("About 2");
	    reportsTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold;");
	    Label reportsText = new Label("Annual and quarterly reports from \n1995 to 2023");
	    reportsText.setStyle("-fx-font-size: 18;");
	    Button reportsButton = new Button("Read More");
	    reportsBox.setAlignment(Pos.CENTER_LEFT);
	    reportsBox.setSpacing(20);
	    reportsBox.getChildren().addAll(reportsTitle, reportsText, reportsButton);
	
	    VBox lettersBox = new VBox();
	    lettersBox.setPrefWidth(400);
	    lettersBox.setMinHeight(300);
	    lettersBox.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    Label lettersTitle = new Label("About 3");
	    lettersTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label lettersText = new Label("Shareholder letters from \nWarren Buffet and Charlie Munger");
	    lettersText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button lettersButton = new Button("Read More");
	    lettersBox.setAlignment(Pos.CENTER_LEFT);
	    lettersBox.setSpacing(20);
	    lettersBox.getChildren().addAll(lettersTitle, lettersText, lettersButton);
	
	    VBox subsidiariesBox = new VBox();
	    subsidiariesBox.setPrefWidth(400);
	    subsidiariesBox.setMinHeight(300);
	    subsidiariesBox.setStyle("-fx-background-color: #15158A; -fx-padding: 40;");
	    Label subsidiariesTitle = new Label("About 4");
	    subsidiariesTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label subsidiariesText = new Label("Berkshire Hathaway wholly owns \n60+ companies");
	    subsidiariesText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button subsidiariesButton = new Button("Read More");
	    subsidiariesBox.setAlignment(Pos.CENTER_LEFT);
	    subsidiariesBox.setSpacing(20);
	    subsidiariesBox.getChildren().addAll(subsidiariesTitle, subsidiariesText, subsidiariesButton);
	
	    // Create content section with 2x2 grid layout
	    GridPane contentSection = new GridPane();
	    contentSection.setStyle("-fx-padding: 50;");
	    contentSection.setHgap(50);
	    contentSection.setVgap(50);
	    contentSection.setAlignment(Pos.CENTER);

	    contentSection.add(newsBox, 0, 0);
	    contentSection.add(reportsBox, 1, 0);
	    contentSection.add(lettersBox, 0, 1);
	    contentSection.add(subsidiariesBox, 1, 1);
	
//	    centerPane.setTop();
	    centerPane.setCenter(contentSection);
//	    centerPane.setBottom();
	
	    root.setCenter(centerPane);
*/	    
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
	            
        return root;

	}

	public static void main(String[] args) {
        launch(args);
    }
}