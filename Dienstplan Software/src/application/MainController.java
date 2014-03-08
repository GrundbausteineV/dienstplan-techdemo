package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController {
  @FXML
  private Button toggleMitarbeiter;
  @FXML
  private Button toggleDienste;
  @FXML
  private Button toggleDienstplan;
  @FXML
  private MenuItem menuOpen;
  @FXML
  private MenuItem menuSave;
  @FXML
  private MenuItem menuQuit;
  @FXML
  private MenuItem menuHelp;
  @FXML
  private MenuItem menuOptions;
  @FXML
  private MenuItem menuLanguage;
  @FXML
  private MenuItem menuDelete;
  
  // Reference to the main application
  private Main app;
  
  /**
  * The constructor.
  * The constructor is called before the initialize() method.
  */
  public MainController() {
  }
  
  /**
  * Initializes the controller class. This method is automatically called
  * after the fxml file has been loaded.
  */
  @FXML
  private void initialize() {
	  
  }
  
  @FXML 
  protected void handleMitarbeiterButtonAction(ActionEvent event) {
      app.loadMainScene();
  }
  
  @FXML 
  protected void handleDiensteButtonAction(ActionEvent event) {
      app.loadDiensteScene();
  }
  
  @FXML 
  protected void handleDienstplanButtonAction(ActionEvent event) {
      app.loadDienstplanScene();
  }
  
  @FXML 
  protected void quitApplication(ActionEvent event) {
      Platform.exit();
  }
  
  @FXML 
  protected void helpApplication(ActionEvent event) {
	  Stage dialog = new Stage();
	  dialog.initStyle(StageStyle.UTILITY);
	  Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
	  dialog.setHeight(200);
	  dialog.setWidth(400);
	  dialog.setScene(scene);
	  dialog.show();
  }

  /**
  * Is called by the main application to give a reference back to itself.
 * @param root 
  * 
  * @param mainApp
  */
  public void setMainApp(Main app) {
      this.app = app;
      
      toggleMitarbeiter.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/system-users.png"))));
      toggleDienste.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/accessories-calculator.png"))));
      toggleDienstplan.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/accessories-text-editor.png"))));

	  menuOpen.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/document-open.png"))));
	  menuSave.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/document-save.png"))));
	  menuQuit.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/system-log-out.png"))));
	  menuDelete.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/edit-delete.png"))));
	  menuOptions.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/preferences-system.png"))));
	  menuLanguage.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/text-x-generic.png"))));
	  menuHelp.setGraphic(new ImageView(new Image(this.app.getClass().getResourceAsStream("/resources/icons/weather-clear.png"))));
  }
}
