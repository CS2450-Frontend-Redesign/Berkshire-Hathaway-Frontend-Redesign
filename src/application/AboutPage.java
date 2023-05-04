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

        Scene scene = new Scene(root, 1366, 768);
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

	    // Create Vboxes to hold card contents
	    VBox newsBox = new VBox();
	    newsBox.setPrefWidth(380);
	    newsBox.setMinHeight(350);
	    newsBox.setStyle("-fx-background-color: #363842; -fx-padding: 40;");
	    Label newsTitle = new Label("Sustainability");
	    newsTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label newsText = new Label("Learn about Berkshire Hathaway's \ncommitment to Sustainability");
	    newsText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button susButton = new Button("Read More");
	    susButton.setOnMouseEntered(event ->{
	    	susButton.setScaleX(1.03);
	    	susButton.setScaleY(1.03);
    	});
	    susButton.setOnMouseExited(event ->{
	    	susButton.setScaleX(1);
	    	susButton.setScaleY(1);
    	});
	    susButton.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    susButton.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/sustainability/brksustainabilityleadershipcouncilmay2021.pdf"));
            } catch (Exception r) {
                System.out.println("Try another link");
            }
        });
	    newsBox.setAlignment(Pos.CENTER_LEFT);
	    newsBox.setSpacing(20);
	    newsBox.getChildren().addAll(newsTitle, newsText, susButton);
    	newsBox.setOnMouseEntered(event ->{
    		newsBox.setScaleX(1.03);
    		newsBox.setScaleY(1.03);
    		newsTitle.setUnderline(true);
    	});
    	newsBox.setOnMouseExited(event ->{
    		newsBox.setScaleX(1);
    		newsBox.setScaleY(1);
    		newsTitle.setUnderline(false);
    	});

	    VBox reportsBox = new VBox();
	    reportsBox.setMaxWidth(400);
	    reportsBox.setMinHeight(350);
	    reportsBox.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 40;");
	    Label reportsTitle = new Label("Diversity");
	    reportsTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold;");
	    Label reportsText = new Label("Information regarding our \nunwavering focus on diversity");
	    reportsText.setStyle("-fx-font-size: 18;");
	    Button divButton = new Button("Read More");
	    divButton.setOnMouseEntered(event ->{
	    	divButton.setScaleX(1.03);
	    	divButton.setScaleY(1.03);
    	});
	    divButton.setOnMouseExited(event ->{
	    	divButton.setScaleX(1);
	    	divButton.setScaleY(1);
    	});
	    divButton.setStyle("-fx-background-color: null; -fx-text-fill: black; -fx-font-size: 16; -fx-border-color: black; -fx-border-width: 2px;");
	    reportsBox.setAlignment(Pos.CENTER_LEFT);
	    reportsBox.setSpacing(20);
	    reportsBox.getChildren().addAll(reportsTitle, reportsText, divButton);
	    divButton.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/sustainability/berkshire2021eeo1.pdf"));
            } catch (Exception r) {
                System.out.println("Try another link");
            }
        });
	    reportsBox.setOnMouseEntered(event ->{
	    	reportsBox.setScaleX(1.03);
	    	reportsBox.setScaleY(1.03);
	    	reportsTitle.setUnderline(true);
    	});
	    reportsBox.setOnMouseExited(event ->{
	    	reportsBox.setScaleX(1);
	    	reportsBox.setScaleY(1);
	    	reportsTitle.setUnderline(false);
    	});
	
	    VBox lettersBox = new VBox();
	    lettersBox.setPrefWidth(380);
	    lettersBox.setMinHeight(350);
	    lettersBox.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    Label lettersTitle = new Label("Contributions to \nFive Foundations");
	    lettersTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label lettersText = new Label("Explore Warren Buffet's generous \ncontributions to several organizations");
	    lettersText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button contButton = new Button("Read More");
	    contButton.setOnMouseEntered(event ->{
	    	contButton.setScaleX(1.03);
	    	contButton.setScaleY(1.03);
    	});
	    contButton.setOnMouseExited(event ->{
	    	contButton.setScaleX(1);
	    	contButton.setScaleY(1);
    	});
	    lettersBox.setAlignment(Pos.CENTER_LEFT);
	    contButton.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    lettersBox.setSpacing(20);
	    lettersBox.getChildren().addAll(lettersTitle, lettersText, contButton);
	    contButton.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/donate/jun2321.pdf"));
            } catch (Exception r) {
                System.out.println("Try another link");
            }
        });
	    lettersBox.setOnMouseEntered(event ->{
	    	lettersBox.setScaleX(1.03);
	    	lettersBox.setScaleY(1.03);
	    	lettersTitle.setUnderline(true);
    	});
	    lettersBox.setOnMouseExited(event ->{
	    	lettersBox.setScaleX(1);
	    	lettersBox.setScaleY(1);
	    	lettersTitle.setUnderline(false);
    	});
	
	    VBox subsidiariesBox = new VBox();
	    subsidiariesBox.setPrefWidth(380);
	    subsidiariesBox.setMinHeight(350);
	    subsidiariesBox.setStyle("-fx-background-color: #15158A; -fx-padding: 40;");
	    Label subsidiariesTitle = new Label("Code of Business \nConduct and Ethics");
	    subsidiariesTitle.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label subsidiariesText = new Label("Berkshire Hathaway is built \non a strict foundation of ethics");
	    subsidiariesText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button codeButton = new Button("Read More");
	    codeButton.setOnMouseEntered(event ->{
	    	codeButton.setScaleX(1.03);
	    	codeButton.setScaleY(1.03);
    	});
	    codeButton.setOnMouseExited(event ->{
	    	codeButton.setScaleX(1);
	    	codeButton.setScaleY(1);
    	});
	    codeButton.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    subsidiariesBox.setAlignment(Pos.CENTER_LEFT);
	    subsidiariesBox.setSpacing(20);
	    subsidiariesBox.getChildren().addAll(subsidiariesTitle, subsidiariesText, codeButton);
	    codeButton.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/govern/ethics.pdf"));
            } catch (Exception r) {
                System.out.println("Try another link");
            }
        });
	    subsidiariesBox.setOnMouseEntered(event ->{
	    	subsidiariesBox.setScaleX(1.03);
	    	subsidiariesBox.setScaleY(1.03);
	    	subsidiariesTitle.setUnderline(true);
    	});
	    subsidiariesBox.setOnMouseExited(event ->{
	    	subsidiariesBox.setScaleX(1);
	    	subsidiariesBox.setScaleY(1);
	    	subsidiariesTitle.setUnderline(false);
    	});
	    
	    VBox Box5 = new VBox();
	    Box5.setPrefWidth(380);
	    Box5.setMinHeight(350);
	    Box5.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    Label Box5Title = new Label("Insider Trading \nPolicy");
	    Box5Title.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label Box5Text = new Label("Navigate through our no-tolerance \npolicy on Insider Trading");
	    Box5Text.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button Box5Button = new Button("Read More");
	    Box5Button.setOnMouseEntered(event ->{
	    	Box5Button.setScaleX(1.03);
	    	Box5Button.setScaleY(1.03);
    	});
	    Box5Button.setOnMouseExited(event ->{
	    	Box5Button.setScaleX(1);
	    	Box5Button.setScaleY(1);
    	});
	    Box5Button.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    Box5.setAlignment(Pos.CENTER_LEFT);
	    Box5.setSpacing(20);
	    Box5.getChildren().addAll(Box5Title, Box5Text, Box5Button);
	    Box5Button.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/govern/inside.pdf"));
            } catch (Exception r) {
                System.out.println("Try another link");
            }
        });
	    Box5.setOnMouseEntered(event ->{
	    	Box5.setScaleX(1.03);
	    	Box5.setScaleY(1.03);
	    	Box5Title.setUnderline(true);
    	});
	    Box5.setOnMouseExited(event ->{
	    	Box5.setScaleX(1);
	    	Box5.setScaleY(1);
	    	Box5Title.setUnderline(false);
    	});
	    
	    VBox Box6 = new VBox();
	    Box6.setPrefWidth(380);
	    Box6.setMinHeight(350);
	    Box6.setStyle("-fx-background-color: #363842; -fx-padding: 40;");
	    Label Box6Title = new Label("Corporate \nGovernance Guide");
	    Box6Title.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label Box6Text = new Label("Read through our \nguide on Corporate Governance");
	    Box6Text.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button Box6Button = new Button("Read More");
	    Box6Button.setOnMouseEntered(event ->{
	    	Box6Button.setScaleX(1.03);
	    	Box6Button.setScaleY(1.03);
    	});
	    Box6Button.setOnMouseExited(event ->{
	    	Box6Button.setScaleX(1);
	    	Box6Button.setScaleY(1);
    	});
	    Box6Button.setStyle("-fx-background-color: null; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px;");
	    Box6.setAlignment(Pos.CENTER_LEFT);
	    Box6.setSpacing(20);
	    Box6.getChildren().addAll(Box6Title, Box6Text, Box6Button);
	    Box6Button.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/govern/corpgov.pdf"));
            } catch (Exception r) {
                System.out.println("Try another link");
            }
        });
	    Box6.setOnMouseEntered(event ->{
	    	Box6.setScaleX(1.03);
	    	Box6.setScaleY(1.03);
	    	Box6Title.setUnderline(true);
    	});
	    Box6.setOnMouseExited(event ->{
	    	Box6.setScaleX(1);
	    	Box6.setScaleY(1);
	    	Box6Title.setUnderline(false);
    	});
	
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
	    contentSection.add(Box5, 2, 0);
	    contentSection.add(Box6, 2, 1);
	
