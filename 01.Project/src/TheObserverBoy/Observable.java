package TheObserverBoy;
import State.TheState;
public interface Observable {
	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void notifyObservers();
	public TheState getUpdate();
}
