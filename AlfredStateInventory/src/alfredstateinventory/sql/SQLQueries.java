/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;

import java.sql.*;

public class SQLQueries {
    
    
    public void queryAll() {  
       ResultSet result;
       try {
           
        SQLConnection sqlC = new SQLConnection();
        sqlC.init();
        Connection c = sqlC.getConnection();
        Statement s = c.createStatement();
        result = s.executeQuery("Select * from Inventory");
        
        while (result.next()) {
            for (int i = 1; i < 11; i ++)
                 System.out.println(result.getString(i));
        }
        
        c.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    
    public void queryNew() {
        try {
            SQLConnection sqlC = new SQLConnection();
            sqlC.init();
            Connection c = sqlC.getConnection();
            PreparedStatement s = c.prepareStatement("INSERT INTO Inventory VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            s.setString(1, "");
            s.setString(2, "");
            s.setString(3, "");
            s.setString(4, "");
            s.setString(5, "");
            s.setString(6, "");
            s.setString(7, "");
            s.setString(8, "");
            s.setString(9, "");
            s.setString(10, "");
            s.setString(11, "");
            s.executeUpdate();
            c.commit();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
