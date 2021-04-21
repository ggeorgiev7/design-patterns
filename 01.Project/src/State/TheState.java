package State;
import TheChain.Worker;
public interface TheState {
	public void attachState(Worker worker);
	public String getTheNameOfState();
}
