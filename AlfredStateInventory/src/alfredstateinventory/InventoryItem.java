/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory;

/**
 *
 * @author Anthony
 */
public class InventoryItem {
    private String itemID;
    private String itemName;
    private boolean itemAvail;
    private String lastSeen;      //date format
    private String dateOfPurchase;//date format
    private String softwareDates; //date format
    private String versionNum;
    private String buildDate;     //date format
    private int lifeExpect;    //in years
    private String location;
    private String itemDesc;

    public InventoryItem (String ID){
        itemID = ID;
        itemName = "";
        itemAvail = true;
        lastSeen = "";
        dateOfPurchase = "";
        softwareDates = "";
        versionNum = "";
        buildDate = "";
        lifeExpect = 0;
        location = "SET";
        itemDesc = "Default Description";
    }
     public InventoryItem(String ID, String name, boolean isAvailible, String seenDate, String purchaseDate, String softDate, String num, String bDate,
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
    
    public void setID(String ID) {

        itemID = ID;
    }

    public String getID() {
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

    public boolean getItemAvailible() {
        return itemAvail;
    }

    public void setLastSeen(String seenDate) {
        lastSeen = seenDate;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setDateOfPurchase(String date) {
        dateOfPurchase = date;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setSoftwareDates(String date) {
        softwareDates = date;
    }

    public String getSoftwareDate() {
        return softwareDates;
    }

    public void setVersionNum(String num) {
        versionNum = num;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setBuildDate(String date) {
        buildDate = date;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setLifeExpect(int productLife) {
        lifeExpect = productLife;
    }

    public int getLifeExpectency() {
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

