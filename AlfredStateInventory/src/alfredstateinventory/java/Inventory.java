/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredstateinventory.java;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private static Inventory instance;
    private static  ArrayList<InventoryItem> inventory = new ArrayList<>();
    
    private Inventory() {}
    
    public static Inventory getInstance() {
        if (instance == null)
            instance = new Inventory();
        return instance;
    }
    
    public static void reInstantiate() {
        instance = null;
    }
    
    public static void addInventoryItem(InventoryItem item) {
        inventory.add(item);
        Collections.sort(inventory);
    }
    
    public static void addInventoryItems(ArrayList<InventoryItem> items) {
        inventory.addAll(items);
        Collections.sort(inventory);
    }
    
    public static void setInventory(ArrayList<InventoryItem> items) {
        inventory = items;
        Collections.sort(inventory);
    }
    
    public static ArrayList<InventoryItem> getInventoryItems() {
        return inventory;
    }
    
}
