package application;

import java.awt.Desktop;
import java.net.URI;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HomePage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	BorderPane root = getRoot();
    	
    	ScrollPane scrollPane = new ScrollPane();
    	scrollPane.setContent(root);

        Scene scene = new Scene(scrollPane, 1366, 768);
        primaryStage.setTitle("Home!!!");
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
        Label news = new Label("News & Reports");
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
        
        navbarItems.getChildren().addAll(news, letters, subsidiaries, about, investments);

        // Add region node and navbar items to navbar
        navbar.getChildren().addAll(region, navbarItems);

        root.setTop(navbar);
/* ------- END OF HEADER SECTION ------- */
        

        
/* ------- CONTENT SECTION ------- */
/* -- (between Header and Footer) -- */
        
        // Create hero section with banner image and text
        GridPane heroSection = getHeroSection();
        
        // Create about section with banner image and text
        GridPane aboutSection = getAboutSection();


        // Content Section
        BorderPane centerPane = new BorderPane();

// Create VBoxes to hold card contents
        
 // News Box Section
	    VBox newsBox = new VBox();
	    newsBox.setPrefWidth(400);
	    newsBox.setMinHeight(300);
	    newsBox.setStyle("-fx-background-color: #363842; -fx-padding: 40;");
	    Label newsTitle = new Label("News");
	    newsTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label newsText = new Label("The latest news from Berkshire \nHathaway");
	    newsText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button newsButton = new Button("Read News");
	    newsButton.setStyle("-fx-background-color: #363842; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    newsButton.setOnMouseEntered(event ->{
	    	newsButton.setScaleX(1.03);
	    	newsButton.setScaleY(1.03);
    	});
	    newsButton.setOnMouseExited(event ->{
	    	newsButton.setScaleX(1);
	    	newsButton.setScaleY(1);
    	});
	    newsButton.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showNewsPage();
			}
        	
		});
	    newsBox.setAlignment(Pos.CENTER_LEFT);
	    newsBox.setSpacing(20);
	    newsBox.getChildren().addAll(newsTitle, newsText, newsButton);
	    
// Reports Box Section
	    VBox reportsBox = new VBox();
	    reportsBox.setMaxWidth(400);
	    reportsBox.setMinHeight(300);
	    reportsBox.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 40;");
	    Label reportsTitle = new Label("Reports");
	    reportsTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold;");
	    Label reportsText = new Label("Annual and quarterly reports from \n1995 to 2023");
	    reportsText.setStyle("-fx-font-size: 18;");
	    Button reportsButton = new Button("Read Reports");
	    reportsButton.setStyle("-fx-background-color: #E5E4DA; -fx-text-fill: #000000; -fx-font-size: 16; -fx-border-color: black; -fx-border-width: 2px;");
	    reportsButton.setOnMouseEntered(event ->{
	    	reportsButton.setScaleX(1.03);
	    	reportsButton.setScaleY(1.03);
    	});
	    reportsButton.setOnMouseExited(event ->{
	    	reportsButton.setScaleX(1);
	    	reportsButton.setScaleY(1);
    	});
	    reportsButton.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showNewsPage();
			}
        	
		});
	    reportsBox.setAlignment(Pos.CENTER_LEFT);
	    reportsBox.setSpacing(20);
	    reportsBox.getChildren().addAll(reportsTitle, reportsText, reportsButton);
	    
// Letters Box Section
	    VBox lettersBox = new VBox();
	    lettersBox.setPrefWidth(400);
	    lettersBox.setMinHeight(300);
	    lettersBox.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    Label lettersTitle = new Label("Letters");
	    lettersTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label lettersText = new Label("Shareholder letters from \nWarren Buffet and Charlie Munger");
	    lettersText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button lettersButton = new Button("Read Letters");
	    lettersButton.setStyle("-fx-background-color: #542549; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    lettersButton.setOnMouseEntered(event ->{
	    	lettersButton.setScaleX(1.03);
	    	lettersButton.setScaleY(1.03);
    	});
	    lettersButton.setOnMouseExited(event ->{
	    	lettersButton.setScaleX(1);
	    	lettersButton.setScaleY(1);
    	});
	    lettersButton.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showLettersPage();
			}
        	
		});
	    lettersBox.setAlignment(Pos.CENTER_LEFT);
	    lettersBox.setSpacing(20);
	    lettersBox.getChildren().addAll(lettersTitle, lettersText, lettersButton);
	    
