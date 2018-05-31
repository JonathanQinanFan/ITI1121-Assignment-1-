public abstract class Customer{
	
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int customerNumber;
	private int lastCustomerNumber = 9999;
	
	public Customer(String fn, String ln, int a){
		firstName = fn;
		lastName = ln;
		age = a;
		customerNumber = lastCustomerNumber;
		lastCustomerNumber++;
	}
	
	public int getCustomerNumber(){
		return customerNumber;
	}
	
	public boolean equals(Customer other){
		if(!(other instanceof Customer)) {
			return false;
		}
		
		return (other.getCustomerNumber() == this.getCustomerNumber());
	}
	
	public String toString(){
		
		return ("The name of the customer is " + firstName + " " + lastName + ", age " + age + " and your customer number is " customerNumber);
		
	}
	
	public abstract double getSavingsInterest();
	
	public abstract double getCheckInterest();
	
	public abstract double getCheckCharge();

}
