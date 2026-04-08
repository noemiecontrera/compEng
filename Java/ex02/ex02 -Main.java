public class Main{
	public static void main(String [] args) {
		BankAccount bankAccount1 = new BankAccount("Noemi Contrera", 5000);
		
		bankAccount1.withdraw(1000);
		bankAccount1.deposit(1000);
		
		System.out.println(bankAccount1.getBalance());
	}
} 	