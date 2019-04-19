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
public static  ArrayList<InventoryItem> inventory = new ArrayList<>();

    public static void main(String[] args) {
        UserInterface UI = UserInterface.getInstance();
    }
    
   
}
