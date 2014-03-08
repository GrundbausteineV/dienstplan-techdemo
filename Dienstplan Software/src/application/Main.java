package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import application.gui.*;

public class Main extends Application {
	
	public guiMainScene guiMainScene = null;
	public guiDiensteScene guiDiensteScene = null;
	public guiDienstplanScene guiDienstplanScene = null;
	
	private BorderPane rootLayout;
	
	private ObservableList<String> personData = FXCollections.observableArrayList();
	private ObservableList<String> diensteData = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage primaryStage) {
		
		try {			
	        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Root.fxml"));
	        rootLayout = (BorderPane) loader.load();
	        Scene scene = new Scene(rootLayout);	        

		    MainController controller = loader.getController();
		    controller.setMainApp(this);

			//BorderPane root = new BorderPane();

			guiDienstplanScene = new guiDienstplanScene(this);
			guiDiensteScene = new guiDiensteScene(this);
			guiMainScene = new guiMainScene(this);
			
			rootLayout.setCenter(guiMainScene.getContentPage());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Grundbaustein e.V. Dienstplan-Software 2014");
			//primaryStage.getIcons().add(new Image("/resources/icons/app-icon.png"));
			//primaryStage.getIcons().add(new Image("/resources/icons/favicon_32.png"));
			//primaryStage.getIcons().add(new Image("/resources/icons/favicon_64.png"));
			primaryStage.getIcons().add(new Image("/resources/icons/blue-folder.png"));
			primaryStage.setMinWidth(800);
			primaryStage.setMinHeight(600);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		personData.add("Jan-Eric Dreßler");
	    personData.add("Katja Pommerening");
	    personData.add("Enrico Winkler");
	    personData.add("Till Grüning");
	    personData.add("Max 'Der vom deutschen Personalausweis' Mustermann");
	    FXCollections.sort(personData);
		
		diensteData.add("06:00 - 12:00");
		diensteData.add("09:00 - 17:30");
		diensteData.add("07:30 - 16:00");
		diensteData.add("06:00 - 14:30");
	    FXCollections.sort(diensteData);


	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public ObservableList<String> getPersonData() {
		return personData;
	}

	public ObservableList<String> getDiensteData() {
		return diensteData;
	}

	public void addPersonData(String string) {
		personData.add(string);
	}
	
	public void loadMainScene() {
		rootLayout.setCenter(guiMainScene.getContentPage());
	}
	
	public void loadDiensteScene() {
		rootLayout.setCenter(guiDiensteScene.getContentPage());
	}
	
	public void loadDienstplanScene() {
		rootLayout.setCenter(guiDienstplanScene.getContentPage());
	}


}
