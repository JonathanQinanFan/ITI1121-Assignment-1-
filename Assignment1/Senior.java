public class Senior extends Customer {
	
	//Initializing instance Variables
	private final double CHECK_INTEREST = 0.04;
	private final double CHECK_INTEREST_VIP = 0.04;
	private final double CHECK_CHARGE = 0.01;
	private final double CHECK_CHARGE_VIP = 0;
	private final double SAVINGS_INTEREST = 0.08;
	private final double SAVINGS_INTEREST_VIP = 0.1;
	private final double OVERDRAFT_PENALTY = 10;
	private final double OVERDRAFT_PENALTY_VIP_100 = 0;
	private final double OVERDRAFT_PENALTY_VIP_500 = 5;
	private final double NO_FEE = 0;
	private boolean VIP;
	
	//Constructor that has 4 parameter. The first and last name, the age and the VIP status.
	public Senior (String firstName, String lastName, int age, boolean VIP){
		super(firstName, lastName, age);
		this.VIP = VIP;
	}
	
	//These getters are overwriting the abstract methods from the parent class
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
		if(VIP = false){
			return OVERDRAFT_PENALTY;
		}
		else{
			return OVERDRAFT_PENALTY_VIP_100;
		}
	}
	
	public double getODP_500(){
		if(VIP = false){
			return OVERDRAFT_PENALTY;
		}
		else{
			return OVERDRAFT_PENALTY_VIP_500;
		}
	}
	public double getNF(){
		
		return NO_FEE;
	}
}

	

	
