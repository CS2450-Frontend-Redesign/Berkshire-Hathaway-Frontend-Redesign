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

public class InvestorsPage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	BorderPane root = getRoot();

        Scene scene = new Scene(root, 1366, 768);
        primaryStage.setTitle("Investors!!!");
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
	    VBox b1 = new VBox();
	    b1.setMaxWidth(600);
	    b1.setMinHeight(400);
	    b1.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    
	    Label sec = new Label("SEC Filings");
	    sec.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label secText = new Label("Visit the US Securities and Exchange \nCommission's website to read about \nBerkshire Hathaway filings.");
	    secText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button secButton = new Button("Visit SEC");
	    secButton.setStyle("-fx-background-color: #542549; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    secButton.setOnMouseEntered(event ->{
	    	secButton.setScaleX(1.03);
	    	secButton.setScaleY(1.03);
    	});
	    secButton.setOnMouseExited(event ->{
	    	secButton.setScaleX(1);
	    	secButton.setScaleY(1);
    	});
	    secButton.setMinSize(80, 50);
	    b1.setAlignment(Pos.CENTER_LEFT);
	    b1.setSpacing(40);
	    b1.getChildren().addAll(sec, secText, secButton);
	    
	    secButton.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.sec.gov/cgi-bin/browse-edgar?company=berkshire+hathaway&match=&CIK=&filenum=&State=&Country=&SIC=&owner=exclude&Find=Find+Companies&action=getcompany"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });

	    VBox b2 = new VBox();
	    b2.setMaxWidth(600);
	    b2.setMinHeight(400);
	    b2.setStyle("-fx-background-color: #363842; -fx-padding: 40;");
	    
	    Label annual = new Label("Annual Meeting Information");
	    annual.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label anText = new Label("The 2023 Annual Meeting will be on \nMay 6, 2023");
	    anText.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button anButton = new Button("Read 2023 Guide");
	    anButton.setStyle("-fx-background-color: #363842; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    anButton.setOnMouseEntered(event ->{
	    	anButton.setScaleX(1.03);
	    	anButton.setScaleY(1.03);
    	});
	    anButton.setOnMouseExited(event ->{
	    	anButton.setScaleX(1);
	    	anButton.setScaleY(1);
    	});
	    anButton.setMinSize(80, 50);
	    b2.setAlignment(Pos.CENTER_LEFT);
	    b2.setSpacing(40);
	    b2.getChildren().addAll(annual, anText, anButton);
	    
	    anButton.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/meet01/visguide2023.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
	    VBox b3 = new VBox();
	    b3.setMaxWidth(600);
	    b3.setMinHeight(400);
	    b3.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    
	    Label pres = new Label("Berkshire Hathaway Energy \nInvestor Presentations");
	    pres.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Button pres22 = new Button("View 2022 Presentation");
	    pres22.setStyle("-fx-background-color: #542549; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    pres22.setOnMouseEntered(event ->{
	    	pres22.setScaleX(1.03);
	    	pres22.setScaleY(1.03);
    	});
	    pres22.setOnMouseExited(event ->{
	    	pres22.setScaleX(1);
	    	pres22.setScaleY(1);
    	});
	    pres22.setMinSize(200, 50);
	    Button pres21 = new Button("View 2021 Presentation");
	    pres21.setStyle("-fx-background-color: #542549; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    pres21.setOnMouseEntered(event ->{
	    	pres21.setScaleX(1.03);
	    	pres21.setScaleY(1.03);
    	});
	    pres21.setOnMouseExited(event ->{
	    	pres21.setScaleX(1);
	    	pres21.setScaleY(1);
    	});
	    pres21.setMinSize(200, 50);
	    
	    b3.setAlignment(Pos.CENTER_LEFT);
	    b3.setSpacing(40);
	    b3.getChildren().addAll(pres, pres22, pres21);
	    
	    pres22.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/bhenergy/BHE2022InvestPresent.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    pres21.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/bhenergy/BHE2021InvestPresent.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
	    VBox b4 = new VBox();
	    b4.setMaxWidth(600);
	    b4.setMinHeight(400);
	    b4.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    
	    Label stock = new Label("Common Stock Information");
	    stock.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Button comp = new Button("View Class A/B Stock");
	    comp.setStyle("-fx-background-color: #363842; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    comp.setOnMouseEntered(event ->{
	    	comp.setScaleX(1.03);
	    	comp.setScaleY(1.03);
    	});
	    comp.setOnMouseExited(event ->{
	    	comp.setScaleX(1);
	    	comp.setScaleY(1);
    	});
	    comp.setMinSize(200, 50);
	    Button comm = new Button("View Common Stock Info");
	    comm.setStyle("-fx-background-color: #363842; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    comm.setOnMouseEntered(event ->{
	    	comm.setScaleX(1.03);
	    	comm.setScaleY(1.03);
    	});
	    comm.setOnMouseExited(event ->{
	    	comm.setScaleX(1);
	    	comm.setScaleY(1);
    	});
	    comm.setMinSize(200, 50);
	    b4.setAlignment(Pos.CENTER_LEFT);
	    b4.setSpacing(40);
	    b4.getChildren().addAll(stock, comp, comm);
	    
	    comp.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/brkshareholderinfo/compab.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    comm.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/brkshareholderinfo/transferagentinfo.pdf"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    
	    VBox b5 = new VBox();
	    b5.setMaxWidth(600);
	    b5.setMinHeight(400);
	    b5.setStyle("-fx-background-color: #542549; -fx-padding: 40;");
	    
	    Label act = new Label("Investments in Activision \nCommon Stock");
	    act.setStyle("-fx-font-size: 30; -fx-font-weight: bold; -fx-text-fill: white;");
	    Label actLbl = new Label("Today I read your February 15 story about \nlast year's Activision purchases by \nBerkshire...");
	    actLbl.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
	    Button actBtn = new Button("Read Full Document");
	    actBtn.setStyle("-fx-background-color: #542549; -fx-text-fill: #FFFFFF; -fx-font-size: 16; -fx-border-color: white; -fx-border-width: 2px; -fx-font-weight: bold;");
	    actBtn.setOnMouseEntered(event ->{
	    	actBtn.setScaleX(1.03);
	    	actBtn.setScaleY(1.03);
    	});
	    actBtn.setOnMouseExited(event ->{
	    	actBtn.setScaleX(1);
	    	actBtn.setScaleY(1);
    	});
	    actBtn.setMinSize(200, 50);
	    b5.setAlignment(Pos.CENTER_LEFT);
	    b5.setSpacing(40);
	    b5.getChildren().addAll(act, actLbl, actBtn);
	    
	    actBtn.setOnAction(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/activisionltr.pdf"));
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
        
        b3.setOnMouseEntered(event ->{
            b3.setScaleX(1.03);
            b3.setScaleY(1.03);
        });
        b3.setOnMouseExited(event ->{
            b3.setScaleX(1);
            b3.setScaleY(1);
        });
        
        b4.setOnMouseEntered(event ->{
            b4.setScaleX(1.03);
            b4.setScaleY(1.03);
        });
        b4.setOnMouseExited(event ->{
            b4.setScaleX(1);
            b4.setScaleY(1);
        });
        
        b5.setOnMouseEntered(event ->{
            b5.setScaleX(1.03);
            b5.setScaleY(1.03);
        });
        b5.setOnMouseExited(event ->{
            b5.setScaleX(1);
            b5.setScaleY(1);
        });
	    
	    // Create content section with 2x2 grid layout
	    GridPane contentSection = new GridPane();
	    contentSection.setStyle("-fx-padding: 50;");
	    contentSection.setHgap(50);
	    contentSection.setVgap(50);
	    contentSection.setAlignment(Pos.CENTER);

	    contentSection.add(b1, 0, 0);
	    contentSection.add(b2, 1, 0);
	    contentSection.add(b3, 0, 1);
	    contentSection.add(b4, 1, 1);
	    contentSection.add(b5, 0, 2);
	
//	    centerPane.setTop();
	    centerPane.setCenter(contentSection);
//	    centerPane.setBottom();
	
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