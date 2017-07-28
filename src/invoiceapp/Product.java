package invoiceapp;
//import java.util.ArrayList;

public class Product {
	private double price=0.0;

	private String item =null;

	public Product(){
		
	}


	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		//System.out.println("you are now setting the price");
		this.price = price;
	}



	public String getItem() {
		return item;
	}



	public void setItem(String item) {
		this.item = item;
	}


}