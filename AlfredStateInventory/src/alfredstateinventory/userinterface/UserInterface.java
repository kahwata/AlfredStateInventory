/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.userinterface;
import alfredstateinventory.java.Inventory;
import alfredstateinventory.java.InventoryItem;
import alfredstateinventory.sql.SQLQueries;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserInterface {
    private static UserInterface instance;
    private static MainWindow mainJFrame;
    
    private UserInterface() {
        mainJFrame = new MainWindow();
        switchLayout("PanelChooseSignIn");
    }
    
    public static UserInterface getInstance() {
        if (instance == null)
            return new UserInterface();
        return instance;
    }
    
     public static void switchLayout (String layout) {
         if (layout.equals("PanelChooseSignIn")) {
            PanelChooseSignIn signIn = new PanelChooseSignIn();
            mainJFrame.addPanel(signIn);
        }
        
        else if (layout.equals("PanelSignIn")) {
            PanelSignIn signIn = new PanelSignIn();
            mainJFrame.addPanel(signIn);
        }
        
        else if (layout.equals("PanelHome")) {
            PanelHome home = new PanelHome();
            Inventory.setInventory(SQLQueries.queryAll());
            home.populateScrollView(Inventory.getInventoryItems());
            mainJFrame.addPanel(home);
        } 
        
        else if (layout.equals("PanelDetails")) {
            PanelDetails details = new PanelDetails();
            //details.populateDetailView("001", "Test Item", true, "3/28/19",  "3/28/19", "3/28/19", "3/28/19", "3/28/19",5, "SET 441", "This item was created for test purposes only" );
            mainJFrame.addPanel(details);
        } 
        
        else if (layout.equals("PanelQuery")) {
            PanelQuery query = new PanelQuery();
            mainJFrame.addPanel(query);
        }
    }
    
    public static void switchLayout (String layout, String arg) {
        if (layout.equals("PanelDetails")) {
            PanelDetails details = new PanelDetails();
            try {
                InventoryItem item = SQLQueries.querySpecific(Integer.parseInt(arg));
                details.populateDetailView(item);
                mainJFrame.addPanel(details);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }
    
      public static void switchLayout (String layout, String arg, int option) { 
          
          if (layout.equals("PanelEdit")) {
            if (option == 1) {
                PanelEdit edit = new PanelEdit(true);
                mainJFrame.addPanel(edit);
            } else if (option == 2) {
                PanelEdit edit = new PanelEdit(false);
                try {
                    InventoryItem item = SQLQueries.querySpecific(Integer.parseInt(arg));
                    edit.populateEditView(item);
                    mainJFrame.addPanel(edit);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                    e.printStackTrace();
                }
            }
        }    
      }
      
      public static void displayInventory(ArrayList <InventoryItem> inventory) {
            PanelHome home = new PanelHome();
            home.populateScrollView(inventory);
            mainJFrame.addPanel(home);
      }
    
    
    
}
