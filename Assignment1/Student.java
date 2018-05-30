public class Student extends Customer {

	//Note : Student cannot overdraft
	private final double SAVINGS_INTEREST = 0.07;
	private final double CHECK_INTEREST = 0.03;
	private final double CHECK_CHARGE = 0.02;
	
	public Student(String fn, String ln, int a){
		super(fn, ln, a);
	}
}