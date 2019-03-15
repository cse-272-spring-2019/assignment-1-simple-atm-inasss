/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author W
 */
public class Shopping extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Shopping Application");
        LoginForm loginForm = new LoginForm(primaryStage);
        HomeScreen homeScreen = new HomeScreen(primaryStage);
        loginForm.prepareScene();
        homeScreen.orepareScene();
        loginForm.setHomeScreen(homeScreen);
        homeScreen.setLoginForm(loginForm);
        
        primaryStage.setScene(loginForm.getScene());
       primaryStage.show();
       
     
    
    }
    
    
}
