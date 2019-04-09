/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;
import java.sql.*;

/**
 *
 * @author BHAsus
 */

public class SQLConnection {
    private Connection sqlConnection;
    
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection("jdbc:mysql://bhprograms.org:3306/bhprogra_SystemAnalysis?zeroDateTimeBehavior=convertToNull", "bhprogra_unix", "linux");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
