package com.koorier.warehouse;

import java.util.HashMap;

public class Warehouse {
	
	 private HashMap<String, InventoryItem> inventory = new HashMap<>();
	    private StockObserver stockObserver;
	    
	    public Warehouse(StockObserver stockObserver) {
			// TODO Auto-generated constructor stub
	    	
	    	this.stockObserver=stockObserver;
	    	
	    }
	    
	    public void addProduct(InventoryItem inventoryItem) {
	        inventory.put(inventoryItem.getId(), inventoryItem);
	        System.out.println("Added Itwm: " + inventoryItem.getName());
	    }
	    
	    public void receiveShipment(String id, int quantity)
	    {
	    	InventoryItem inventoryItem=inventory.get(id);
	    	if(inventoryItem==null)
	    	{
	    		System.out.println("Invalid Item ID");
	    		return;
	    	}
	    	inventoryItem.setQuantity(inventoryItem.getQuantity()+quantity);
	    	System.out.println("ReceivedShipment" +quantity+ "Items of" +inventoryItem.getName());
	    	
	    	
	    }
	   
	    
	    public void fulfillOrder(String id, int quantity)
	    {
	    	InventoryItem inventoryItem=inventory.get(id);
	    	if(inventoryItem==null)
	    	{
	    		System.out.println("Invalid Item ID");
	    		return;
	    	}
	    	
	    	if (inventoryItem.getQuantity()<quantity)
	    	{
	    		System.out.println("INsufficient Stock for " +inventoryItem.getName() );
				return;
			}
	    	
	    	inventoryItem.setQuantity(inventoryItem.getQuantity()-quantity);
	    	System.out.println("Order fulfilled " +quantity + "Items" +inventoryItem.getName());
	    	

	        if (inventoryItem.getQuantity() < inventoryItem.getThreshold()) {
	            stockObserver.onLowStock(inventoryItem);
	        }
	    }  
	    public void showInventory()
	    {
	        System.out.println("\nCurrent Inventory");
	        
	        if (inventory.isEmpty())
	        {
	            System.out.println("No Item available");
	        } else 
	        {
	            for (InventoryItem item : inventory.values())
	            {
	                System.out.println(item);
	            }
	        }
	    }
	    
	    
	    

}
