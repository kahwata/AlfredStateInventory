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

    public InventoryItem (int ID){
        itemID = ID;
        itemName = "";
        itemAvail = false;
        lastSeen = LocalDate.now();
        dateOfPurchase = LocalDate.now();
        softwareDates = LocalDate.now();
        versionNum = "";
        buildDate = LocalDate.now();
        lifeExpect = 0;
        location = "";
        itemDesc = "";
    }
     public InventoryItem(int ID, String name, boolean isAvailible,java.sql.Date seenDate,java.sql.Date purchaseDate,java.sql.Date softDate, String num, java.sql.Date bDate,
            int expectency, String iLocation, String desc) {
        itemID = ID;
        itemName = name;
        itemAvail = isAvailible;
        lastSeen = seenDate.toLocalDate();
        dateOfPurchase = purchaseDate.toLocalDate();
        softwareDates = softDate.toLocalDate();
        versionNum = num;
        buildDate = bDate.toLocalDate();
        lifeExpect = expectency;
        location = iLocation;
        itemDesc = desc;
    }
     
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
    
    public void setID(int ID) {

        itemID = ID;
    }

    public int getID() {
        return itemID;
    }

    public void setItemName(String name) {
        itemName = name;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemAvailible(boolean isAvailible) {
        itemAvail = isAvailible;
    }

    public boolean getItemAvailable() {
        return itemAvail;
    }

    public void setLastSeen(LocalDate seenDate) {
        lastSeen = seenDate;
    }

    public LocalDate getLastSeen() {
        return lastSeen;
    }

    public void setDateOfPurchase(LocalDate date) {
        dateOfPurchase = date;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setSoftwareDates(LocalDate date) {
        softwareDates = date;
    }

    public LocalDate getSoftwareDate() {
        return softwareDates;
    }

    public void setVersionNum(String num) {
        versionNum = num;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setBuildDate(LocalDate date) {
        buildDate = date;
    }

    public LocalDate getBuildDate() {
        return buildDate;
    }

    public void setLifeExpectancy(int productLife) {
        lifeExpect = productLife;
    }

    public int getLifeExpectancy() {
        return lifeExpect;
    }

    public void setLocation(String iLocation) {
        location = iLocation;
    }

    public String getLocation() {
        return location;
    }

    public void setItemDescription(String desc) {
        itemDesc = desc;
    }

    public String getItemDescription() {
        return itemDesc;
    }

}

