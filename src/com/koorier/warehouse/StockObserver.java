package com.koorier.warehouse;

public interface StockObserver {
	
	   void onLowStock(InventoryItem inventoryItem);

}
