public class Senior extends Customer {
	
	private final double CHECK_INTEREST = 0.04;
	private final double CHECK_INTEREST_VIP = 0.04;
	private final double CHECK_CHARGE = 0.01;
	private final double CHECK_CHARGE_VIP = 0;
	private final double SAVINGS_INTEREST = 0.08;
	private final double SAVINGS_INTEREST_VIP = 0.1;
	private final double OVERDRAFT_PENALTY = 10;
	private final double OVERDRAFT_PENALTY_VIP;
	private boolean VIP;
	
	public Senior (String fn, String ln, int a, boolean VIP){
		super(fn, ln, a);
		this.VIP = VIP;
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

	

	
