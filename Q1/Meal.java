public abstract class Meal extends Expense{

	private int numberOfMeals;
	
	public Meal(String description, int numberOfMeals){
		
		super(description);
		this.numberOfMeals = numberOfMeals;
	}
	
	public int getNumberOfMeals(){
		
		return numberOfMeals;
	}
	
	public double getAmount(){
		
		return numberOfMeals*getALLOWANCE();
	}
	
	public abstract double getALLOWANCE();
}