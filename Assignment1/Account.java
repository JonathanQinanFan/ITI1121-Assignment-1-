public abstract class Account{
	
	private Customer customer;
	private double balance;
	private int accountNumber;
	private int lastaccountNumber = 9999;
	Transaction[] transactions;
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
	
	public void reallocate(){
		
		if(transactions.length==currentSize){
		
			Transaction[] temp = new Transaction[currentSize*2];
			
			for(int i = 0; i<currentSize; i++){
				temp[i] = transactions[i];
			}
			
			this.transactions = temp;
		}
	}
	
	public double getBalance(){
		
		return balance;
	}
	
	public void addBalance(double money){
		
		balance = (balance + money);
	}
	
	public Customer getCustomer(){
		
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