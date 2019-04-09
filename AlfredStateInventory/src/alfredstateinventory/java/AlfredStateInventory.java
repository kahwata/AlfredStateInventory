/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.java;

import alfredstateinventory.userinterface.*;
import alfredstateinventory.sql.*;
import java.sql.*;


/*
@author BrandonHurst
@author AnthonyKawathy*/

public class AlfredStateInventory {
private static MainWindow mainW;
public static InventoryItem items[] = new InventoryItem[50];

    public static void main(String[] args) {
       mainW = new MainWindow();
       switchLayout("PanelSignIn");
    }
    
    public static void switchLayout (String layout) {
        if (layout.equals("PanelSignIn")) {
            PanelSignIn signIn = new PanelSignIn();
            mainW.addPanel(signIn);
        }
        
        else if (layout.equals("PanelHome")) {
            PanelHome home = new PanelHome();
            for (int i = 0; i < 50; i ++)
              home.populateScrollView("001", "Test Item", true, "3/28/19", "SET 440");
            mainW.addPanel(home);
        } 
        
        else if (layout.equals("PanelDetails")) {
            PanelDetails details = new PanelDetails();
            //details.populateDetailView("001", "Test Item", true, "3/28/19",  "3/28/19", "3/28/19", "3/28/19", "3/28/19",5, "SET 441", "This item was created for test purposes only" );
            mainW.addPanel(details);
        } 
        
        else if (layout.equals("PanelEdit")) {
            PanelEdit edit = new PanelEdit();
            //edit.populateEditView("001", "Test Item", true, "3/28/19",  "3/28/19", "3/28/19", "3/28/19", "3/28/19",5, "SET 441", "This item was created for test purposes only" );
            mainW.addPanel(edit);
        } 
        
        else if (layout.equals("PanelQuery")) {
            PanelQuery query = new PanelQuery();
            mainW.addPanel(query);
        }
    }
}
