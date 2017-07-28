package invoiceapp;
import java.io.*;
import java.util.*;

/*
 * This application can calculate the total amount your payment for items entered plus tax
 * @author mahderf
 */
public class InProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* creating object of the product class
		 * Initiating Array list and adding storing the inputs
		 * and a scanner
		 */
		Scanner scan= new Scanner(System.in);
	
		double taxrate=0;
		double tax=0;
		double totalprice=0;
		double realprice=0;
		double totaltax=0;
		ArrayList <Product> pdesc; 
		pdesc = new ArrayList <Product>();
		String choice;
		boolean cont =true;
		

		System.out.println("how much is the tax rate: ?");
		taxrate=scan.nextDouble();
//loops through the customers response to add more items to prompt the to enter again
		while (cont)
		{
			Product cprod = new Product();
			
			System.out.println("please right the product description: ");
			String itnm=scan.next();
			cprod.setItem(itnm);


			System.out.println("what is the price of the produt");
			double temp = scan.nextDouble();
			 cprod.setPrice(temp);
			 
			 pdesc.add(cprod);
			 
			System.out.println("do you have more items? ");
			choice = scan.next();
			 
			if (choice.equalsIgnoreCase("n"))
			{
				cont=false;
			}
			else if(!choice.equalsIgnoreCase("y"))
			{
				System.out.println("wrong choice");
			}

		}

		tax=taxrate/100;
	
		//go through the array list and add each price 
		for(int i = 0; i < pdesc.size();i++){
			
			totalprice= pdesc.get(i).getPrice()+totalprice;
		}
		// calculates the total tax and price including tax
		totaltax =totalprice*tax;
		realprice=totalprice+(totaltax);
	for(Product trn:pdesc)
	{
		System.out.println("Item name :"+ trn.getItem());
	}
	    System.out.println("Tax rate is: " + taxrate +"%");
		System.out.println("The Total Price is: " + totalprice);
		System.out.println("The tax charged is: " + totaltax);
		System.out.println("Total Amount Due: " +realprice);


	}
}

