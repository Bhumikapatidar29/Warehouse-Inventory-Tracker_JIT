package com.koorier.warehouse;

public class AlertService implements StockObserver {

	@Override
	public void onLowStock(InventoryItem inventoryItem) {
		// TODO Auto-generated method stub
		
		System.out.println("Restock ALert low stock for" +inventoryItem.getName() +"only"+inventoryItem.getQuantity()+"Left");
		
		
		
	}

}
