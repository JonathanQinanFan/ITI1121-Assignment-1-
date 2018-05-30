public abstract class Expense{
	
	private String description;
	
	public Expense(description){
		
		this.description = description;
	}
	
	
	public String getDescription(){
		
		return description;
	}
	
	public abstract double getAmount(){
		
		return amount;
	}

}