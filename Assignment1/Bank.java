Bank.java

/*
 * Bank.java
 *
 * Created on July 21, 2004, 1:23 AM
 */

public class Bank {
    private Account[] accounts;
    private int size;
    private int capacity;
    
    private static final int SAVINGS = 0;
    private static final int CHECKING = 1;    
    private static final int SENIOR = 0;
    private static final int ADULT = 1;    
    private static final int STUDENT = 2;
    private static final int INIT_CAPACITY = 100;
    
    /** Creates a new instance of Bank */
    public Bank() {
        accounts = new Account[INIT_CAPACITY];
        }


    
    /********************************************************************
     * Creates a new account.
     * pre: customer information must be not null and types must be valid
     * post: New account added to bank
     * @param customerName String Account owner's name
     * @param customerAddress String Owner's address
     * @param customerAge int Owner's age (in years)
     * @param customerPhoneNumber String Owner's phone number
     * @param customerType int Owner's type of customer within bank
     * @param typeAccount int Account type (savings or checking)
     * @return String New account number
     */
    public String addAccount(String customerName, String customerAddress, 
                             int customerAge, String customerPhoneNumber, 
                             int customerType, int typeAccount){
                             Customer customer;
                             if(customerType == STUDENT){
                             customer = new Student(customerName, customerAddress, customerAge, customerPhoneNumber, customerName);}
                             else if (customerType== ADULT){ 
                             customer = new Adult(customerName, customerAddress, customerAge, customerPhoneNumber, customerName);}
                             else{ customer = new Senior(customerName, customerAddress, customerAge, customerPhoneNumber, customerName);}
                             Account newAccount = new Account(customer, SAVINGS, customerName);
                             return "";
                             }
    
    /***********************************************************************
     * Make a deposit into account.
     * pre: amount must be a positive integer
     * post: Account's balance increases
     * @param accountNumber String Account's number
     * @param amount double Amount to deposit
     * @return double New balance
     */
     
     //Our bank is assuming that the accountNumber is always valid. Find method is not used since it's not covered in the directives.
    public String makeDeposit(String accountNumber, double amount){
    
            if(amount < 0){
            return ("In order to deposit money, you must enter a positive amount.");
            } else if(amount = 0){
            return("Depositing no money at all won't change your balance. Please, enter a positive amount.")
            else{ 
            accounts[accountNumber].addBalance(amount);
            return ("The balance of the account " + accountNumber + " is now : " + (accounts[index].getBalance));
            
            }
          
    }
    
    /***********************************************************************
     * Make a withdrawal from account.
     * pre: amount must be a positive integer
     * post: Account's balance decreases
     * @param accountNumber String Account's number
     * @param amount double Amount to withdraw
     * @return double New balance
     */    
     
     //Our bank is assuming that the account number is always valid, in that case this method has been modified
    public String makeWithdrawal(String accountNumber, double amount){
            if(amount < 0){
            return ("In order to withdraw money, you must enter a positive amount.");
            } else if(amount = 0){
            return("Withdrawing no money at all won't change your balance. Please, enter a positive amount.")
            else{ 
            accounts[accountNumber].deductBalance(amount);
            return ("The balance of the account " + accountNumber + " is now : " + (accounts[accountNumber].getBalance));      
    }

    /***********************************************************************
     * Returns account information as a string so it can be displayed
     * @param accountNumber String Account's number
     * @return String Account information as a String object
     */    
    public String getAccount(String accountNumber){
        return ("The account number is " + accountNumber);
        }
    
    /***********************************************************************
   
     //This method is not found in the brightspace assignment directives. Therefore, it has not been implemented. For this reason, our bank
     // is assuming that the accountNumber is always valid
     
     * Given an account number tells if the account exists or not
     * @param accountNumber String Account's number
     * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
     */    
  // private int find(String accountNumber);
  

 /***********************************************************************

    //The comments below seems false since it doesn't describe reallocate the same way as the assignment on brightspace is describing it.
    /** You need to create private method : Allocate to allocate a new array to hold the transactions. */
    //This method reallocate in a bigger array when the array is full
    private void reallocate() {
        if(accounts.length==currentSize){

		

			Account[] temp = new Account[currentSize*2];

			

			for(int i = 0; i<currentSize; i++){

				temp[i] = accounts[i];

			}

			

			this.accounts = temp;
    }
}
