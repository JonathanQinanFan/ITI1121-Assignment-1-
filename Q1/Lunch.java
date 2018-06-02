public class Lunch extends Meal{

	private double ALLOWANCE = 11.30;
	
	public Lunch(String description, int numberOfMeals){
		
		super(description, numberOfMeals);
	}
	
	public double getALLOWANCE(){
		
		return ALLOWANCE;
	}
}