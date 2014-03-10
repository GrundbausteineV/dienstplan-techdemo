package application.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import application.Main;
import application.MainDienstplanController;

public class guiDienstplanScene {
	
	private Main app;
	private Scene dienstplanScene;
	AnchorPane contentPage;
	
	public guiDienstplanScene(Main app)	{
		
		this.app = app;
		
		createDienstplanScene();
		
	}
	
	private void createDienstplanScene() {
		
		try {
	        FXMLLoader loader = new FXMLLoader(app.getClass().getResource("/Dienstplan.fxml"));
	        contentPage = (AnchorPane) loader.load();
	        
	        // Give the controller access to the main app
		    MainDienstplanController controller = loader.getController();
		    controller.setMainApp(app);
		    
	        //root.setCenter(contentPage);
			
			//mainScene = new Scene(root,1024,768);
			//mainScene.getStylesheets().add(app.getClass().getResource("application.css").toExternalForm());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Scene getDienstplanScene() {
		return dienstplanScene;
	}
	
	public AnchorPane getContentPage() {
		return contentPage;
	}
	
}