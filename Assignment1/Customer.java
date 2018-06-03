public abstract class Customer{
	
	//Initializing instance variables
	private String firstName;
	private String lastName;
	private int age;
	private int customerNumber;
	private int lastCustomerNumber = 9999;
	
	//Constructor with three parameters. The first and last name of the customer, and his age
	public Customer(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		customerNumber = lastCustomerNumber;
		lastCustomerNumber++;
	}
	
	//Getters in order to get the customer number
	public int getCustomerNumber(){
		return customerNumber;
	}
	
	//Method equals used to determine if two objects has the same content or description
	public boolean equals(Customer other){
		if(other.lastName = lastName && other.firstName = firstName && other.age = age && other.customerNumber = customerNumber)
			return true;
	}
	
	//toString method used to display the customer information.
	public String toString(){
		
		return ("The name of the customer is " + firstName + " " + lastName + ", age " + age + " and their customer number is " customerNumber);
		
	}
	
	//Abstract getter methods that will be implemented in the child class.
	public abstract double getSavingsInterest();
	
	public abstract double getCheckInterest();
	
	public abstract double getCheckCharge();
	
	public abstract double getODP();

}
