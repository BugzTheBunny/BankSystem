
public class WithdrawException extends Exception {
	private int clientid;
	private float currBalance, withdrawAmmount;

	public int getClientid() {
		return clientid;
	}

	public WithdrawException(String msg, int clientid, float currBalance, float withdrawAmmount) {
		super("Not Enough money on you balance");
		this.clientid = clientid;
		this.currBalance = currBalance;
		this.withdrawAmmount = withdrawAmmount;
	}

	public float getCurrBalance() {
		return currBalance;
	}

	public float getWithdrawAmmount() {
		return withdrawAmmount;
	}

}
