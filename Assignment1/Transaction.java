import java.util.Date;
//This class takes care fo the bank's transactions
public class Transaction{
	
	//Initializing instances variables
	private byte transaction;
	private double amount, fees;
	private Date date;
	private String description;
	private String transactionType;
	
	//Constructor that build an instance of transaction with a specified transaction type, an amount and the fees.
	public Transaction(byte transaction, double amount, double fees){
		
		this.transaction = transaction;
		this.amount = amount;
		this.fees = fees;
		date = new Date();
		
	}
	
	//This method will figure what kind of transaction is the user trying to make. Then, it will displays the information.
	public String processTransaction(){
		switch(transaction){
			case 0:
				transactionType = "deposit";break;			
			case 1:
				transactionType = "withdraw";break;
			case 2: 
				transactionType = "addedInterest";break;
			default:
				System.out.println("Please, choose a valid transaction type.");
		}
		return (date + ": " + transactionType + " of " + amount + ". Fees:" + fees + ".");
		
	}
	
}
