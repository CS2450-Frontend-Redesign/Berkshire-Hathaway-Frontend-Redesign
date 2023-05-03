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

	// Show HomePage Method
	public static void showHomePage() {
		ScrollPane root = HomePage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("Home");
		mainStage.setScene(scene);
		mainStage.show();
	}

	// Show NewsPage Method
	public static void showNewsPage() {
		ScrollPane root = NewsPage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("News");
		mainStage.setScene(scene);
		mainStage.show();
	}

	// Show ReportsPage Method
	public static void showReportsPage() {
		ScrollPane root = ReportsPage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("Reports");
		mainStage.setScene(scene);
		mainStage.show();
	}

	// Show LettersPage Method
	public static void showLettersPage() {
		ScrollPane root = LettersPage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("Letters");
		mainStage.setScene(scene);
		mainStage.show();
	}

	// Show SubsidiariesPage Method
	public static void showSubsidiariesPage() {
		ScrollPane root = SubsidiariesPage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("Subsidiaries");
		mainStage.setScene(scene);
		mainStage.show();
	}


	// Show AboutPage Method
	public static void showAboutPage() {
		ScrollPane root = AboutPage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("About");
		mainStage.setScene(scene);
		mainStage.show();
	}

	// Show InvestorsPage Method
	public static void showInvestorsPage() {
		ScrollPane root = InvestorsPage.getRoot();

		Scene scene = new Scene(root, 1280, 720);
		mainStage.setTitle("Investors");
		mainStage.setScene(scene);
		mainStage.show();
	}




	public static void main(String[] args) {
		launch(args);
	}
}