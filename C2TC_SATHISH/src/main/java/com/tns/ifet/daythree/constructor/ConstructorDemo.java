package com.tns.ifet.daythree.constructor;
import java.util.Scanner;
public class ConstructorDemo {
	public static void main(String args[]) 
	{ 
	Scanner sc=new Scanner(System.in); 
	String name, city; 
	int id; 
	System.out.print("Enter Customer Id : "); 
	id=sc.nextInt(); 
	sc.nextLine(); 
	System.out.print("Enter Customer Name : "); 
	name=sc.nextLine(); 
	System.out.print("Enter Customer City : "); 
	city=sc.nextLine(); 
	System.out.println(" "); 
	Constructor c1=new Constructor(); //default constructor invoked 
	c1.setCustomerName(name); 
	c1.setCustomerId(id); 
	c1.setCustomerCity(city); 
	System.out.println(c1); 
	System.out.print("Enter Customer Id : "); 
	id=sc.nextInt(); 
	sc.nextLine(); 
	System.out.print("Enter Customer Name : "); 
	name=sc.nextLine(); 
	System.out.print("Enter Customer City : "); 
	city=sc.nextLine(); 
	Constructor c2=new Constructor(name, id, city); 
	//parameterized constructor invoked);
	System.out.println(c2); 
	sc.close(); 
	} 
}
