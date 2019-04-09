/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;

import java.sql.*;
import java.util.ArrayList;
import alfredstateinventory.java.*;
import javax.swing.JOptionPane;

public class SQLQueries {
    
    
    public ArrayList<InventoryItem> queryAll() {  
       ResultSet result;
        ArrayList<InventoryItem> inventory = new ArrayList<>();
       try {
           
        SQLConnection sqlC = new SQLConnection();
        sqlC.init();
        Connection c = sqlC.getConnection();
        Statement s = c.createStatement();
        result = s.executeQuery("Select * from Inventory");
        
        while (result.next()) {
                InventoryItem item = new InventoryItem(result.getInt(1), result.getString(2), result.getBoolean(3),
                result.getDate(4), result.getDate(5), result.getDate(6), result.getString(7), result.getDate(8),
                result.getInt(9), result.getString(10), result.getString(11));
                inventory.add(item);
            }
        
        c.close();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           e.printStackTrace();
       }
       return inventory;
    }
    
    public void queryNew(InventoryItem item) {
        try {
            SQLConnection sqlC = new SQLConnection();
            sqlC.init();
            Connection c = sqlC.getConnection();
            PreparedStatement s = c.prepareStatement("INSERT INTO Inventory VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            s.setInt(1, item.getID());
            s.setString(2, item.getItemName());
            s.setBoolean(3, item.getItemAvailable());
            s.setDate(4, java.sql.Date.valueOf(item.getLastSeen()));
            s.setDate(5, java.sql.Date.valueOf(item.getDateOfPurchase()));
            s.setDate(6, java.sql.Date.valueOf(item.getSoftwareDate()));
            s.setString(7, item.getVersionNum());
            s.setDate(8, java.sql.Date.valueOf(item.getBuildDate()));
            s.setInt(9, item.getLifeExpectancy());
            s.setString(10, item.getLocation());
            s.setString(11, item.getItemDescription());
            s.executeUpdate();
            c.close();
            System.out.println("Done");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    
    public void querySearch(InventoryItem item) {
          try {
            SQLConnection sqlC = new SQLConnection();
            sqlC.init();
            Connection c = sqlC.getConnection();
            String statement = "SELECT ItemId, ItemName, ItemAvailable, LastSeen, DateOfPurchase, SoftwareDates, "
                    + "VersionNumber, BuildDate, LifeExpectancy, Location, ItemDescription\n" +
                    "FROM Inventory \n" +
                    "WHERE ItemId LIKE '?' AND ItemName LIKE '?' AND ItemAvailable LIKE '?' AND LastSeen LIKE '?' "
                    + "AND DateOfPurchase LIKE '?' AND SoftwareDates LIKE '?' AND\n" +
                    "VersionNumber LIKE '?' AND  BuildDate LIKE '?' AND LifeExpectancy LIKE '?' AND Location LIKE"
                    + " '?' AND ItemDescription LIKE '?'";
            PreparedStatement s = c.prepareStatement(statement);
            s.setInt(1, item.getID());
            s.setString(2, item.getItemName());
            s.setBoolean(3, item.getItemAvailable());
            s.setDate(4, java.sql.Date.valueOf(item.getLastSeen()));
            s.setDate(5, java.sql.Date.valueOf(item.getDateOfPurchase()));
            s.setDate(6, java.sql.Date.valueOf(item.getSoftwareDate()));
            s.setString(7, item.getVersionNum());
            s.setDate(8, java.sql.Date.valueOf(item.getBuildDate()));
            s.setInt(9, item.getLifeExpectancy());
            s.setString(10, item.getLocation());
            s.setString(11, item.getItemDescription());
            s.executeUpdate();
            c.commit();
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    
}
