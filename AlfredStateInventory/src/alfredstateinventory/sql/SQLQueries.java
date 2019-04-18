/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;

import java.sql.*;
import java.util.ArrayList;
import alfredstateinventory.java.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class SQLQueries {
    
    public void queryAdminAccess(String username) throws Exception {
        ResultSet result = null;
        ArrayList<String> permissions = new ArrayList<>();
            SQLConnection sqlC = new SQLConnection();
            sqlC.init();
            Connection c = sqlC.getConnection();
            PreparedStatement s = c.prepareStatement("SELECT PRIVILEGE_TYPE FROM information_schema.SCHEMA_PRIVILEGES WHERE GRANTEE LIKE CONCAT('%', ?, '%')");
            s.setString(1, username);
            result = s.executeQuery();
            
            while (result.next()) {
                permissions.add(result.getString(1));
            }
              sqlC.setAdminAccess(permissions.contains("CREATE"));
    }
    
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
            InventoryItem item = new InventoryItemBuilder(result.getInt(1))
                .itemName(result.getString(2))
                .itemAvailable(result.getBoolean(3))
                .lastSeen(result.getDate(4).toLocalDate())
                .dateOfPurchase(result.getDate(5).toLocalDate())
                .softwareDates(result.getDate(6).toLocalDate())
                .versionNum(result.getString(7))
                .buildDate(result.getDate(8).toLocalDate())
                .lifeExpectancy(result.getInt(9))
                .location(result.getString(10))
                .itemDescription(result.getString(11))
                .create();
            inventory.add(item);
        }
        
        c.close();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           e.printStackTrace();
       }
       return inventory;
    }
    
    public InventoryItem querySpecific(int itemID) throws SQLException {
        ResultSet result = null;
        try {
        SQLConnection sqlC = new SQLConnection();
        sqlC.init();
        Connection c = sqlC.getConnection();
        PreparedStatement s = c.prepareStatement("Select * from Inventory WHERE ItemId = ?");
        s.setInt(1, itemID);
        result = s.executeQuery();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           e.printStackTrace();
        }
        
        result.next();
        InventoryItem item = new InventoryItemBuilder(result.getInt(1))
            .itemName(result.getString(2))
            .itemAvailable(result.getBoolean(3))
            .lastSeen(result.getDate(4).toLocalDate())
            .dateOfPurchase(result.getDate(5).toLocalDate())
            .softwareDates(result.getDate(6).toLocalDate())
            .versionNum(result.getString(7))
            .buildDate(result.getDate(8).toLocalDate())
            .lifeExpectancy(result.getInt(9))
            .location(result.getString(10))
            .itemDescription(result.getString(11))
            .create();
        return item;
    }
    
    public boolean queryNew(InventoryItem item) {
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
            return false;
        }
        return true;
    }
    
     public boolean queryEdit(InventoryItem item) {
        try {
            SQLConnection sqlC = new SQLConnection();
            sqlC.init();
            Connection c = sqlC.getConnection();
            PreparedStatement s = c.prepareStatement("UPDATE Inventory SET ItemName = ?, ItemAvailable = ?, LastSeen = ?, "
                    + "DateOfPurchase = ?, SoftwareDates = ?, VersionNumber = ?, BuildDate = ?, LifeExpectancy = ?, Location = ?, "
                    + "ItemDescription = ? WHERE ItemId = ?");
            s.setString(1, item.getItemName());
            s.setBoolean(2, item.getItemAvailable());
            s.setDate(3, java.sql.Date.valueOf(item.getLastSeen()));
            s.setDate(4, java.sql.Date.valueOf(item.getDateOfPurchase()));
            s.setDate(5, java.sql.Date.valueOf(item.getSoftwareDate()));
            s.setString(6, item.getVersionNum());
            s.setDate(7, java.sql.Date.valueOf(item.getBuildDate()));
            s.setInt(8, item.getLifeExpectancy());
            s.setString(9, item.getLocation());
            s.setString(10, item.getItemDescription());
            s.setInt(11, item.getID());
            s.executeUpdate();
            c.close();
            System.out.println("Done");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public int queryId() throws SQLException {
        ResultSet result = null;
        SQLConnection sqlC = new SQLConnection();
        sqlC.init();
        Connection c = sqlC.getConnection();
        PreparedStatement s = c.prepareStatement("Select MAX(ItemId) AS MaxID FROM Inventory");
        result = s.executeQuery();
        result.next();
        return (result.getInt(1) + 1);
    }
    
    public ArrayList<InventoryItem> querySearch(ArrayList<String> query, boolean strict) {
          ResultSet result = null;
          ArrayList<InventoryItem> inventory = new ArrayList<>();
          try {
            SQLConnection sqlC = new SQLConnection();
            sqlC.init();
            Connection c = sqlC.getConnection();
            
            String statement = "";
            if (strict) {
             statement = "SELECT * FROM Inventory " +
                "WHERE ItemId LIKE ? AND ItemName LIKE ? AND ItemAvailable LIKE ? AND LastSeen LIKE ? "
                + "AND DateOfPurchase LIKE ? AND SoftwareDates LIKE ? AND\n" +
                "VersionNumber LIKE ? AND  BuildDate LIKE ? AND LifeExpectancy LIKE ? AND Location LIKE"
                + " ? AND ItemDescription LIKE ?";
            } else {
                 statement = "SELECT * FROM Inventory " +
                    "WHERE ItemId LIKE CONCAT('%', ?, '%') AND ItemName LIKE CONCAT('%', ?, '%') AND ItemAvailable LIKE CONCAT('%', ?, '%') AND LastSeen LIKE CONCAT('%', ?, '%') "
                    + "AND DateOfPurchase LIKE CONCAT('%', ?, '%') AND SoftwareDates LIKE CONCAT('%', ?, '%') AND " +
                    "VersionNumber LIKE CONCAT('%', ?, '%') AND  BuildDate LIKE CONCAT('%', ?, '%') AND LifeExpectancy LIKE CONCAT('%', ?, '%') AND Location LIKE "
                    + " CONCAT('%', ?, '%') AND ItemDescription LIKE CONCAT('%', ?, '%')";
            }
           
            PreparedStatement s = c.prepareStatement(statement);
            if (query.get(0).isBlank()) {
                 s.setString(1, "%");
            } else {
                s.setInt(1, Integer.parseInt(query.get(0)));
            }
            
            if (query.get(1).isBlank()) {
                 s.setString(2, "%");
            } else {
                s.setString(2, query.get(1));
            }
            
            if (query.get(2).isBlank()) {
                 s.setString(3, "%");
            } else {
                s.setBoolean(3, Boolean.parseBoolean(query.get(2)));
            }
            
            if (query.get(3).isBlank()) {
                 s.setString(4, "%");
            } else {
                LocalDate date = LocalDate.parse(query.get(3)).plusDays(1);
                s.setDate(4, java.sql.Date.valueOf(date));
            }
            
            if (query.get(4).isBlank()) {
                 s.setString(5, "%");
            } else {
                LocalDate date = LocalDate.parse(query.get(4)).plusDays(1);
                s.setDate(5, java.sql.Date.valueOf(date));
            }
            
            if (query.get(5).isBlank()) {
                 s.setString(6, "%");
            } else {
                LocalDate date = LocalDate.parse(query.get(5)).plusDays(1);
                s.setDate(6, java.sql.Date.valueOf(date));
            }
            
            if (query.get(6).isBlank()) {
                 s.setString(7, "%");
            } else {
                s.setString(7, query.get(6));
            }
            
            if (query.get(7).isBlank()) {
                 s.setString(8, "%");
            } else {
                LocalDate date = LocalDate.parse(query.get(7)).plusDays(1);
                s.setDate(8, java.sql.Date.valueOf(date));
            }
           
           if (query.get(8).isBlank()) {
                 s.setString(9, "%");
            } else {
                s.setInt(9, Integer.parseInt(query.get(8)));
            }
           
           if (query.get(9).isBlank()) {
                 s.setString(10, "%");
            } else {
                s.setString(10, query.get(9));
            }
           
           if (query.get(10).isBlank()) {
                 s.setString(11, "%");
            } else {
                s.setString(11, query.get(10));
            }
           
            System.out.println(s.toString());
            result = s.executeQuery();
            while (result.next()) {
                InventoryItem item = new InventoryItemBuilder(result.getInt(1))
                    .itemName(result.getString(2))
                    .itemAvailable(result.getBoolean(3))
                    .lastSeen(result.getDate(4).toLocalDate())
                    .dateOfPurchase(result.getDate(5).toLocalDate())
                    .softwareDates(result.getDate(6).toLocalDate())
                    .versionNum(result.getString(7))
                    .buildDate(result.getDate(8).toLocalDate())
                    .lifeExpectancy(result.getInt(9))
                    .location(result.getString(10))
                    .itemDescription(result.getString(11))
                    .create();
                inventory.add(item);
            }
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            e.printStackTrace();
        }
          return inventory;
    }
    
}
