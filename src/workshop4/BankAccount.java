package workshop4;

public class BankAccount {
	double balance;
	
	BankAccount(){
		this.balance = 0.0;
	}
       void deposit(double amount) {
    	   if (amount > 0) {
               balance += amount;
           }else {
        	   System.out.println("The deposited amount should be positive.");
           }
       }
       public boolean withdraw(double amount) {
           if (amount > 0 && amount <= balance) {
               balance -= amount;
               return true;
           }
           return false; 
       }
       
    // Method to get the current balance
       public double getBalance() {
           return balance;
       }
}
