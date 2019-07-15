/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.sql;

public interface DatabaseConfig {
    public String connectionURL = "jdbc:mysql://136.224.172.35/citinventory?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public String guestUser = "guest";
    public String guestPass = "citinventory2019";
    
}

