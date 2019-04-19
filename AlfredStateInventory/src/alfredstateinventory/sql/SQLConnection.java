/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;
import alfredstateinventory.userinterface.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BHAsus
 */

public class SQLConnection {
    private static Connection sqlConnection;
    private static SQLConnection instance;
    private static boolean isAdmin = false;
    
    private SQLConnection(){}
    
    public static SQLConnection getInstance() {
        if (instance == null)
            instance = new SQLConnection();
        return instance;
    }
    
    public static void reInstantiate() {
        instance = null;
        sqlConnection = null;
    }
    
    public void init() {
        if (sqlConnection == null) {
            try {
                try {
                     Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception e) {
                       Class.forName("com.mysql.cj.jdbc.Driver");
                }
                sqlConnection = DriverManager.getConnection(DatabaseConfig.connectionURL, SignIn.getUser(), SignIn.getPass());
            } catch (Exception e) {
                e.printStackTrace();
                  JOptionPane.showMessageDialog(null, "Connection could not be established: " + e.getMessage());
                  sqlConnection = null;
            }
        }
    }
    
    public static boolean getAdminAccess() {
        return isAdmin;
    }
    
    public static void setAdminAccess(boolean adminAccess) {
        isAdmin = adminAccess;
    }
    
    public Connection getConnection() {
        return sqlConnection;
    }
    
    public void close(ResultSet result) {
        if (result != null) {
            try {
                result.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void close(java.sql.Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void destroy() {
        if (sqlConnection != null) {
            try {
                sqlConnection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
