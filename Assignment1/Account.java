//This is the class for the bank accounts where it will be divided into subclasses later on. This will build the accounts accompanied with
//some basic methods. The main functions that will be accompanied with the bank's accounts will be found in subclasses such as SavingsAccount
// and CheckingAccount.
public abstract class Account{
	
	//Initializing instance variables
	private Customer customer;
	private double balance;
	private int accountNumber;
	private int lastaccountNumber = 9999;
	Transaction[] transactions;
	private static final int INITSIZE = 25;
	private int currentSize;
	
	//Account constructor that creates a new instance of account for a specific customer.
	public Account(Customer customer){
		
		this.customer = customer;
		balance = 0;
		
		currentSize = INITSIZE;
		transactions = new Transaction[currentSize];
		accountNumber = lastaccountNumber;
		lastaccountNumber++;
		
	}
	
	//Method used to fit more elements in a bigger array when running out of space
	public void reallocate(){
		
		if(transactions.length==currentSize){
		
			Transaction[] temp = new Transaction[currentSize*2];
			
			for(int i = 0; i<currentSize; i++){
				temp[i] = transactions[i];
			}
			
			this.transactions = temp;
		}
	}
	
	//Getter for the Balance
	public double getBalance(){
		
		return balance;
	}
	
	//Method used to dedcut the balance with a given amount of money
	public double deductBalance(double money){
		
		balance = (balance - money);
		return balance;
	}
	
	//Method used to add a certain in amount of money in the balance of an account
	public double addBalance(double money){
		
		balance = (balance + money);
		return balance;
	}
	
	//Getter for the customer
	public Customer getCustomer(){
		
		return customer;
	}
	//ToString Method that displays the balance of an account of a certain customer 
	public String toString(){
		
		String s = "The balance of the account of " + customer + " is " + balance;
		return s;
	}
	//Setter for the customer
	public void setCustomer(Customer c){
		
		customer = c;
	}
	
}
