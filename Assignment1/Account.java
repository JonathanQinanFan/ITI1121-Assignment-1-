public abstract class Account{
	
	Customer customer; 
	private double balance;
	private final int INITSIZE = 25;
	//Not sure how to use this,
	Transactions[] transactions;

	public Account(Customer c, double b){
		this.customer = c;
		this.balance = balance;
		
		
	}
	//I hate working with arrays so this is not done yet
	public void reallocate(Transactions[] t){
	
	}
		
	public double getBalance(){
		return balance;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	public void setCustomer(Customer c){
		this.customer = c;
	}	
	
	public String toString(){
		return("The balance of the account of " + customer + " is " + balance)
	}
}
