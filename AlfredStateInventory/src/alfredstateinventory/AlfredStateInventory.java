/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory;

import alfredstateinventory.userinterface.MainWindow;
import alfredstateinventory.userinterface.PanelDetails;
import alfredstateinventory.userinterface.PanelSignIn;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author BHAsus
 * @author kahwata
 */
public class AlfredStateInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindow mainW = new MainWindow();
        PanelDetails detail = new PanelDetails();
        mainW.addPanel(detail);
        
    }
    
}
