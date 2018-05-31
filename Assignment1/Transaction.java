import java.util.Date;

public class Transaction{
	
	//Not sure what the String description is used for.
	private byte transaction;
	private double amount; 
	Date date = new Date();
	private String description;
	private double fees;

	public String  processTransaction(){
		private String transactionType;
		switch(transaction){
			case 0:
				transactionType = deposit;break;			
			case 1:
				transactionType = withdraw;break;
			case 2: 
				transactionType = addedInterest;break;
			default:
				System.out.println("Please, choose a valid transaction type.")
		}
		return (Date + "The transaction type is a " + transactionType + " and the amount is " + amount ". The fees are " + fees + ".")
		
	}
}
