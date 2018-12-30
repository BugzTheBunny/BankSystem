import java.time.LocalDate;
import java.time.LocalTime;

public class Log {
	private LocalDate date = LocalDate.now();
	private LocalTime time = LocalTime.now();
	private int clientId;
	private float ammount;
	private String description;

	public String toString() {
		return "\n--------------------------------\nLog Time: " + date + " / " + time + "\nID: " + clientId
				+ ", ammount: " + ammount + ", " + description + "\n--------------------------------";
	}

	public Log(int id, float ammount, String description) {
		this.clientId = id;
		this.ammount = ammount;
		this.description = description;
	}

	public Log(int id, String description) {
		this.description = description;
		this.clientId = id;
	}

	public String getData() {
		return date + " " + time + " " + clientId + " " + description + ammount;
	}

}
