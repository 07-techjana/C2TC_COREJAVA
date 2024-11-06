/**
 * 
 */
package com.tns.ifet.daythree.constructor;

/**
 * 
 */
public class Constructor {
	private String customerName; 
	private int customerId; 
	private String customerCity; 
	// Default Constructor 
	public Constructor() { 
	System.out.println("Default Constructor"); 
	}
	public Constructor(String customerName, int 
			customerId, String customerCity) { 
			this(); //calling default constructor 
			System.out.println("Parameterized Constructor"); 
			this.customerName = customerName; 
			this.customerId = customerId; 
			this.customerCity = customerCity; 
			} 
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String toString() { 
		return "Customer [customerName=" + 
		customerName + ", customerId=" + customerId + ", customerCity=" + customerCity + "]"; 
		} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
