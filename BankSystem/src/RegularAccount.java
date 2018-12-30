
public class RegularAccount extends Client {

	public RegularAccount(int id, String name, float balance) {
		super(id, name, balance);
		comRate = 3;
		intRate = 0.1f;
	}

	@Override
	public String toString() {
		return "Regular Account Name: " + getName() + ", Balance: " + getBalance() + ", ID: " + getId();
	}

}
