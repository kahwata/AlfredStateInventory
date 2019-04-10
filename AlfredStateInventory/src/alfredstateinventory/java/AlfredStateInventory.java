/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.java;

import alfredstateinventory.userinterface.*;
import java.time.LocalDate;
import alfredstateinventory.sql.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
@author BrandonHurst
@author AnthonyKawathy*/

public class AlfredStateInventory {
private static MainWindow mainW;
public static  ArrayList<InventoryItem> inventory = new ArrayList<>();

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
            SQLQueries query = new SQLQueries();
            inventory = query.queryAll();
            home.populateScrollView(inventory);
            mainW.addPanel(home);
        } 
        
        else if (layout.equals("PanelDetails")) {
            PanelDetails details = new PanelDetails();
            //details.populateDetailView("001", "Test Item", true, "3/28/19",  "3/28/19", "3/28/19", "3/28/19", "3/28/19",5, "SET 441", "This item was created for test purposes only" );
            mainW.addPanel(details);
        } 
        
        else if (layout.equals("PanelEdit")) {
            PanelEdit edit = new PanelEdit();
            mainW.addPanel(edit);
        } 
        
        else if (layout.equals("PanelQuery")) {
            PanelQuery query = new PanelQuery();
            mainW.addPanel(query);
        }
    }
    
    public static void switchLayout (String layout, String arg) {
        if (layout.equals("PanelDetails")) {
            PanelDetails details = new PanelDetails();
            SQLQueries query = new SQLQueries();
            try {
                InventoryItem item = query.querySpecific(Integer.parseInt(arg));
                details.populateDetailView(item);
                mainW.addPanel(details);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                e.printStackTrace();
            }
          
        } 
    }
}
