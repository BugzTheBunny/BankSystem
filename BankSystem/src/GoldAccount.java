
public class GoldAccount extends Client {

	public GoldAccount(int id, String name, float balance) {
		super(id, name, balance);
		comRate = 2;
		intRate = 0.3f;
	}

	@Override
	public String toString() {
		return "Golden Account Name: " + getName() + ", Balance: " + getBalance() + ", ID: " + getId();
	}

}
