
public class Account {
	private int id;
	private float balance;

	// Ctors
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	// Methods
	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Account && ((Account) obj).getId() == this.id) {
			return true;
		}
		return false;

	}

	@Override

	public String toString() {
		return "Account ID:" + id + ", BALANCE:" + balance;
	}
}
