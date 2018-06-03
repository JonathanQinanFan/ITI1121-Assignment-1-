import java.util.Date;

public class Transaction{

	private byte transaction;
	private double amount, fees;
	private Date date;
	private String description;
	private String transactionType;
	
	
	public Transaction(byte transaction, double amount, double fees){
		
		this.transaction = transaction;
		this.amount = amount;
		this.fees = fees;
		date = new Date();
		
	}
	
	public String processTransaction(){
		switch(transaction){
			case 0:
				transactionType = "deposit";break;			
			case 1:
				transactionType = "withdraw";break;
			case 2: 
				transactionType = "addedInterest";break;
			default:
				System.out.println("Please, choose a valid transaction type.")
		}
		return (Date + ": " + transactionType + " of " + amount ". Fees:" + fees + ".")
		
	}
	
}