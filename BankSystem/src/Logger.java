
public class Logger {
	private String driverName;

	public Logger(String driverName) {
		this.driverName = driverName;
	}

	public void log(Log log) {
		System.out.println(log.getData());
	}

	public Log[] getLogs() {
		return null;
	}
}
