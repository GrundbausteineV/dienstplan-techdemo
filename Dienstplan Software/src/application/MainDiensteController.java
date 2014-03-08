package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MainDiensteController {
  @FXML
  private ListView<String> diensteTable;
  
  // Reference to the main application
  private Main app;
  
  /**
  * The constructor.
  * The constructor is called before the initialize() method.
  */
  public MainDiensteController() {
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
      diensteTable.setItems(this.app.getDiensteData());
      
  }
}
