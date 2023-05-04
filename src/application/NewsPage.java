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
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class NewsPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = getRoot();

        Scene scene = new Scene(root, 1366, 760);
        primaryStage.setTitle("News & Reports");
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

        // News label on page
        Label card1 = new Label("News & Reports Archive");
        card1.setStyle("-fx-font-size: 30; -fx-text-fill: #542549; -fx-font-weight: bold;");
        Label card2 = new Label("View Latest News Release");
        Label card3 = new Label("(updated: April 27, 2023)");
        card3.setStyle("-fx-font-size: 10");
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
        tabpane.setMinHeight(500);
        tabpane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        tabpane.setSide(Side.TOP);
        for (int i = 2023; i >= 1996; i--) {
            Tab tab = new Tab(Integer.toString(i));
            tab.setStyle("-fx-background-color: #f0efe6;");
            Image emptyImage = new Image(HomePage.class.getResourceAsStream("Empty.jpg"));
            Image newsReleaseImage = new Image(HomePage.class.getResourceAsStream("AnnualNewsRelease.png"));
            Image quarterlyEarningsImage = new Image(HomePage.class.getResourceAsStream("QuarterlyEarnings2.png"));
            Image annualMeetingsImage = new Image(HomePage.class.getResourceAsStream("AnnualMeetings.png"));
            Image miscImage = new Image(HomePage.class.getResourceAsStream("Misc.png"));
            Image Q1Image = new Image(HomePage.class.getResourceAsStream("Q1.png"));
            ImageView newsView = new ImageView(emptyImage);
            Button button = new Button(Integer.toString(i) + " News Releases");
            button.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
            button.setMinSize(150, 25);
            button.setOnMouseEntered(event ->{
    	    	button.setScaleX(1.03);
    	    	button.setScaleY(1.03);
        	});
    	    button.setOnMouseExited(event ->{
    	    	button.setScaleX(1);
    	    	button.setScaleY(1);
        	});
            Button button2 = new Button(Integer.toString(i) + " Quarterly Earnings");
            button2.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
            button2.setMinSize(150, 25);
            button2.setOnMouseEntered(event ->{
    	    	button2.setScaleX(1.03);
    	    	button2.setScaleY(1.03);
        	});
    	    button2.setOnMouseExited(event ->{
    	    	button2.setScaleX(1);
    	    	button2.setScaleY(1);
        	});
            Button button3 = new Button(Integer.toString(i) + " Annual Meetings");
            button3.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
            button3.setMinSize(150, 25);
            button3.setOnMouseEntered(event ->{
    	    	button3.setScaleX(1.03);
    	    	button3.setScaleY(1.03);
        	});
    	    button3.setOnMouseExited(event ->{
    	    	button3.setScaleX(1);
    	    	button3.setScaleY(1);
        	});
            Button button4 = new Button(Integer.toString(i) + " Miscellaneous");
            button4.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
            button4.setMinSize(150, 25);
            button4.setOnMouseEntered(event ->{
    	    	button4.setScaleX(1.03);
    	    	button4.setScaleY(1.03);
        	});
    	    button4.setOnMouseExited(event ->{
    	    	button4.setScaleX(1);
    	    	button4.setScaleY(1);
        	});
            GridPane gridpane = new GridPane();
        	for (int j = 0; j <= 4; j++) {
        		Button jbutton = new Button("Quarter 1");
        		jbutton.setStyle("-fx-background-color: #E5E4DA;  -fx-border-color: black; -fx-border-width: 2px;");
        		jbutton.setMinSize(100, 25);
        		jbutton.setOnMouseEntered(event ->{
        	    	jbutton.setScaleX(1.03);
        	    	jbutton.setScaleY(1.03);
            	});
        	    jbutton.setOnMouseExited(event ->{
        	    	jbutton.setScaleX(1);
        	    	jbutton.setScaleY(1);
            	});
        		Button jbutton2 = new Button("Quarter 2");
        		jbutton2.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
        		jbutton2.setMinSize(100, 25);
        		jbutton2.setOnMouseEntered(event ->{
        	    	jbutton2.setScaleX(1.03);
        	    	jbutton2.setScaleY(1.03);
            	});
        	    jbutton2.setOnMouseExited(event ->{
        	    	jbutton2.setScaleX(1);
        	    	jbutton2.setScaleY(1);
            	});
        		Button jbutton3 = new Button("Quarter 3");
        		jbutton3.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
        		jbutton3.setMinSize(100, 25);
        		jbutton3.setOnMouseEntered(event ->{
        	    	jbutton3.setScaleX(1.03);
        	    	jbutton3.setScaleY(1.03);
            	});
        	    jbutton3.setOnMouseExited(event ->{
        	    	jbutton3.setScaleX(1);
        	    	jbutton3.setScaleY(1);
            	});
        		Button jbutton4 = new Button("Annual");
        		jbutton4.setStyle("-fx-background-color: #E5E4DA; -fx-border-color: black; -fx-border-width: 2px;");
        		jbutton4.setMinSize(100, 25);
        		jbutton4.setOnMouseEntered(event ->{
        	    	jbutton4.setScaleX(1.03);
        	    	jbutton4.setScaleY(1.03);
            	});
        	    jbutton4.setOnMouseExited(event ->{
        	    	jbutton4.setScaleX(1);
        	    	jbutton4.setScaleY(1);
            	});
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
            newsLabel.setStyle("-fx-font-size: 15; -fx-font-weight: bold;");
            newsLabel.setUnderline(true);
            VBox vbox1 = new VBox(10, newsLabel, button, button2, button3, button4);
            Label reportsLabel = new Label("REPORTS");
            reportsLabel.setStyle("-fx-font-size: 15; -fx-font-weight: bold;");
            reportsLabel.setUnderline(true);
            VBox vbox2 = new VBox(10, reportsLabel, gridpane);
            VBox vbox3 = new VBox(20, vbox1, vbox2);
            vbox3.setPadding(new Insets(20, 40, 40, 40));
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
        tabpane.setStyle("-fx-border-color: black; -fx-background-color: #e5e4da;");
        VBox vbox2 = new VBox(10, card1, card2, card3, tabpane);
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