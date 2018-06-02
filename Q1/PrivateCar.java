public class PrivateCar extends Transportation{

	private int distance;
	double RATE = 0.427;
	
	public PrivateCar(String description, String destination, int distance){
		
		super(description, destination);
		this.distance = distance;
	}
	
	public int getDistance(){
		
		return distance;
	}
	
	public double getAmount(){
		
		return RATE*distance;
	}
}