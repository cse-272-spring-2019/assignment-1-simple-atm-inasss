/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 * @author yarae
 */
public class ATM extends Application{
    validation validate;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        validate = new validation();        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        primaryStage.setTitle("Login");
        // drawing------------------------------------
        Label pincode = new Label("enter password");
        Label name= new Label("Enter username");
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
        GridPane grid = new GridPane();
        grid.add(name, 0,0);
        grid.add(pincode,0,1);
        grid.add(labelname,1, 0);
        grid.add(labelpin,1,1);
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
        // end of drawing--------------------------
        EnterButton.setOnAction(new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event) {
                String username = labelname.getText();
                String password = labelpin.getText();
                boolean valid =validate.LoginAuthentication(username,password);
                if (valid) {
                    validatelabel.setText("Welcome Mr. "+username);
                }else{
                    validatelabel.setText("Wrong userna'me or password");
                    validatelabel.setStyle("colo:red");
                }
            }
        });
        // end registtering actions----------------------------
        // set scene and begin----------------------------------
        
        
        
        
       
        
        Scene scene =new Scene(grid, 600,600);
        primaryStage.setScene(scene);
        
        
        
        primaryStage.show();
        //end of registering action------------------------------
        
    }
    
}
