//This class will take care of the savings accounts
public class SavingsAccount extends Account{	
	
	//Initializing instance variable
	private int history = 0;
	
	//Constructor calling the Customer's constructor to create an instance of SavingsAccount	
	public SavingsAccount(Customer customer){
		
		super(customer);
	}
	//Method used when user is depositing money
	public void deposit(double amount){
		
		addBalance(amount);
		double fees = (getCustomer()).getNF();
		Transaction depositTransaction = new Transaction((byte)0, amount, fees);
		reallocate();
		transactions[history] = depositTransaction;
		history++;
		
	}
	//Method used when the user wants to withdraw money from his savings account
	public void withdraw(double amount){
		
		if ((deductBalance(amount))<0){
			
			if (getCustomer().getCustomerType()==0){
				
				if(getCustomer().getVIP()==true){
					
					if(Math.abs(deductBalance(amount))<100||Math.abs(deductBalance(amount))==100){
						
						deductBalance(amount);
						double fees = getCustomer().getODP_100();
						
						Transaction depositTransaction = new Transaction((byte)1, amount, fees);
						reallocate();
						transactions[history] = depositTransaction;
						history++;
			
					}
					
					else if(Math.abs(deductBalance(amount))<500){
						
						deductBalance(amount);
						double fees = getCustomer().getODP_500();
						deductBalance(fees);
						
						Transaction depositTransaction = new Transaction((byte)1, amount, fees);
						reallocate();
						transactions[history] = depositTransaction;
						history++;
						
					}
					
					else{
						System.out.println("Can not overdraft more than 500$");
					}
				
				}
				
				else{
					if(Math.abs(deductBalance(amount))<500){
						
						deductBalance(amount);
						double fees = getCustomer().getODP_500();
						deductBalance(fees);
						
						Transaction depositTransaction = new Transaction((byte)1, amount, fees);
						reallocate();
						transactions[history] = depositTransaction;
						history++;
						
					}
					
					else{
						
						System.out.println("Can not overdraft more than 500$");
					}
					
				}
			}
			
			else if (getCustomer().getCustomerType()==1){
				
				if(Math.abs(deductBalance(amount))<500){
					
					deductBalance(amount);
					double fees = getCustomer().getODP_500();
					deductBalance(fees);
					
					Transaction depositTransaction = new Transaction((byte)1, amount, fees);
					reallocate();
					transactions[history] = depositTransaction;
					history++;
					
				}
				
				else{
					
					System.out.println("Can not overdraft more than 500$");
				}
				
			}
			
			else if (getCustomer().getCustomerType()==2){
				
				System.out.println("Students can't overdraft");
			}
			
		}
		
		else{
			
			deductBalance(amount);
			double fees = getCustomer().getNF();
			
			Transaction depositTransaction = new Transaction((byte)1, amount, fees);
			reallocate();
			transactions[history] = depositTransaction;
			history++;
			
		}
		
		
	}
	//Method used to add interest
	public void addInterest(){
		
		double balance = getBalance();
		double amount = ((balance)*(getCustomer().getSavingsInterest()));
		double fees = (getCustomer().getNF());
		addBalance(amount);
		
		Transaction depositTransaction = new Transaction((byte)2, amount, fees);
		reallocate();
		transactions[history] = depositTransaction;
		history++;
		
	}
}
