public class Adult extends Customer{
	
	private final double SAVINGS_INTEREST = 0.03;
	private final double CHECK_INTEREST = 0.01;
	private final double CHECK_CHARGE = 0.03;
	private final double OVERDRAFT_PENALTY = 25;

	public Adult(String fn, String ln, int a){
		super(fn,ln,a);
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
}
