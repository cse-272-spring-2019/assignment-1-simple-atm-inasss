/*
 * To change this license header, choose License Headers in Project Properties.
+ * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author W
 */
public class trans { 
    Scene scene;
    LoginForm loginForm;
    Stage stage ;
    transaction objectTrans;   
    int index=0;
    double output1;
    public trans (Stage stage , transaction trans){
        this.stage=stage;
        this.objectTrans=trans;
    }
    public void showScreen(){
        GridPane grid =new GridPane();
        grid.setHgap(50);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);
        Label welcome=new Label("Welcome");
        Label Output =new Label();
        Label Output2 =new Label();
        Label Output3 =new Label();
        Button withdraw=new Button ("Withdraw");
        Button deposit =new Button ("Deposit");
        Button balance= new Button ("Balance ");
        Button next = new Button ("Next ");
        Button previous= new Button ("Previous"); 
        GridPane.setConstraints(welcome,1,0); 
        GridPane.setConstraints(balance,0,1);
        GridPane.setConstraints(withdraw,1,1);  
        GridPane.setConstraints(deposit,2,1); 
        GridPane.setConstraints(next,0,2); 
        GridPane.setConstraints(previous, 2, 2);  
        GridPane.setConstraints(Output, 0, 3);
        GridPane.setConstraints(Output2 , 2, 3);
        GridPane.setConstraints(Output3, 1, 3) ;
        grid.getChildren().addAll(welcome,balance,deposit,next,previous);
        next.setOnAction(new EventHandler<ActionEvent>() {
            private Object Sring;

            @Override
            public void handle(ActionEvent event) {
                if(objectTrans.amounts.size()>index){
                    if(objectTrans.amounts.size()<=0){
                        Output.setText("No History:");
                        Output2.setText("");
                        Output3.setText("");
                        
                    }
                    else{
                        Output.setText("History:");
                        Output2.setText(String.valueOf(objectTrans.amounts.get(index)));
                        Output3.setText(String.valueOf(objectTrans.types.get(index)));
                        index ++;}
                }
                else { Output.setText("There is no more History");
                       Output2.setText("");
                       Output3.setText("");}
                
                
                    
                
            }});
        previous.setOnAction((ActionEvent event) -> {
            if(objectTrans.amounts.size()>=index){
                if(index<=0){
                    Output.setText("No History");
                    Output2.setText("");
                    Output3.setText("");}
                else{
                    Output.setText("History");
                    Output2.setText(String.valueOf(objectTrans.amounts.get(index-1)));
                    Output3.setText(String.valueOf(objectTrans.types.get(-1)));
                    index--;}
            } else{ Output.setText("There is no more History");
            Output2.setText("");
            Output3.setText("");}
        }); 
        
            
                    }
                }
            
            
            
        
            
        
        
        
    
    
    
    
    

