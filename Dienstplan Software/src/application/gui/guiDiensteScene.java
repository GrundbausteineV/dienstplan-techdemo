package application.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import application.Main;
import application.MainDiensteController;

public class guiDiensteScene {
	
	private Main app;
	private Scene diensteScene;
	AnchorPane contentPage;
	
	public guiDiensteScene(Main app)	{
		
		this.app = app;
		
		createDiensteScene();
		
	}
	
	private void createDiensteScene() {
		
		try {
	        FXMLLoader loader = new FXMLLoader(app.getClass().getResource("/Dienste.fxml"));
	        contentPage = (AnchorPane) loader.load();
	        
	        // Give the controller access to the main app
		    MainDiensteController controller = loader.getController();
		    controller.setMainApp(app);
	        //root.setCenter(contentPage);
			
			//mainScene = new Scene(root,1024,768);
			//mainScene.getStylesheets().add(app.getClass().getResource("application.css").toExternalForm());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Scene getDiensteScene() {
		return diensteScene;
	}
	
	public AnchorPane getContentPage() {
		return contentPage;
	}
	
}