import java.text.NumberFormat;

/*
 * Rahul Shah
 * Pd6
 * 12/18/14
 * Represents a person's bank account and locks with Lockable
 */

public class Account implements Lockable{

	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private final double RATE = 0.035; //interest rate of 3.5%
	
	//instance variables
	private int acctNumber;
	private double balance;
	private String name;
	private int key;
	private boolean isLocked = false;
	
	
	
	//sets up account with owner, account number, 
	//and initial balance
	
	public Account (String owner, int account, double initial){
		name = owner; 
		acctNumber = account;
		balance = initial;
		
		
	}//end of Account constructor
	
	//validates the transaction, then deposits the specified amount 
	//into the account. Returns the new balance.
	public double deposit (double amount){
		if(!isLocked){
			if (amount < 0){
				System.out.println("Error deposit amount is invalid");
				System.out.println(acctNumber + " " + fmt.format(amount));
			}
			else
				balance = balance + amount;
			return balance;
		}
		else{
			System.out.println("Locked, returning -1");
			return -1;
		}
	}//end of deposit
	//validates the transaction, then withdraws the specified  amount
	//from the account. Returns new balance.
	public double withdraw (double amount, double fee){
		if(!isLocked){
			amount += fee;
			if (amount < 0){
				System.out.println("Error: Withdraw amount is invalid");
				System.out.println("Account: " + acctNumber);
				System.out.println("Requested: " + fmt.format(amount));
			}
			else{
				if(amount > balance){
					System.out.println("Error: insufficient funds");
					System.out.println("Account: " + acctNumber);
					System.out.println("Requested: " + fmt.format(amount));
					System.out.println("Available : " + fmt.format(balance));
				}
				else{
					return balance = balance - amount;
				}
			}
		}else{
			System.out.println("Locked, returning -1");
		}
		return -1.0;
		
	}//end of withdraw
	//adds interest to the account and returns the new balance
	
	public double addInterest (){
		if(!isLocked){
			balance += (balance + RATE);
			return balance;
		}
		else{
			System.out.println("Locked, returning -1");
		}
		return -1;
	}//end of addInterest
	
	//returns the current balance of the account
	public double getBalance(){
		if(!isLocked)
			return balance;
		else{
			System.out.println("Locked, returning -1");
		}
		return -1;
	}//end of getBalance
	
	//returns account number
	public int getAccountNumber(){
		if(!isLocked)
			return acctNumber;
		else{
			System.out.println("Locked, returning -1");
		}
		return -1;
	}//end of getAccountNumber
	
	//returns a one line description of the account
	public String toString(){
		if(!isLocked)
			return (acctNumber + "/t" + name + "/t" + fmt.format(balance));
		else{
			return "Error: account locked";
		}
			
	}//end of toString

	@Override
	//sets the keycode for the user if it is not locked
	public void setKey(int k) {
		
		if(isLocked){
			System.out.println("It is locked");
		}
		else{
			key = k;
		}
		
	}//end of setKey

	@Override
	//locks the account 
	public void lock(int key) {
		
		if(isLocked){
			System.out.println("Already locked!");
		}
		else{
			if (key == this.key){
				isLocked = true;
				System.out.println("Locked");
			}
			else
				System.out.println("Incorrect key");
		}
		
	}//end of lock

	@Override
	//unlocks the account
	public void unlock(int k) {
		
		if (isLocked){
			if (k == this.key){
				isLocked = false;
				System.out.println("Unlocked!");
			}
			else
				System.out.println("Incorrect key");
		}
		
	}//end of unlock

	@Override
	//returns the state of isLocked
	public boolean locked() {
		return isLocked;
	}//end of locked
	
}//end of account
