public class Adult extends Customer{
	
	private final double SAVINGS_INTEREST = 0.03;
	private final double CHECK_INTEREST = 0.01;
	private final double CHECK_CHARGE = 0.03;
	private final double OVERDRAFT_PENALTY = 25;
	private final double NO_FEE = 0;

	public Adult(String firstName, String lastName, int age){
		super(firstName, lastName, age);
	}
	
	public double getSavingsInterest(){
		return SAVINGS_INTEREST; 		
	} 	
	
	public double getCheckInterest(){
		return CHECK_INTEREST;
	}
	
	public double getCheckCharge(){
		return CHECK_CHARGE;
	}
	
	public double getODP_100(){
		return OVERDRAFT_PENALTY;
	}
	
	public double getODP_500(){
		return OVERDRAFT_PENALTY;
	}
	public double getNF(){
		
		return NO_FEE;
	}
}
