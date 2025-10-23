package com.koorier.warehouse;

import java.util.Scanner;

public class WarehouseMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Item ID");
		String id=sc.nextLine();
		
		System.out.println("ENter Product Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Quantity");
		Integer quantity=sc.nextInt();
		
		System.out.println("ENter Threshold");
		Integer thresold=sc.nextInt();
		
		Warehouse warehouse=new Warehouse(null);
		InventoryItem inventoryItem=new InventoryItem(id, name, quantity, thresold);
		warehouse.addProduct(inventoryItem);
		
		warehouse.receiveShipment(id, 10);
		warehouse.showInventory();
		
		
		
		
	}
	
	  
	    


	
	

}
