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
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LettersPage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	BorderPane root = getRoot();

        Scene scene = new Scene(root, 1366, 768);
        primaryStage.setTitle("Letters!!!");
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

        // Content Section
        BorderPane centerPane = new BorderPane();

	    // Create VBoxes to hold card contents

// Button 1
        VBox b1 = new VBox();
	    b1.setMaxWidth(600);
	    b1.setMinHeight(400);
	    b1.setStyle("-fx-background-color: #363842; -fx-padding: 40;");
	    
	    Label sec = new Label("Charlie Munger Special Letter");
	    sec.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label secText = new Label("Read Vice Chairman Charlie Munger\'s special address "
	    		+ "\nto Berkshire Hathaway Investors titled \'Past and Future\'");
	    secText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button secButton = new Button("Read Letter");
	    secButton.setMinSize(200, 50);
	    secButton.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    
	    secButton.setOnMouseEntered(event ->{
	    	secButton.setScaleX(1.03);
	    	secButton.setScaleY(1.03);
    	});
	    secButton.setOnMouseExited(event ->{
	    	secButton.setScaleX(1);
	    	secButton.setScaleY(1);
    	});
	    
	    b1.setAlignment(Pos.CENTER_LEFT);
	    b1.setSpacing(40);
	    b1.getChildren().addAll(sec, secText, secButton);
	    
	    secButton.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/SpecialLetters/CTM%20past%20present%20future%202014.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
	    
// Button 2
	    VBox b2 = new VBox();
	    b2.setMaxWidth(600);
	    b2.setMinHeight(400);
	    b2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 40;");
	    
	    Label annual = new Label("BH Shareholders Letters");
	    annual.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: black;");
	    Label anText = new Label("Read Warren Buffet's Annual Berkshire Shareholders Letters "
	    		+ "\narchiving from 1977 to 2023");
	    anText.setStyle("-fx-font-size: 18; -fx-text-fill: black;");
	    Button anButton = new Button("View Shareholders Archive");
	    anButton.setMinSize(200, 50);
	    anButton.setStyle("-fx-background-color: null; -fx-text-fill: #000000; -fx-font-size: 16; -fx-border-color: black; -fx-border-width: 2px;");
	    
	    anButton.setOnMouseEntered(event ->{
	    	anButton.setScaleX(1.03);
	    	anButton.setScaleY(1.03);
    	});
	    anButton.setOnMouseExited(event ->{
	    	anButton.setScaleX(1);
	    	anButton.setScaleY(1);
    	});
	    
	    b2.setAlignment(Pos.CENTER_LEFT);
	    b2.setSpacing(40);
	    b2.getChildren().addAll(annual, anText, anButton);
	    
	    anButton.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/letters/letters.html"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
// Button 3
	    VBox wescoSection = new VBox();
	    wescoSection.setMaxWidth(600);
	    wescoSection.setMinHeight(400);
	    wescoSection.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    
	    Label wescoTitle = new Label("Wesco Shareholders Letters");
	    wescoTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label wescoText = new Label("Read Charlie Munger's Letters to Wesco Shareholders"
	    		+ "\narchived from 1997 to 2009");
	    wescoText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    
	    Button wescoBtn = new Button("View Shareholder Letters");
	    wescoBtn.setMinSize(200, 50);
	    wescoBtn.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    
	    wescoBtn.setOnMouseEntered(event ->{
	    	wescoBtn.setScaleX(1.03);
	    	wescoBtn.setScaleY(1.03);
    	});
	    wescoBtn.setOnMouseExited(event ->{
	    	wescoBtn.setScaleX(1);
	    	wescoBtn.setScaleY(1);
    	});
	    
	    wescoSection.setAlignment(Pos.CENTER_LEFT);
	    wescoSection.setSpacing(40);
	    wescoSection.getChildren().addAll(wescoTitle, wescoText, wescoBtn);
	    
	    wescoBtn.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/wesco/WescoHome.html"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
 // Button 4
	    VBox warrenSpecial = new VBox();
	    warrenSpecial.setMaxWidth(600);
	    warrenSpecial.setMinHeight(400);
	    warrenSpecial.setStyle("-fx-background-color: #15158A; -fx-padding: 20;");
	    
	    Label warren = new Label("Special Message from Warren Buffet");
	    warren.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label warrenText = new Label("Read a Special Message from Warren Buffet on personal "
	    		+ "\nexpenditure savings through reccomended subsidiaries");
	    warrenText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button comm = new Button("Read Message");
	    comm.setMinSize(200, 50);
	    comm.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    
	    comm.setOnMouseEntered(event ->{
	    	comm.setScaleX(1.03);
	    	comm.setScaleY(1.03);
    	});
	    comm.setOnMouseExited(event ->{
	    	comm.setScaleX(1);
	    	comm.setScaleY(1);
    	});
	    warrenSpecial.setAlignment(Pos.CENTER_LEFT);
	    warrenSpecial.setSpacing(40);
	    warrenSpecial.getChildren().addAll(warren, warrenText, comm);
	    
	    comm.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/SpecialLetters/WEB%20past%20present%20future%202014.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
	    
	    b1.setOnMouseEntered(event ->{
            b1.setScaleX(1.03);
            b1.setScaleY(1.03);
        });
        b1.setOnMouseExited(event ->{
            b1.setScaleX(1);
            b1.setScaleY(1);
        });
        
        b2.setOnMouseEntered(event ->{
            b2.setScaleX(1.03);
            b2.setScaleY(1.03);
        });
        b2.setOnMouseExited(event ->{
            b2.setScaleX(1);
            b2.setScaleY(1);
        });
        
        wescoSection.setOnMouseEntered(event ->{
            wescoSection.setScaleX(1.03);
            wescoSection.setScaleY(1.03);
        });
        wescoSection.setOnMouseExited(event ->{
            wescoSection.setScaleX(1);
            wescoSection.setScaleY(1);
        });
        
        warrenSpecial.setOnMouseEntered(event ->{
            warrenSpecial.setScaleX(1.03);
            warrenSpecial.setScaleY(1.03);
        });
        warrenSpecial.setOnMouseExited(event ->{
        	warrenSpecial.setScaleX(1);
        	warrenSpecial.setScaleY(1);
        });
        

	    
	    // Create content section with 2x2 grid layout
	    GridPane contentSection = new GridPane();
	    contentSection.setStyle("-fx-padding: 50;");
	    contentSection.setHgap(50);
	    contentSection.setVgap(50);
	    contentSection.setAlignment(Pos.CENTER);

	    contentSection.add(b1, 0, 0);
	    contentSection.add(b2, 1, 0);
	    contentSection.add(wescoSection, 0, 1);
	    contentSection.add(warrenSpecial, 1, 1);

//        	    centerPane.setTop();
	    centerPane.setCenter(contentSection);
//        	    centerPane.setBottom();
	
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


	public static void main(String[] args) {
        launch(args);
    }
}