public abstract class Account{
	
	//Initializing instance variables
	Customer customer; 
	private double balance;
	private final int INITSIZE = 25;
	Transactions[] transactions;

	//Constructor making accounts for a specific customer and balance.
	public Account(Customer c, double b){
		this.customer = c;
		this.balance = balance;
		transactions = new Transactions[INITSIZE];
		
	}
	
	//This method will be called when the array is full and needs more space.
	public void reallocate(Transactions[] t){
		int destination = new int[this.transactions.length *2];
		for (int i=; i<this.transactions.length; i++){
			destination[i] = this.transactions[i];
		}
		this.transactions = destination;
	}
	
	//Getters for the balance and customer
	public double getBalance(){
		return balance;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	//Setter in order to change customer
	public void setCustomer(Customer c){
		this.customer = c;
	}	
	
	//ToString used to return the balance of a customer
	public String toString(){
		return("The balance of the account of " + customer + " is " + balance)
	}
}
