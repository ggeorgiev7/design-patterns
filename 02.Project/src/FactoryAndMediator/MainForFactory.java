package FactoryAndMediator;

public class MainForFactory extends MyFactory{
	public MainForFactory() {
		factoryForBots = new FactoryForBots();
		factoryForPersons = new FactoryForPersons();
	}
}
