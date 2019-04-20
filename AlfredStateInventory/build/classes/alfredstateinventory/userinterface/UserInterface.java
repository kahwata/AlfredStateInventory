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
        switchLayout(new Object[]{"PanelChooseSignIn"});
    }
    
    public static UserInterface getInstance() {
        if (instance == null)
            return new UserInterface();
        return instance;
    }
    
    public static void reInstantiate() {
        instance = null;
        mainJFrame.dispose();
    }
    
     public static void switchLayout (Object[] args) {
         String layout = args[0].toString();
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
            
            if(args.length > 1) {
               try {
                   InventoryItem item = SQLQueries.querySpecific(Integer.parseInt(args[1].toString()));
                   details.populateDetailView(item);
                   mainJFrame.addPanel(details);
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                   e.printStackTrace();
               }
            } else {
                 mainJFrame.addPanel(details);
            }
        } 
        
        else if (layout.equals("PanelQuery")) {
            PanelQuery query = new PanelQuery();
            mainJFrame.addPanel(query);
        }
         
          if (layout.equals("PanelEdit")) {
            if (Integer.parseInt(args[2].toString())== 1) {
                PanelEdit edit = new PanelEdit(true);
                mainJFrame.addPanel(edit);
            } else if (Integer.parseInt(args[2].toString()) == 2) {
                PanelEdit edit = new PanelEdit(false);
                try {
                    InventoryItem item = SQLQueries.querySpecific(Integer.parseInt(args[1].toString()));
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
