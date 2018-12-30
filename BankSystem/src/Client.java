import java.util.ArrayList;

public abstract class Client {
	private int id;
	public float getComRate() {
		return comRate;
	}

	private String name;
	private float balance;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	protected float comRate;
	protected float intRate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Client(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		Log log = new Log(id, balance, "New Client was created");
		System.out.println(log);
	}

	public void addAccount(Account a) {
		if (accounts.contains(a)) {
			System.err.println("Error, account already added.");
		} else {
			accounts.add(a);
		}
	}

	

	public void autoUpdateAccounts() {
		for (Account a : accounts) {
			if (a != null) {
				a.setBalance(a.getBalance() + 0);
			}
		}
	}

	public float getFortune() {
		float total = balance;
		for (Account a : accounts) {
			if (a != null) {
				total += a.getBalance();
			}
		}
		return total;
	}

	public void removeAccount(Account a) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i) != null && accounts.get(i).equals(a)) {
				balance -= accounts.get(i).getBalance();
				System.out.println("Account ID: " + accounts.get(i).getId() + " removed");
				accounts.remove(a);
				return;
			} else {
				Log log = new Log(id, " Tried to remove an account, Error accured.");
				System.err.println("An error has accured");
			}
		}

	}

	public void deposit(float ammount) {
		balance += ammount;
		Log l = new Log(this.id, ammount, "deposit");
		System.out.println(l);

	}

	public void withdraw(float ammount) throws WithdrawException {
		float com = comRate * ammount / 100;
		if (balance - (ammount + com) > 0) {
			balance -= ammount + com;
			Bank.addCommision(com);
		} else
			throw new WithdrawException("Error !", id, balance, ammount);
	}

	public void accountsList() {
		System.out.println("     [" + name + "'s Account List:]");
		for (Account acs : accounts) {
			System.out.println("|" + acs.toString() + "|");
		}
		System.out.println("+----------------------------+");

	}
}
