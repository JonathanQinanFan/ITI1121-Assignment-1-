abstract class Account{
	
	private Customer customer;
	private double balance;
	private int accountNumber;
	private int lastaccountNumber = 9999;
	private Transaction[] transactions;
	private static final int INITSIZE = 25;
	private int currentSize;
	
	public Account(Customer customer){
		
		this.customer = customer;
		balance = 0;
		
		currentSize = INITSIZE;
		transactions = new Transaction[currentSize];
		accountNumber = lastaccountNumber;
		lastaccountNumber++;
		
	}
	
	public reallocate(){
		
		Transaction[] temp = new Transaction[currentSize*2]
		
		for(int i = 0; i<currentSize; i++){
			temp[i] = transactions[i];
		}
		
		this.transactions = temp;
		
	}
	
	public double getBalance(){
		
		return balance;
	}
	
	public customer getCustomer(){
		
		return customer;
	}
	
	public String toString(){
		
		String s = "The balance of the account of " + customer + " is " + balance;
		return s;
	}
	
	public void setCustomer(Customer c){
		
		customer = c;
	}
	
}
