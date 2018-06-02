public abstract class PrivateCar extends Transportation{

	private int distance;
	double RATE = 0.427;
	
	public PrivateCar(String description, String destination, String distance){
		
		super(description, destination);
		this.distance = distance;
	}
	
	public int getDistance(){
		
		return distance;
	}
	
	public int getAmount(){
		
		return RATE*distance;
	}
}