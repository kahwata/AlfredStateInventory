package alfredstateinventory.java;

import alfredstateinventory.java.InventoryItem;
import java.time.LocalDate;

 
 public class InventoryItemBuilder {
    private int itemID;
    private String itemName = "";
    private boolean itemAvail = false;
    private LocalDate lastSeen = LocalDate.now();      
    private LocalDate dateOfPurchase = LocalDate.now();
    private LocalDate softwareDates = LocalDate.now(); 
    private String versionNum = "";
    private LocalDate buildDate = LocalDate.now();    
    private int lifeExpect = 0;       
    private String location = "";
    private String itemDesc = "";
    
     public InventoryItemBuilder(int ID) {
        itemID = ID;
    }

    public InventoryItemBuilder itemName(String name) {
        this.itemName = name;
        return this;
    }
    
    public InventoryItemBuilder itemAvailable(boolean available) {
        this.itemAvail = available;
        return this;
    }
    
    public InventoryItemBuilder lastSeen(LocalDate lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }
    
    public InventoryItemBuilder dateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
        return this;
    }
    
    public InventoryItemBuilder softwareDates(LocalDate softwareDates) {
        this.softwareDates = softwareDates;
        return this;
    }
     
    public InventoryItemBuilder versionNum(String versionNum) {
        this.versionNum = versionNum;
        return this;
    }
    
    public InventoryItemBuilder buildDate(LocalDate buildDate) {
        this.buildDate = buildDate;
        return this;
    }
    
    public InventoryItemBuilder lifeExpectancy(int lifeExpectancy) {
        this.lifeExpect = lifeExpectancy;
        return this;
    }
    
    public InventoryItemBuilder location(String location) {
        this.location = location;
        return this;
    }
    
     public InventoryItemBuilder itemDescription(String itemDescription) {
        this.itemDesc = itemDescription;
        return this;
    }
     
    public InventoryItem create() {
        return new InventoryItem(itemID, itemName, itemAvail, lastSeen, dateOfPurchase,
            softwareDates, versionNum, buildDate, lifeExpect, location, itemDesc);
    }
}
