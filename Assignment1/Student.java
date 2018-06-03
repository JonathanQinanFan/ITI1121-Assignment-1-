public class Student extends Customer {

	//Note : Student cannot overdraft
	private final double SAVINGS_INTEREST = 0.07;
	private final double CHECK_INTEREST = 0.03;
	private final double CHECK_CHARGE = 0.02;
	private final double OVERDRAFT_PENALTY = 0;
	private final double NO_FEE = 0;
	
	public Student(String firstName, String lastName, int age){
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
