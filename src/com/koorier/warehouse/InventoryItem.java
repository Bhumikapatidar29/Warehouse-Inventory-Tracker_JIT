package com.koorier.warehouse;

public class InventoryItem {
	
	private String id;
    private String name;
    private int quantity;
    private int threshold;
	public InventoryItem(String id, String name, int quantity, int threshold) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.threshold = threshold;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", threshold=" + threshold +
                '}';
    }
	
	

}
