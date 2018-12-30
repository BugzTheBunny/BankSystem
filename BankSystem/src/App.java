import java.util.Scanner;

public class App {

	public static void main(String[] args) throws WithdrawException {
		Scanner kb = new Scanner(System.in);
		//Creating Client
		
		GoldAccount c1 = new GoldAccount(2, "Bob", 1000);
		//Creating accounts 
		Account a = new Account(1, 100);
		Account b = new Account(2, 300);
		Account c = new Account(3, 200);
		Account d = new Account(4, 115);
		Account e = new Account(5, 190);
		
		//Adding accounts to the client
		c1.addAccount(a);
		c1.addAccount(b);
		c1.addAccount(a);
		c1.addAccount(c);
		c1.addAccount(e);
		
		//Adding the client to the bank
		Bank.getBank().addClient(c1);
		
		//Actions
		System.out.println(Bank.getBank().getBalance());
		System.out.println("Enter withdraw ammount:");
		c1.withdraw(kb.nextFloat());
		System.out.println("Client cash " + c1.getFortune());
		c1.autoUpdateAccounts();
		System.out.println(Bank.getBank().getBalance());
		Bank.getBank().removeClient(c1);
		System.out.println(Bank.getBank().getBalance());
		c1.accountsList();
	}
}
