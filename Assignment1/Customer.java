public abstract class Customer{
	
	//Initializing instance variables
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int customerNumber;
	private int lastCustomerNumber = 9999;
	
	//Constructor with three parameters. The first and last name of the customer, and his age
	public Customer(String fn, String ln, int a){
		firstName = fn;
		lastName = ln;
		age = a;
		customerNumber = lastCustomerNumber;
		lastCustomerNumber++;
	}
	
	//Getters in order to get the customer number
	public int getCustomerNumber(){
		return customerNumber;
	}
	
	//Method equals used to determine if two objects has the same content or description
	public boolean equals(Customer other){
		if(!(other instanceof Customer)) {
			return false;
		}
		
		return (other.getCustomerNumber() == this.getCustomerNumber());
	}
	
	//toString method used to display the customer information.
	public String toString(){
		
		return ("The name of the customer is " + firstName + " " + lastName + ", age " + age + " and your customer number is " customerNumber);
		
	}
	
	//Abstract getter methods that will be implplemented in the child class.
	public abstract double getSavingsInterest();
	
	public abstract double getCheckInterest();
	
	public abstract double getCheckCharge();

}
