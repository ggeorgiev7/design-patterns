package TheChain;
import java.util.ArrayList;
import java.util.List;

import TheObserverBoy.Observer;
import State.TheState;
public class TheWorkerForForeignCountry extends Worker{
private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TheWorkerForForeignCountry(String name) {
		super(name);
		this.destination = Worker.ForeignCountry;
	
	}
	
	private List<Observer> observers = new ArrayList<Observer>();
	private TheState TheState;

	public void setTheState(TheState TheState) {
		this.TheState =TheState ;
		this.notifyObservers();
	}
	
	public TheState getTheState(){
		return TheState;
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTheState(this);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
		
	}

	@Override
	public TheState getUpdate() {
		
		return this.TheState;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("The foreign country worker  " + message);
		
	}
}
