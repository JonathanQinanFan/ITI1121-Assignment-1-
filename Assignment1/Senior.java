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
	private final int Ctype = 0;
	
	//Constructor that has 4 parameter. The first and last name, the age and the VIP status.
	public Senior (String firstName, String lastName, int age, boolean VIP){
		super(firstName, lastName, age);
		this.VIP = VIP;
	}
	
	//These getters are overwriting the abstract methods from the parent class
	public double getSavingsInterest(){
		if(VIP = false){
			return SAVINGS_INTEREST;	
		}
		else{
			return SAVINGS_INTEREST_VIP;
		}
	}
	
	public double getCheckInterest(){
		if(VIP = false){
			return CHECK_INTEREST;   
		}
		else{
			return CHECK_INTEREST_VIP;
		}
 	}
	
	public double getCheckCharge(){
		if(VIP = false){
			return CHECK_CHARGE;
		}
		else{
			return CHECK_CHARGE_VIP;
		}
	}
	
	public boolean getVIP(){
		
		return VIP;
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
	
	public int getCustomerType(){
		
		return Ctype;
		
	}
}

	

	
