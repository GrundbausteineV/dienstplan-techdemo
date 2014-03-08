package application.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import application.Main;
import application.MainSceneController;

public class guiMainScene {
	
	private Main app;
	private Scene mainScene;
	AnchorPane contentPage;
	
	public guiMainScene(Main app)	{
		
		this.app = app;
		
		createMainScene();
		
	}
	
	private void createMainScene() {
		
		try {
	        FXMLLoader loader = new FXMLLoader(app.getClass().getResource("/Content.fxml"));
	        contentPage = (AnchorPane) loader.load();
	        
	        // Give the controller access to the main app
		    MainSceneController controller = loader.getController();
		    controller.setMainApp(app);
	        //root.setCenter(contentPage);
			
			//mainScene = new Scene(root,1024,768);
			//mainScene.getStylesheets().add(app.getClass().getResource("application.css").toExternalForm());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Scene getMainScene() {
		return mainScene;
	}
	
	public AnchorPane getContentPage() {
		return contentPage;
	}
	
}