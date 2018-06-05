//This class will be taking care of the checking accounts
public class CheckingAccount extends Account{
	
	//Initializing instance variable
	private int history = 0;
	
	//Constructor that uses the constructor of the Customer class	
	public CheckingAccount(Customer customer){
		
		super(customer);
	}
	//Method used to deposit a given amount of money to the checking account
	public void deposit(double amount){
		
		addBalance(amount);
		double fees = (getCustomer()).getNF();
		Transaction depositTransaction = new Transaction((byte)0, amount, fees);
		reallocate();
		transactions[history] = depositTransaction;
		history++;
		
	}
	//Method used when the user wants to withdraw money from his account
	public void withdraw(double amount){
		
		if ((deductBalance(amount))<0){
			
			if (getCustomer().getCustomerType()==0){
				
				if(getCustomer().getVIP()==true){
					
					if(Math.abs(deductBalance(amount))<100||Math.abs(deductBalance(amount))==100){
						
						deductBalance(amount);
						double fees = (getCustomer().getODP_100() + getCustomer().getCheckCharge());
						
						Transaction depositTransaction = new Transaction((byte)1, amount, fees);
						reallocate();
						transactions[history] = depositTransaction;
						history++;
			
					}
					
					else if(Math.abs(deductBalance(amount))<500){
						
						deductBalance(amount);
						double fees = (getCustomer().getODP_500() + getCustomer().getCheckCharge());
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
						double fees = (getCustomer().getODP_500() + getCustomer().getCheckCharge());
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
					double fees = (getCustomer().getODP_500() + getCustomer().getCheckCharge());
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
			double fees = (getCustomer().getNF() + getCustomer().getCheckCharge());
			
			Transaction depositTransaction = new Transaction((byte)1, amount, fees);
			reallocate();
			transactions[history] = depositTransaction;
			history++;
			
		}
		
		
	}
	//Method used to add Interest
	public void addInterest(){
		
		double balance = getBalance();
		double amount = ((balance)*(getCustomer().getCheckInterest()));
		double fees = (getCustomer().getNF());
		addBalance(amount);
		
		Transaction depositTransaction = new Transaction((byte)2, amount, fees);
		reallocate();
		transactions[history] = depositTransaction;
		history++;
		
	}
}