//	    centerPane.setTop();
	    centerPane.setCenter(contentSection);
//	    centerPane.setBottom();
	
	   // root.setCenter(centerPane);
        
        Rectangle box = new Rectangle(0, 0);
        box.setStyle("-fx-padding: 20px");
        box.setFill(null);
        box.setStroke(Color.web("#15158a",1.0));
        box.setStrokeWidth(2.0);
        Label aboutLabel = new Label("Corporate Governance and Sustainability");
        aboutLabel.setStyle("-fx-background-color: whitesmoke; -fx-text-fill: #542549; -fx-font-size: 24; -fx-padding: 0 5;");
        AnchorPane pane = new AnchorPane();
        pane.getChildren().addAll(box, centerPane ,aboutLabel);
        AnchorPane.setTopAnchor(box, 15.0);
        AnchorPane.setTopAnchor(aboutLabel, 0.0);
        AnchorPane.setLeftAnchor(box, 10.0);
        AnchorPane.setLeftAnchor(aboutLabel, 40.0);
       // pane.setStyle("-fx-padding: 0 15;");
        box.widthProperty().bind(pane.widthProperty().subtract(20));
        box.heightProperty().bind(pane.heightProperty().subtract(25));  
        contentSection.translateXProperty().bind(root.widthProperty().subtract(contentSection.widthProperty()).divide(2));
        root.setCenter(pane);
        
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