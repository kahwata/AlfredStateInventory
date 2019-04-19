/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;

public class SignIn {
    private static SignIn instance;
    private static String username = "";
    private static String password = "";
    
    private SignIn(){}
    
    public static SignIn getInstance() {
        if (instance == null)
            instance = new SignIn();
        return instance;
    }
    
    public static void setUser(String user) {
        username = user;
    }
    
    public static String getUser() {
        return username;
    }
    
    public static void setPass(String pass) {
        password = pass;
    }
    
     public static String getPass() {
        return password;
    }
}
