package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainPage extends Application {

	private static Stage mainStage = null;

	@Override
	public void start(Stage primaryStage) {
		mainStage = primaryStage;

		showHomePage();
	}
	

	private static void showContent(String title, BorderPane root) {
		ScrollPane scrollPane = new ScrollPane();
    	scrollPane.setContent(root);
    	scrollPane.setFitToHeight(true);
    	scrollPane.setFitToWidth(true);
    	
        Scene scene = new Scene(scrollPane, 1366, 768);
		mainStage.setTitle(title);
		mainStage.setScene(scene);
		mainStage.show();
	}

	
	// Show HomePage Method
	public static void showHomePage() {
		BorderPane root = HomePage.getRoot();
		String title = "Home";
		
		showContent(title, root);
	}
	
	// Show NewsPage Method
	public static void showNewsPage() {
		BorderPane root = NewsPage.getRoot();
		String title = "News & Reports";
		
		showContent(title, root);
	}
	
	// Show LettersPage Method
	public static void showLettersPage() {
		BorderPane root = LettersPage.getRoot();
		String title = "Letters";
		
		showContent(title, root);
	}
	
	// Show SubsidiariesPage Method
	public static void showSubsidiariesPage() {
		BorderPane root = SubsidiariesPage.getRoot();
		String title = "Subsidiaries";
		
		showContent(title, root);
	}
			
		
	// Show AboutPage Method
	public static void showAboutPage() {
		BorderPane root = AboutPage.getRoot();
		String title = "About";
		
		showContent(title, root);
	}
	
	// Show InvestorsPage Method
	public static void showInvestorsPage() {
		BorderPane root = InvestorsPage.getRoot();
		String title = "Investments";
		
		showContent(title, root);
	}
	
	
	

	public static void main(String[] args) {
		launch(args);
	}
}