// Subsidiaries Box Section
	    VBox subsidiariesBox = new VBox();
	    subsidiariesBox.setPrefWidth(400);
	    subsidiariesBox.setMinHeight(300);
	    subsidiariesBox.setStyle("-fx-background-color: #15158A; -fx-padding: 40;");
	    Label subsidiariesTitle = new Label("Subsidiaries");
	    subsidiariesTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label subsidiariesText = new Label("Berkshire Hathaway wholly owns \n60+ companies");
	    subsidiariesText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button subsidiariesButton = new Button("See Subsidiaries");
	    subsidiariesButton.setStyle("-fx-background-color: #15158a; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    subsidiariesButton.setOnMouseEntered(event ->{
	    	subsidiariesButton.setScaleX(1.03);
	    	subsidiariesButton.setScaleY(1.03);
    	});
	    subsidiariesButton.setOnMouseExited(event ->{
	    	subsidiariesButton.setScaleX(1);
	    	subsidiariesButton.setScaleY(1);
    	});
	    subsidiariesButton.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showSubsidiariesPage();
			}
        	
		});
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
	
	    centerPane.setTop(heroSection);
	    centerPane.setCenter(contentSection);
	    centerPane.setBottom(aboutSection);
	
	    root.setCenter(centerPane);
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
        
        legal.setOnMouseEntered(e -> {
        	legal.setUnderline(true);
        });
        legal.setOnMouseExited(e -> {
        	legal.setUnderline(false);
        });
        copyright.setOnMouseEntered(e -> {
        	copyright.setUnderline(true);
        });
        copyright.setOnMouseExited(e -> {
        	copyright.setUnderline(false);
        });
        privacyPolicy.setOnMouseEntered(e -> {
        	privacyPolicy.setUnderline(true);
        });
        privacyPolicy.setOnMouseExited(e -> {
        	privacyPolicy.setUnderline(false);
        });
        berkshireInc.setOnMouseEntered(e -> {
        	berkshireInc.setUnderline(true);
        });
        berkshireInc.setOnMouseExited(e -> {
        	berkshireInc.setUnderline(false);
        });
        termsOfService.setOnMouseEntered(e -> {
        	termsOfService.setUnderline(true);
        });
        termsOfService.setOnMouseExited(e -> {
        	termsOfService.setUnderline(false);
        });
        twitter.setOnMouseEntered(e -> {
        	twitter.setUnderline(true);
        });
        twitter.setOnMouseExited(e -> {
        	twitter.setUnderline(false);
        });
        facebook.setOnMouseEntered(e -> {
        	facebook.setUnderline(true);
        });
        facebook.setOnMouseExited(e -> {
        	facebook.setUnderline(false);
        });
        instagram.setOnMouseEntered(e -> {
        	instagram.setUnderline(true);
        });
        instagram.setOnMouseExited(e -> {
        	instagram.setUnderline(false);
        });
        email.setOnMouseEntered(e -> {
        	email.setUnderline(true);
        });
        email.setOnMouseExited(e -> {
        	email.setUnderline(false);
        });
        phone.setOnMouseEntered(e -> {
        	phone.setUnderline(true);
        });
        phone.setOnMouseExited(e -> {
        	phone.setUnderline(false);
        });
        
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

 
/* ------- CONTENT SECTION METHOD CALLS ------- */
/* -- (these are specific to the home page) -- */
    
	private static GridPane getHeroSection() {
        
		//Add quote icon
		Image quoteIcon = new Image(HomePage.class.getResourceAsStream("quote.png"));
        ImageView quoteIconView = new ImageView(quoteIcon);
        quoteIconView.setFitWidth(100);
        quoteIconView.setFitHeight(100);
        quoteIconView.setPreserveRatio(true);
        quoteIconView.setSmooth(true);
        quoteIconView.setCache(true);
        
        
		// Add quote label
        Label quoteLabel = new Label("We pass the benefits of this\n"
        		+ "low-cost structure\n"
        		+ "along to our customers.\"");
        quoteLabel.setStyle("-fx-font-size: 40; -fx-font-weight: bold; -fx-text-fill: black;");
        quoteLabel.setAlignment(Pos.CENTER_LEFT);
        
        //Add quote author label
        Label quoteAuthor = new Label("-Warren Buffet");
        quoteAuthor.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: black;");
        quoteAuthor.setAlignment(Pos.CENTER_LEFT);

        // Add button
        Button button = new Button("Read Warren's Letter");
        button.setOnMouseEntered(event ->{
        	button.setScaleX(1.03);
        	button.setScaleY(1.03);
    	});
        button.setOnMouseExited(event ->{
        	button.setScaleX(1);
        	button.setScaleY(1);
    	});
        button.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/SpecialLetters/WEB%20past%20present%20future%202014.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
        button.setStyle("-fx-background-color: #15158a; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-padding: 10 20;");
        
        // Create ImageView to hold banner image
        Image bannerImage = new Image(HomePage.class.getResourceAsStream("banner.jpg"));
        ImageView bannerImageView = new ImageView(bannerImage);
        bannerImageView.setFitWidth(400);
        bannerImageView.setFitHeight(400);
        bannerImageView.setPreserveRatio(true);
        bannerImageView.setSmooth(true);
        bannerImageView.setCache(true);

        // Create VBox to hold quote, author, and button
        VBox leftBox = new VBox();
        leftBox.setAlignment(Pos.CENTER_LEFT);
        leftBox.setPadding(new Insets(5));
        leftBox.setSpacing(40);
        // Add quote and button VBox to leftContent
        leftBox.getChildren().addAll(quoteIconView, quoteLabel, quoteAuthor, button);
        
        VBox rightBox = new VBox();
        rightBox.getChildren().add(bannerImageView);
        rightBox.setAlignment(Pos.CENTER_RIGHT);
        
        HBox mainHBox = new HBox();
        
		mainHBox.setPadding(new Insets(5));
        mainHBox.setSpacing(10);
        
        // Add leftContent and right half to heroSection
        mainHBox.getChildren().addAll(leftBox, rightBox);
        
        GridPane mainGrid = new GridPane();
        mainGrid.setStyle("-fx-background-color: #7390a2;");
        mainGrid.setPadding(new Insets(50));
        mainGrid.setHgap(50);
        mainGrid.setVgap(50);
        mainGrid.setAlignment(Pos.CENTER);
        
        mainGrid.add(leftBox, 0, 0);
        mainGrid.add(rightBox, 1, 0);
        
        return mainGrid;
	}
	
	private static GridPane getAboutSection() {
        
		// Add quote label
        Label aboutLabel = new Label("About Berkshire Hathaway");
        aboutLabel.setStyle("-fx-font-size: 35; -fx-font-weight: bold; -fx-text-fill: black;");
        aboutLabel.setAlignment(Pos.CENTER_LEFT);
        
        //Add quote author label
        Label aboutText = new Label("Berkshire Hathaway is an Omaha-based holding company "
        		+ "\nthat owns numerous smaller companies called subsidiaries."
        		+ "\n"
        		+ "\nWe also own significant minority holdings in several public "
        		+ "\ncompanies like Apple and American Express...");
        aboutText.setStyle("-fx-font-size: 18; -fx-text-fill: black;");
        aboutText.setAlignment(Pos.CENTER_LEFT);

        // Add button
        Button button = new Button("Learn More");
        button.setOnMouseEntered(event ->{
        	button.setScaleX(1.03);
        	button.setScaleY(1.03);
    	});
        button.setOnMouseExited(event ->{
        	button.setScaleX(1);
        	button.setScaleY(1);
    	});
        button.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showAboutPage();
			}
        	
		});
        
        button.setStyle("-fx-background-color: #15158a; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-padding: 10 20;");
        
        // Create ImageView to hold banner image
        Image aboutImage = new Image(HomePage.class.getResourceAsStream("aboutImage.png"));
        ImageView aboutImageView = new ImageView(aboutImage);
        aboutImageView.setFitWidth(400);
        aboutImageView.setFitHeight(400);
        aboutImageView.setPreserveRatio(true);
        aboutImageView.setSmooth(true);
        aboutImageView.setCache(true);

        // Create VBox to hold quote, author, and button
        VBox rightBox = new VBox();
        rightBox.setAlignment(Pos.CENTER_LEFT);
        rightBox.setPadding(new Insets(5));
        rightBox.setSpacing(40);
        // Add quote and button VBox to leftContent
        rightBox.getChildren().addAll(aboutLabel, aboutText, button);
        
        VBox leftBox = new VBox();
        leftBox.getChildren().add(aboutImageView);
        leftBox.setAlignment(Pos.CENTER_LEFT);
        
        HBox mainHBox = new HBox();
        
		mainHBox.setPadding(new Insets(5));
        mainHBox.setSpacing(10);
        
        // Add leftContent and right half to aboutSection
        mainHBox.getChildren().addAll(leftBox, rightBox);
        
        GridPane mainGrid = new GridPane();
        mainGrid.setStyle("-fx-background-color: #E5E4DA;");
        mainGrid.setPadding(new Insets(50));
        mainGrid.setHgap(50);
        mainGrid.setVgap(50);
        mainGrid.setAlignment(Pos.CENTER);
        
        mainGrid.add(leftBox, 0, 0);
        mainGrid.add(rightBox, 1, 0);       
        
        return mainGrid;
	}


	public static void main(String[] args) {
        launch(args);
    }
}