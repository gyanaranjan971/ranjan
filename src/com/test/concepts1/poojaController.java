package com.test.concepts1;

import java.util.ArrayList;
import java.util.Scanner;

public class poojaController {
	static double bill;
public static void addData() {
	Scanner sc=new Scanner(System.in);
	Product pr=new Product();
	System.out.println("enter your product id");
	pr.setId(sc.nextInt());
	System.out.println("enter your product name");
	pr.setName(sc.next());
	System.out.println("enter your product price");
	pr.setPrice(sc.nextDouble());
	PoojaProvider poojaProvider=new PoojaProvider();
	poojaProvider.addProduct(pr);
	
}
public static void displayData() {
	PoojaProvider poojaProvider=new PoojaProvider();
	 ArrayList<Product>al=poojaProvider.displayProduct( );
	 for(Product p:al) {
		 System.out.println(p.getId()+"||"+p.getName()+"||"+p.getPrice());
	 }
}
public static void calculatePrice() {
	Scanner sc=new Scanner(System.in);
	PoojaProvider poojaProvider=new PoojaProvider();
	 ArrayList<Product>al=poojaProvider.displayProduct( );
	 while(true) {
		 System.out.println("enter the product code");
		 int pCode=sc.nextInt();
	 for(Product p:al) {
		 if(pCode==p.getId()) {
			 System.out.println("enter the product quantity");
			 int p_quan=sc.nextInt();
			bill+= p.getPrice()*p_quan;
			
			break;
		 }
			 
	 }
	 System.out.println("enter 1 to continue or 0 to exit");
	 int choice= sc.nextInt();
	 if(choice==0) {
		 System.out.println("your final bill"+bill);
		 break;}
	 } 
	 
	 
}
	public static void main(String[] args) {
//		addData();
       displayData();
        calculatePrice() ;
	}

}
