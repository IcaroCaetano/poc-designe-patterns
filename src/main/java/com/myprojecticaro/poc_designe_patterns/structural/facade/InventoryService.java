package com.myprojecticaro.poc_designe_patterns.structural.facade;

public class InventoryService {
    public boolean checkStock(String item) {
        System.out.println("Checking stock for: " + item);
        return true;
    }

    public void reserveItem(String item) {
        System.out.println("Item reserved: " + item);
    }
}

