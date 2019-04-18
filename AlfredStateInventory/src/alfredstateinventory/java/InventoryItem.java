/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.java;

import java.time.LocalDate;
import java.sql.Date;

/**
 *
 * @author Anthony
 */
public class InventoryItem {
    private int itemID;
    private String itemName;
    private boolean itemAvail;
    private LocalDate lastSeen;      //date format
    private LocalDate dateOfPurchase;//date format
    private LocalDate softwareDates; //date format
    private String versionNum;
    private LocalDate buildDate;     //date format
    private int lifeExpect;       //in years
    private String location;
    private String itemDesc;

    public InventoryItem(int ID, String name, boolean isAvailible,LocalDate seenDate,LocalDate purchaseDate,LocalDate softDate, String num,LocalDate bDate,
            int expectency, String iLocation, String desc) {
        itemID = ID;
        itemName = name;
        itemAvail = isAvailible;
        lastSeen = seenDate;
        dateOfPurchase = purchaseDate;
        softwareDates = softDate;
        versionNum = num;
        buildDate = bDate;
        lifeExpect = expectency;
        location = iLocation;
        itemDesc = desc;
    }
    
    public int getID() {
        return itemID;
    }
    
    public String getItemName() {
        return itemName;
    }

     public boolean getItemAvailable() {
        return itemAvail;
    }
     
    public LocalDate getLastSeen() {
        return lastSeen;
    }
    
    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }
    
    public LocalDate getSoftwareDate() {
        return softwareDates;
    }
    
    public String getVersionNum() {
        return versionNum;
    }
    
    public LocalDate getBuildDate() {
        return buildDate;
    }
    
    public int getLifeExpectancy() {
        return lifeExpect;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getItemDescription() {
        return itemDesc;
    }
}
   
