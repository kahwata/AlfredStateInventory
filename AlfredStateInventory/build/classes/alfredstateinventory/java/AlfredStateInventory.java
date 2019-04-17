/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.java;

import alfredstateinventory.userinterface.*;
import java.time.LocalDate;
import alfredstateinventory.sql.*;
import alfredstateinventory.java.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;



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
    
      public static void switchLayout (String layout, String arg, int option) { 
          
          if (layout.equals("PanelEdit")) {
            if (option == 1) {
                PanelEdit edit = new PanelEdit(true);
                mainW.addPanel(edit);
            } else if (option == 2) {
                PanelEdit edit = new PanelEdit(false);
                SQLQueries query = new SQLQueries();
                try {
                    InventoryItem item = query.querySpecific(Integer.parseInt(arg));
                    edit.populateEditView(item);
                    mainW.addPanel(edit);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                    e.printStackTrace();
                }
            }
        }    
      }
      
      public static void displayInventory(ArrayList <InventoryItem> inventory) {
            PanelHome home = new PanelHome();
            SQLQueries query = new SQLQueries();
            home.populateScrollView(inventory);
            mainW.addPanel(home);
      }
    
    
}
