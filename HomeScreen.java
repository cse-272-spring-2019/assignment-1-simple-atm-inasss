/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author W
 */
public class HomeScreen {
    Scene scene;
    LoginForm loginForm;
    private Parent grid;
    Stage stage ;
    public HomeScreen(Stage stage){
        this.stage = stage ;
    }
    
    public void prepareScene(){
      Label welcome =new Label("Welcome"); 
      Button submit = new Button( "Logout");
      GridPane  gridkPane = new GridPane();
      submit.setOnAction(new EventHandler<ActionEvent>() {

          @Override
          public void handle(ActionEvent event) {
              stage.setScene(loginForm.getScene());
          }
          });
      
    
      scene = new Scene (grid , 600 , 400);
      

    }
    public Scene getScene(){
        return scene;
    }
    public void setLoginForm(LoginForm loginForm){
        this.loginForm = loginForm;
    }

    void orepareScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
