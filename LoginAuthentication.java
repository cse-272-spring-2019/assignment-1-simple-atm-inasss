/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class LoginAuthentication {
    HashMap userDictionary;
    public LoginAuthentication(){
        userDictionary = new HashMap();
        userDictionary.put("Ahmed","1234");
        userDictionary.put("ali", "5555");
    }

    
    public boolean validate(String username , String password){
        boolean validationResult;
    
        String fetchedPassword = (String) userDictionary.get(username);
        if (fetchedPassword!=null){
            validationResult = fetchedPassword.equals(password);
            
        }
        else{ validationResult = false;
        }
        
        //TODO; validation logic
        return validationResult;
        
    }
    
}
