//This class is the Customer's specialization for Adults customers.
public class Adult extends Customer{
	
	//Declaring instance variables
	private final double SAVINGS_INTEREST = 0.03;
	private final double CHECK_INTEREST = 0.01;
	private final double CHECK_CHARGE = 0.03;
	private final double OVERDRAFT_PENALTY = 25;
	private final double NO_FEE = 0;
	private final int Ctype = 1;
	private boolean VIP = false;
	
	//Constructor with 3 parameters. It takes the full name and age of the adult in question
	public Adult(String firstName, String lastName, int age){
		super(firstName, lastName, age);
	}
	
	//Getter for the SavingsInterest
	public double getSavingsInterest(){
		return SAVINGS_INTEREST; 		
	} 	
	
	//Getter for the CheckInterest
	public double getCheckInterest(){
		return CHECK_INTEREST;
	}
	
	//Getter for the CheckCharge
	public double getCheckCharge(){
		return CHECK_CHARGE;
	}
	
	//Getter for the Over
	public double getODP_100(){
		return OVERDRAFT_PENALTY;
	}
	
	public double getODP_500(){
		return OVERDRAFT_PENALTY;
	}
	
	public double getNF(){
		
		return NO_FEE;
	}
	
	//Getter for the customer type
	public int getCustomerType(){
		
		return Ctype;
		
	}
	
	//Getter for the VIP status of adults, which in this case will obviously be false for every adults.
	public boolean getVIP(){
		
		return VIP;
	}
}
