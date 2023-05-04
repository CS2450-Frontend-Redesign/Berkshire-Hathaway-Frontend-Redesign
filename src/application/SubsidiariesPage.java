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
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class SubsidiariesPage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	BorderPane root = getRoot();

        Scene scene = new Scene(root, 1366, 768);
        primaryStage.setTitle("Subsidiaries!!!");
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
        
        Label ourComp = new Label("Our Companies");
        ourComp.setOnMouseEntered(e -> {
        	ourComp.setUnderline(true);
        });
        ourComp.setOnMouseExited(e -> {
        	ourComp.setUnderline(false);
        });
        ourComp.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showSubsidiariesPage();
			}
        	
		});
        ourComp.setStyle("-fx-font-size: 40; -fx-font-weight: bold; -fx-font-family: georgia; -fx-padding: 20");
        ourComp.setAlignment(Pos.CENTER);
        VBox title = new VBox(ourComp);
        title.setAlignment(Pos.CENTER);
        title.setSpacing(20);

	    // Create Vboxes to hold card contents
	    VBox a1 = new VBox();
	    a1.maxWidth(350);
	    a1.setMinHeight(100);
	    a1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label acme = new Label("Acme Brick Company");
	    acme.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    a1.setAlignment(Pos.CENTER_LEFT);
	    a1.setSpacing(20);
	    a1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://brick.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    a1.getChildren().addAll(acme);

	    VBox a2 = new VBox();
	    a2.maxWidth(350);
	    a2.setMinHeight(100);
	    a2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label alle = new Label("Alleghany Corporation");
	    alle.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    a2.setAlignment(Pos.CENTER_LEFT);
	    a2.setSpacing(20);
	    a2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.alleghany.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    a2.getChildren().addAll(alle);
	
	    VBox b1 = new VBox();
	    b1.maxWidth(350);
	    b1.setMinHeight(100);
	    b1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label ben = new Label("Ben Bridge Jeweler");
	    ben.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    b1.setAlignment(Pos.CENTER_LEFT);
	    b1.setSpacing(20);
	    b1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.benbridge.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b1.getChildren().addAll(ben);

	    VBox b2 = new VBox();
	    b2.maxWidth(350);
	    b2.setMinHeight(100);
	    b2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label benj = new Label("Benjamin Moore & Co.");
	    benj.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    b2.setAlignment(Pos.CENTER_LEFT);
	    b2.setSpacing(20);
	    b2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.benjaminmoore.com/en-us"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b2.getChildren().addAll(benj);
	    
	    VBox b3 = new VBox();
	    b3.setMaxWidth(350);
	    b3.setMinHeight(100);
	    b3.setStyle("-fx-background-color: #542549; -fx-padding: 20;");
	    Label berA = new Label("Berkshire Hathaway Automotive");
	    berA.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    b3.setAlignment(Pos.CENTER_LEFT);
	    b3.setSpacing(20);
	    b3.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathawayautomotive.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b3.getChildren().addAll(berA);
	
	    VBox b4 = new VBox();
	    b4.setMaxWidth(350);
	    b4.setMinHeight(100);
	    b4.setStyle("-fx-background-color: #15158A; -fx-padding: 20;");
	    Label berkDI = new Label("Berkshire Hathaway Direct Insurance Company (THREE)");
	    berkDI.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    b4.setAlignment(Pos.CENTER_LEFT);
	    b4.setSpacing(20);
	    b4.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://threeinsurance.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b4.getChildren().addAll(berkDI);
	    
	    VBox b5 = new VBox();
	    b5.maxWidth(350);
	    b5.setMinHeight(100);
	    b5.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label bors = new Label("Borsheims Fine Jewelry");
	    bors.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    b5.setAlignment(Pos.CENTER_LEFT);
	    b5.setSpacing(20);
	    b5.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.borsheims.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b5.getChildren().addAll(bors);
	    
	    VBox b6 = new VBox();
	    b6.maxWidth(350);
	    b6.setMinHeight(100);
	    b6.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label boat = new Label("BoatU.S.");
	    boat.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    b6.setAlignment(Pos.CENTER_LEFT);
	    b6.setSpacing(20);
	    b6.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.boatus.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b6.getChildren().addAll(boat);
	    
	    VBox b7 = new VBox();
	    b7.setMaxWidth(350);
	    b7.setMinHeight(100);
	    b7.setStyle("-fx-background-color: #542549; -fx-padding: 20;");
	    Label brooks = new Label("Berkshire Hathaway Automotive");
	    brooks.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    b7.setAlignment(Pos.CENTER_LEFT);
	    b7.setSpacing(20);
	    b7.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.brooksrunning.com/en_us"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b7.getChildren().addAll(brooks);
	
	    VBox b8 = new VBox();
	    b8.setMaxWidth(350);
	    b8.setMinHeight(100);
	    b8.setStyle("-fx-background-color: #15158A; -fx-padding: 20;");
	    Label busi = new Label("Business Wire");
	    busi.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    b8.setAlignment(Pos.CENTER_LEFT);
	    b8.setSpacing(20);
	    b8.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.businesswire.com/portal/site/home/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    b8.getChildren().addAll(busi);
	
	    VBox c1 = new VBox();
	    c1.maxWidth(350);
	    c1.setMinHeight(100);
	    c1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label cent = new Label("Central States Indemnity Company");
	    cent.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    c1.setAlignment(Pos.CENTER_LEFT);
	    c1.setSpacing(20);
	    c1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.csi-omaha.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    c1.getChildren().addAll(cent);

	    VBox c2 = new VBox();
	    c2.maxWidth(350);
	    c2.setMinHeight(100);
	    c2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label clay = new Label("Clayton Homes");
	    clay.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    c2.setAlignment(Pos.CENTER_LEFT);
	    c2.setSpacing(20);
	    c2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.claytonhomes.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    c2.getChildren().addAll(clay);
	    
	    VBox c3 = new VBox();
	    c3.setMaxWidth(350);
	    c3.setMinHeight(100);
	    c3.setStyle("-fx-background-color: #542549; -fx-padding: 20;");
	    Label cort = new Label("CORT Business Services");
	    cort.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    c3.setAlignment(Pos.CENTER_LEFT);
	    c3.setSpacing(20);
	    c3.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.cort.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    c3.getChildren().addAll(cort);
	
	    VBox c4 = new VBox();
	    c4.setMaxWidth(350);
	    c4.setMinHeight(100);
	    c4.setStyle("-fx-background-color: #15158A; -fx-padding: 20;");
	    Label cbt = new Label("CBT Inc.");
	    cbt.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    c4.setAlignment(Pos.CENTER_LEFT);
	    c4.setSpacing(20);
	    c4.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.ctbinc.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    c4.getChildren().addAll(cbt);
	    
	    VBox d1 = new VBox();
	    d1.maxWidth(350);
	    d1.setMinHeight(100);
	    d1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label dura = new Label("Duracell");
	    dura.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    d1.setAlignment(Pos.CENTER_LEFT);
	    d1.setSpacing(20);
	    d1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.duracell.com/en-us/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    d1.getChildren().addAll(dura);
	    
	    VBox f1 = new VBox();
	    f1.maxWidth(350);
	    f1.setMinHeight(100);
	    f1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label fech = new Label("Fechheimer Brothers Company");
	    fech.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    f1.setAlignment(Pos.CENTER_LEFT);
	    f1.setSpacing(20);
	    f1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("http://www.fechheimer.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    f1.getChildren().addAll(fech);

	    VBox f2 = new VBox();
	    f2.maxWidth(350);
	    f2.setMinHeight(100);
	    f2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label flig = new Label("FlightSafety");
	    flig.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    f2.setAlignment(Pos.CENTER_LEFT);
	    f2.setSpacing(20);
	    f2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.flightsafety.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    f2.getChildren().addAll(flig);
	    
	    VBox f3 = new VBox();
	    f3.setMaxWidth(350);
	    f3.setMinHeight(100);
	    f3.setStyle("-fx-background-color: #542549; -fx-padding: 20;");
	    Label fore = new Label("Forest River");
	    fore.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    f3.setAlignment(Pos.CENTER_LEFT);
	    f3.setSpacing(20);
	    f3.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.forestriverinc.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    f3.getChildren().addAll(fore);
	
	    VBox f4 = new VBox();
	    f4.setMaxWidth(350);
	    f4.setMinHeight(100);
	    f4.setStyle("-fx-background-color: #15158A; -fx-padding: 20;");
	    Label frui = new Label("Fruit of the Loom Companies");
	    frui.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    f4.setAlignment(Pos.CENTER_LEFT);
	    f4.setSpacing(20);
	    f4.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.berkshirehathaway.com/subs/fruit.html"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    f4.getChildren().addAll(frui);
	    
	    VBox g1 = new VBox();
	    g1.maxWidth(350);
	    g1.setMinHeight(100);
	    g1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label gate = new Label("Gateway Underwriters Agency");
	    gate.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    g1.setAlignment(Pos.CENTER_LEFT);
	    g1.setSpacing(20);
	    g1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.gua-stl.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    g1.getChildren().addAll(gate);

	    VBox g2 = new VBox();
	    g2.maxWidth(350);
	    g2.setMinHeight(100);
	    g2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label geico = new Label("GEICO Auto Insurance");
	    geico.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    g2.setAlignment(Pos.CENTER_LEFT);
	    g2.setSpacing(20);
	    g2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.geico.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    g2.getChildren().addAll(geico);
	    
	    VBox k1 = new VBox();
	    k1.maxWidth(350);
	    k1.setMinHeight(100);
	    k1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label kraft = new Label("Kraft Heinz");
	    kraft.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    k1.setAlignment(Pos.CENTER_LEFT);
	    k1.setSpacing(20);
	    k1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.kraftheinzcompany.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    k1.getChildren().addAll(kraft);
	    
	    VBox m1 = new VBox();
	    m1.maxWidth(350);
	    m1.setMinHeight(100);
	    m1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label mcla = new Label("McLane Company");
	    mcla.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    m1.setAlignment(Pos.CENTER_LEFT);
	    m1.setSpacing(20);
	    m1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.mclaneco.com/content/mclaneco/en/home.html"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    m1.getChildren().addAll(mcla);

	    VBox m2 = new VBox();
	    m2.maxWidth(350);
	    m2.setMinHeight(100);
	    m2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label med = new Label("MedPro Group");
	    med.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    m2.setAlignment(Pos.CENTER_LEFT);
	    m2.setSpacing(20);
	    m2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.medpro.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    m2.getChildren().addAll(med);
	    
	    VBox n1 = new VBox();
	    n1.maxWidth(350);
	    n1.setMinHeight(100);
	    n1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label net = new Label("NetJets®");
	    net.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    n1.setAlignment(Pos.CENTER_LEFT);
	    n1.setSpacing(20);
	    n1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.netjets.com/en-us/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    n1.getChildren().addAll(net);
	    
	    VBox s1 = new VBox();
	    s1.maxWidth(350);
	    s1.setMinHeight(100);
	    s1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label see = new Label("See's Candies");
	    see.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    s1.setAlignment(Pos.CENTER_LEFT);
	    s1.setSpacing(20);
	    s1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.sees.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    s1.getChildren().addAll(see);

	    VBox s2 = new VBox();
	    s2.maxWidth(350);
	    s2.setMinHeight(100);
	    s2.setStyle("-fx-background-color: #E5E4DA; -fx-padding: 20;");
	    Label star = new Label("Star Furniture");
	    star.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
	    s2.setAlignment(Pos.CENTER_LEFT);
	    s2.setSpacing(20);
	    s2.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.starfurniture.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    s2.getChildren().addAll(star);
	    
	    VBox u1 = new VBox();
	    u1.maxWidth(350);
	    u1.setMinHeight(100);
	    u1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label unit = new Label("United States Liability Insurance Group");
	    unit.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    u1.setAlignment(Pos.CENTER_LEFT);
	    u1.setSpacing(20);
	    u1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.usli.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    u1.getChildren().addAll(unit);
	    
	    VBox x1 = new VBox();
	    x1.maxWidth(350);
	    x1.setMinHeight(100);
	    x1.setStyle("-fx-background-color: #363842; -fx-padding: 20;");
	    Label xtra = new Label("XTRA Corporation");
	    xtra.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: white;");
	    x1.setAlignment(Pos.CENTER_LEFT);
	    x1.setSpacing(20);
	    x1.setOnMouseClicked(e -> {
	    	try {
				Desktop.getDesktop().browse(new URI("https://www.xtralease.com/"));
			} catch (Exception r) {
				System.out.println("Try another link");
			}
	    });
	    x1.getChildren().addAll(xtra);
	    
	    // Create content section with 2x2 grid layout
	    GridPane contentSection = new GridPane();
	    contentSection.setStyle("-fx-padding: 20;");
	    contentSection.setHgap(20);
	    contentSection.setVgap(50);
	    contentSection.setAlignment(Pos.CENTER);
	    
	    Label aI = new Label("A");
        aI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label bI = new Label("B");
        bI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label cI = new Label("C");
        cI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label dI = new Label("D");
        dI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label fI = new Label("F");
        fI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label gI = new Label("G");
        gI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label kI = new Label("K");
        kI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label mI = new Label("M");
        mI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label nI = new Label("N");
        nI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label sI = new Label("S");
        sI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label uI = new Label("U");
        uI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        Label xI = new Label("X");
        xI.setStyle("-fx-font-size: 30; -fx-font-family: georgia; -fx-font-weight: bold;");
        
        contentSection.add(aI, 0, 0);
        contentSection.add(bI, 0, 1);
        contentSection.add(cI, 0, 3);
        contentSection.add(dI, 0, 4);
        contentSection.add(fI, 0, 5);
        contentSection.add(gI, 0, 6);
        contentSection.add(kI, 0, 7);
        contentSection.add(mI, 0, 8);
        contentSection.add(nI, 0, 9);
        contentSection.add(sI, 0, 10);        
        contentSection.add(uI, 0, 11);
        contentSection.add(xI, 0, 12);


	    contentSection.add(a1, 1, 0);
	    contentSection.add(a2, 2, 0);
	    contentSection.add(b1, 1, 1);
	    contentSection.add(b2, 2, 1);
	    contentSection.add(b3, 3, 1);
	    contentSection.add(b4, 4, 1);
	    contentSection.add(b5, 1, 2);
	    contentSection.add(b6, 2, 2);
	    contentSection.add(b7, 3, 2);
	    contentSection.add(b8, 4, 2);
	    contentSection.add(c1, 1, 3);
	    contentSection.add(c2, 2, 3);
	    contentSection.add(c3, 3, 3);
	    contentSection.add(c4, 4, 3);
	    contentSection.add(d1, 1, 4);
	    contentSection.add(f1, 1, 5);
	    contentSection.add(f2, 2, 5);
	    contentSection.add(f3, 3, 5);
	    contentSection.add(f4, 4, 5);
	    contentSection.add(g1, 1, 6);
	    contentSection.add(g2, 2, 6);
	    contentSection.add(k1, 1, 7);
	    contentSection.add(m1, 1, 8);
	    contentSection.add(m2, 2, 8);
	    contentSection.add(n1, 1, 9);
	    contentSection.add(s1, 1, 10);
	    contentSection.add(s2, 2, 10);
	    contentSection.add(u1, 1, 11);
	    contentSection.add(x1, 1, 12);
	    
	    Button a = new Button("A");
        Button b = new Button("B");
        Button c = new Button("C");
        Button d = new Button("D");
        Button f = new Button("F");
        Button g = new Button("G");
        Button k = new Button("K");
        Button m = new Button("M");
        Button n = new Button("N");
        Button s = new Button("S");
        Button u = new Button("U");
        Button x = new Button("X");
        
        a.setStyle("-fx-background-color: lightblue;");
        b.setStyle("-fx-background-color: lightblue;");
        c.setStyle("-fx-background-color: lightblue;");
        d.setStyle("-fx-background-color: lightblue;");
        f.setStyle("-fx-background-color: lightblue;");
        g.setStyle("-fx-background-color: lightblue;");
        k.setStyle("-fx-background-color: lightblue;");
        m.setStyle("-fx-background-color: lightblue;");
        n.setStyle("-fx-background-color: lightblue;");
        s.setStyle("-fx-background-color: lightblue;");
        u.setStyle("-fx-background-color: lightblue;");
        x.setStyle("-fx-background-color: lightblue;");
        
        HBox letNav = new HBox(a,b,c,d,f,g,k,m,n,s,u,x);
        letNav.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
        letNav.setAlignment(Pos.CENTER);
        letNav.setSpacing(40);
        a.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	a.setUnderline(true);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane AcontentSection = new GridPane();
    	    AcontentSection.setStyle("-fx-padding: 200;");
    	    AcontentSection.setHgap(20);
    	    AcontentSection.setVgap(50);
    	    AcontentSection.setAlignment(Pos.CENTER);
    	    AcontentSection.add(a1, 0, 0);
    	    AcontentSection.add(a2, 1, 0);
    	    centerPane.setCenter(AcontentSection);
    	    centerPane.setLeft(null);
        });
        b.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	b.setUnderline(true);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane BcontentSection = new GridPane();
    	    BcontentSection.setStyle("-fx-padding: 200;");
    	    BcontentSection.setHgap(20);
    	    BcontentSection.setVgap(50);
    	    BcontentSection.setAlignment(Pos.CENTER);
    	    BcontentSection.add(b1, 0, 0);
    	    BcontentSection.add(b2, 1, 0);
    	    BcontentSection.add(b3, 2, 0);
    	    BcontentSection.add(b4, 3, 0);
    	    BcontentSection.add(b5, 0, 1);
    	    BcontentSection.add(b6, 1, 1);
    	    BcontentSection.add(b7, 2, 1);
    	    BcontentSection.add(b8, 3, 1);
    	    centerPane.setCenter(BcontentSection);
    	    centerPane.setLeft(null);
        });
        c.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	c.setUnderline(true);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane CcontentSection = new GridPane();
    	    CcontentSection.setStyle("-fx-padding: 200;");
    	    CcontentSection.setHgap(20);
    	    CcontentSection.setVgap(50);
    	    CcontentSection.setAlignment(Pos.CENTER);
    	    CcontentSection.add(c1, 0, 0);
    	    CcontentSection.add(c2, 1, 0);
    	    CcontentSection.add(c3, 2, 0);
    	    CcontentSection.add(c4, 3, 0);
    	    centerPane.setCenter(CcontentSection);
    	    centerPane.setLeft(null);
        });
        d.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	d.setUnderline(true);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane DcontentSection = new GridPane();
    	    DcontentSection.setStyle("-fx-padding: 200;");
    	    DcontentSection.setHgap(20);
    	    DcontentSection.setVgap(50);
    	    DcontentSection.setAlignment(Pos.CENTER);
    	    DcontentSection.add(d1, 0, 0);
    	    centerPane.setCenter(DcontentSection);
    	    centerPane.setLeft(null);
        });
        f.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	f.setUnderline(true);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane FcontentSection = new GridPane();
    	    FcontentSection.setStyle("-fx-padding: 200;");
    	    FcontentSection.setHgap(20);
    	    FcontentSection.setVgap(50);
    	    FcontentSection.setAlignment(Pos.CENTER);
    	    FcontentSection.add(f1, 0, 0);
    	    FcontentSection.add(f2, 1, 0);
    	    FcontentSection.add(f3, 3, 0);
    	    FcontentSection.add(f4, 4, 0);
    	    centerPane.setCenter(FcontentSection);
    	    centerPane.setLeft(null);
        });
        g.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	g.setUnderline(true);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane GcontentSection = new GridPane();
    	    GcontentSection.setStyle("-fx-padding: 200;");
    	    GcontentSection.setHgap(20);
    	    GcontentSection.setVgap(50);
    	    GcontentSection.setAlignment(Pos.CENTER);
    	    GcontentSection.add(g1, 0, 0);
    	    GcontentSection.add(g2, 1, 0);
    	    centerPane.setCenter(GcontentSection);
    	    centerPane.setLeft(null);
        });
        k.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	k.setUnderline(true);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane KcontentSection = new GridPane();
    	    KcontentSection.setStyle("-fx-padding: 200;");
    	    KcontentSection.setHgap(20);
    	    KcontentSection.setVgap(50);
    	    KcontentSection.setAlignment(Pos.CENTER);
    	    KcontentSection.add(k1, 0, 0);
    	    centerPane.setCenter(KcontentSection);
    	    centerPane.setLeft(null);
        });
        m.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	m.setUnderline(true);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane McontentSection = new GridPane();
    	    McontentSection.setStyle("-fx-padding: 200;");
    	    McontentSection.setHgap(20);
    	    McontentSection.setVgap(50);
    	    McontentSection.setAlignment(Pos.CENTER);
    	    McontentSection.add(m1, 0, 0);
    	    McontentSection.add(m2, 1, 0);
    	    centerPane.setCenter(McontentSection);
    	    centerPane.setLeft(null);
        });
        n.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	n.setUnderline(true);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane NcontentSection = new GridPane();
    	    NcontentSection.setStyle("-fx-padding: 200;");
    	    NcontentSection.setHgap(20);
    	    NcontentSection.setVgap(50);
    	    NcontentSection.setAlignment(Pos.CENTER);
    	    NcontentSection.add(n1, 0, 0);
    	    centerPane.setCenter(NcontentSection);
    	    centerPane.setLeft(null);
        });
        s.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	s.setUnderline(true);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane ScontentSection = new GridPane();
    	    ScontentSection.setStyle("-fx-padding: 200;");
    	    ScontentSection.setHgap(20);
    	    ScontentSection.setVgap(50);
    	    ScontentSection.setAlignment(Pos.CENTER);
    	    ScontentSection.add(s1, 0, 0);
    	    ScontentSection.add(s2, 1, 0);
    	    centerPane.setCenter(ScontentSection);
    	    centerPane.setLeft(null);
        });
        u.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	u.setUnderline(true);
        	x.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	x.setUnderline(false);
        	System.out.println("worked");
    	    
    	    GridPane UcontentSection = new GridPane();
    	    UcontentSection.setStyle("-fx-padding: 200;");
    	    UcontentSection.setHgap(20);
    	    UcontentSection.setVgap(50);
    	    UcontentSection.setAlignment(Pos.CENTER);
    	    UcontentSection.add(u1, 0, 0);
    	    centerPane.setCenter(UcontentSection);
    	    centerPane.setLeft(null);
        });
        x.setOnAction(e -> {
        	System.out.println("worked");
        	a.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	a.setUnderline(false);
        	b.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	b.setUnderline(false);
        	c.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	c.setUnderline(false);
        	d.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	d.setUnderline(false);
        	f.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	f.setUnderline(false);
        	g.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	g.setUnderline(false);
        	k.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	k.setUnderline(false);
        	m.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	m.setUnderline(false);
        	n.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	n.setUnderline(false);
        	s.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	s.setUnderline(false);
        	u.setStyle("-fx-text-fill: black; -fx-background-color: lightblue;");
        	u.setUnderline(false);
        	x.setStyle("-fx-text-fill: red; -fx-background-color: lightblue;");
        	x.setUnderline(true);
        	System.out.println("worked");
    	    
    	    GridPane XcontentSection = new GridPane();
    	    XcontentSection.setStyle("-fx-padding: 200;");
    	    XcontentSection.setHgap(20);
    	    XcontentSection.setVgap(50);
    	    XcontentSection.setAlignment(Pos.CENTER);
    	    XcontentSection.add(x1, 0, 0);
    	    centerPane.setCenter(XcontentSection);
    	    centerPane.setLeft(null);
        });
        
        VBox compAndFil = new VBox(20,title,letNav);
        
//	    centerPane.setTop();
	    centerPane.setTop(compAndFil);
	    centerPane.setCenter(contentSection);
	    //centerPane.setLeft(leftIndex);
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