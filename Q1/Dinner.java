public class Dinner extends Meal{


	private double ALLOWANCE = 31.80;
	
	public Dinner(String description, int numberOfMeals){
		
		super(description, numberOfMeals);
	}
	
	public double getALLOWANCE(){
		
		return ALLOWANCE;
	}
}