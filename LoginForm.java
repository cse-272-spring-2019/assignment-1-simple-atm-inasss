/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class LoginForm {
    Scene scene;
    Stage stage ;

    LoginAuthentication authentication;
    private HomeScreen homeScreen;
    public LoginForm(Stage stage){
        this.stage = stage ;
    }

    
    
    

    
    public void prepareScene() {
        authentication = new LoginAuthentication();
        
        Label usernameLabel = new Label("Username: ");
        Label passwordLabel = new Label("Password:  ");
        TextField userNameField = new  TextField();
        PasswordField passwordField = new PasswordField();
        Button submit = new Button( "Submit");
        Label validationLabel = new Label();
         GridPane grid = new GridPane();
         grid.add(usernameLabel, 0,0);
         grid.add(passwordLabel,0,1);
         grid.add(userNameField, 1,0);
         grid.add(passwordField,1,1);
         grid.add(submit,1,2);
         grid.add(validationLabel,1,3);
         TextField labelpin = new TextField();
        TextField labelname=new TextField();
        Button EnterButton = new Button("Enter");
        Label validatelabel=new Label();
        Button Button0 = new Button("0");
        Button Button1 = new Button("1");
        Button Button2 = new Button("2");
        Button Button3 = new Button("3");
        Button Button4 = new Button("4");
        Button Button5 = new Button("5");
        Button Button6 = new Button("6");
        Button Button7 = new Button("7");
        Button Button8 = new Button("8"); 
        Button Button9 = new Button("9"); 
        
        
        
        
        
        grid.add(Button1,0,2);
        grid.add(Button2, 1,2);
        grid.add(Button3, 2,2);
        grid.add(Button4, 0,3);
        grid.add(Button5, 1,3);
        grid.add(Button6, 2,3);
        grid.add(Button7, 0,4);
        grid.add(Button8, 1,4);
        grid.add(Button9, 2,4);
        grid.add(Button0, 1,5); 
        grid.add(EnterButton,2,5);
        grid.add(validatelabel,1,6);
        
         
         submit.setOnAction((ActionEvent event) -> {
             String username = userNameField.getText();
             String password = passwordField.getText();
             boolean valid =authentication.validate(username, password);
             if(valid){
                 validationLabel.setText("welcome mr."+ username);
                 stage.setScene(homeScreen.getScene());
             }
             else {
                 validationLabel.setText("Wrong username or password");
                 
                 
             }
        });
         scene = new Scene ( grid , 600 , 400);
    }
public Scene getScene(){
    return this.scene;
   
}

    void setHomeScreen(HomeScreen homeScreen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
                 


                 
         
        
        
    

    

