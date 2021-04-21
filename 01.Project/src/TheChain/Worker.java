package TheChain;
import TheObserverBoy.Observable;
import State.TheState;
public abstract class Worker implements Observable {
	public static int ForeignCountry = 1;
	public static int Country = 2;
	public static int City = 3;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Worker(String name) {
		this.name = name;
	}
	
	
	protected int destination; 
	
	
	private TheState TheState;
	
	public TheState getTheState() {
		return TheState;
	}
	
	public void setTheState(TheState TheState) {
		this.TheState = TheState;
	}
	
	protected Worker nextWorker;
	
	public void nextWorker(Worker nextWorker) {
		this.nextWorker = nextWorker;
	}
	
	public void logMessage(int destination, String message) {
		
		if(this.destination <= destination) {
			
			this.writeMessage(message);
		}
		
		if(this.nextWorker != null) {
			this.nextWorker.logMessage(destination, message);
		}
		
	}
	
	abstract protected void writeMessage(String message);
	
	
	
	
}
