public class ExpenseTracker{

	private Expense[] expenses;
	private int size;
	double total;
	
	public ExpenseTracker(int capacity){
		
		expenses = new Expense[capacity];
		size = 0;
	}
	
	public boolean add(Expense e){
		
		expenses[size++] = e;
		return true;
	}
	
	public double getTotal(){
		
		double total = 0.0;
		
		for(int i = 0; i <size; i++){
			
			total = total + expenses[i].getAmount();
		}
		
		return total;
		
	}
	
	public static void main(String[] args){
		ExpenseTracker epro = new ExpenseTracker( 10 );
		epro.add( new PrivateCar( "ACFAS 2004", "Montreal (QC)", 430 ) );
		epro.add( new Airfare( "IWBRA 2005", "Atlanta (GA)", 204.0 ) );
		epro.add( new Breakfast( "IWBRA 2005", 2 ) );
		epro.add( new Lunch( "IWBRA 2005", 3 ) );
		epro.add( new Dinner( "IWBRA 2005", 2 ) );
		System.out.println( "total = " + epro.getTotal() );
		
	}
}