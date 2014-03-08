package application;

import javafx.fxml.FXML;

public class MainDienstplanController {
  
  // Reference to the main application
  @SuppressWarnings("unused")
  private Main app;
  
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
      
      // Add observable list data to the table
      // diensteTable.setItems(this.app.getDiensteData());
      
  }
}
