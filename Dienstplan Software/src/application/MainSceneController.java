package application;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainSceneController {
  @FXML
  private ListView<String> personTable;
  @FXML
  private Button testButton;
  @FXML
  private Button mitarbeiterSave;
  @FXML
  private Button mitarbeiterDelete;
  @FXML
  private Button mitarbeiterNew;
  @FXML
  private Button mitarbeiterPaper;
  @FXML
  private TextField testTextField;
  @FXML
  private TextField displayName;
  @FXML
  private TextField displayVorname;
  @FXML
  private TextField displayAnschrift;
  @FXML
  private TextField displayGeburtsdatum;
  
  // Reference to the main application
  private Main app;
  
  /**
  * The constructor.
  * The constructor is called before the initialize() method.
  */
  public MainSceneController() {
  }
  
  /**
  * Initializes the controller class. This method is automatically called
  * after the fxml file has been loaded.
  */
  @FXML
  private void initialize() {
	  
  }
  
  @FXML 
  protected void handleSubmitButtonAction(ActionEvent event) {
      if(!testTextField.getText().equalsIgnoreCase(""))
    	  this.app.addPersonData(testTextField.getText());
      testTextField.setText("");
      FXCollections.sort(this.app.getPersonData());
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
      personTable.setItems(this.app.getPersonData());
      
      mitarbeiterSave.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/document-save.png"))));
      mitarbeiterDelete.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/edit-delete.png"))));
      mitarbeiterNew.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/document-new.png"))));
      mitarbeiterPaper.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/edit-paste.png"))));
      
  }
}
