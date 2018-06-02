public class Breakfast extends Meal{

	private double ALLOWANCE = 11.55;
	
	public Breakfast(String description, int numberOfMeals){
		
		super(description, numberOfMeals);
	}
	
	public double getALLOWANCE(){
		
		return ALLOWANCE;
	}
}