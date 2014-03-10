package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MainDienstplanController {
  
  // Reference to the main application
  @SuppressWarnings("unused")
  private Main app;
  
  @FXML
  GridPane dienstplanRaster;
  
  /**
  * The constructor.
  * The constructor is called before the initialize() method.
  */
  public MainDienstplanController() {
  }
  
  /**
  * Initializes the controller class. This method is automatically called
  * after the fxml file has been loaded.
  */
  @FXML
  private void initialize() {
	  
  }

  /**
  * Is called by the main application to give a reference back to itself.
 * @param root 
  * 
  * @param mainApp
  */
  public void setMainApp(Main app) {
      this.app = app;
      
      try {
	        FXMLLoader loader1 = new FXMLLoader(app.getClass().getResource("/MitarbeiterSpalte.fxml"));
	        AnchorPane contentPage1 = (AnchorPane) loader1.load();
	        FXMLLoader loader2 = new FXMLLoader(app.getClass().getResource("/MitarbeiterSpalte.fxml"));
	        AnchorPane contentPage2 = (AnchorPane) loader2.load();
	        FXMLLoader loader3 = new FXMLLoader(app.getClass().getResource("/MitarbeiterSpalte.fxml"));
	        AnchorPane contentPage3 = (AnchorPane) loader3.load();
	        FXMLLoader loader4 = new FXMLLoader(app.getClass().getResource("/MitarbeiterSpalte.fxml"));
	        AnchorPane contentPage4 = (AnchorPane) loader4.load();
	        FXMLLoader loader5 = new FXMLLoader(app.getClass().getResource("/MitarbeiterSpalte.fxml"));
	        AnchorPane contentPage5 = (AnchorPane) loader5.load();

	        // or convenience methods set more than one constraint at once...
	        GridPane.setConstraints(contentPage1, 0, 0);
	        dienstplanRaster.getChildren().addAll(contentPage1);
	        GridPane.setConstraints(contentPage2, 0, 1);
	        dienstplanRaster.getChildren().addAll(contentPage2);
	        GridPane.setConstraints(contentPage3, 0, 2);
	        dienstplanRaster.getChildren().addAll(contentPage3);
	        GridPane.setConstraints(contentPage4, 0, 3);
	        dienstplanRaster.getChildren().addAll(contentPage4);
	        GridPane.setConstraints(contentPage5, 0, 4);
	        dienstplanRaster.getChildren().addAll(contentPage5);
	        
	        // Give the controller access to the main app
		    //MainDienstplanController controller = loader.getController();
		    //controller.setMainApp(app);
		    
	        //root.setCenter(contentPage);
			
			//mainScene = new Scene(root,1024,768);
			//mainScene.getStylesheets().add(app.getClass().getResource("application.css").toExternalForm());
		} catch(Exception e) {
			e.printStackTrace();
		}
      
      // Add observable list data to the table
      // diensteTable.setItems(this.app.getDiensteData());
      
  }
}
