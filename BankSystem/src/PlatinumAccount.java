
public class PlatinumAccount extends Client {

	public PlatinumAccount(int id, String name, float balance) {
		super(id, name, balance);
		comRate = 1;
		intRate = 0.5f;
	}

	@Override
	public String toString() {
		return "Platinum Account Name: " + getName() + ", Balance: " + getBalance() + ", ID: " + getId();
	}
}
