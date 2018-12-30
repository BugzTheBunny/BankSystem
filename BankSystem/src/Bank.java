import java.util.ArrayList;

public class Bank {
	private ArrayList<Client> clients;
	private float balance;
	private Logger logService;
	public static Bank instance = new Bank();
	private static float commisionSum;

	private Bank() {
		clients = new ArrayList<Client>();
	}

	public static Bank getBank() {
		return instance;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setBalance() {
		balance = 0;
		for (Client c : clients) {
			if (c != null) {
				balance += c.getFortune();
			}
		}
		balance += commisionSum;
	}

	public float getBalance() {

		setBalance();
		System.out.print("- The Bank balance is: ");
		return balance;
	}

	//Methods
	
	public void addClient(Client c) {
		clients.add(c);
		Log log = new Log(c.getId(), c.getFortune(), "Client " + c.getId()+" was added to the bank");
		System.out.println(log);
	}
	
	public void removeClient(Client c) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i) != null && clients.get(i).equals(c)) {
				balance -= clients.get(i).getFortune();
				clients.remove(c);

			}
		}

	}
	
	public void viewLogs() {

	}

	public void startAccountUpdater() {

	}

	public void commisionTotal() {
		System.out.println(commisionSum);
	}

	public static void addCommision(float comi) {
		commisionSum += comi;
	}

	public void getClientList() {
		for (Client client : clients) {
			if (client != null) {
				System.out.println("---[Client " + client.getId() + "]--------------------");
				System.out.println(client);
				System.out.println("---------------------------------");

			}
		}
	}

}
