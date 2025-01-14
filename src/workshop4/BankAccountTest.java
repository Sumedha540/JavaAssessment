package workshop4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	@Test
	void testDeposit(){
       BankAccount ba = new BankAccount();
       ba.deposit(100.0);
       assertEquals(100, ba.balance, 0.001);
       System.out.println("Balance is 100 after deposit.");
}
	
	@Test
	void testWithdraw(){
       BankAccount ba = new BankAccount();
       ba.deposit(100.0);
       ba.withdraw(50.0);
       assertEquals(50, ba.balance, 0.001);
       System.out.println("Balance is 50 after withdrawal.");
       ba.withdraw(60);
       assertEquals(-10, ba.balance, 0.001);
       System.out.println("Insufficient balance. Balance is lesser than 60.");
}	
}
