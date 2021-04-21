package FactoryAndMediator;

public class MyFactory {
	protected FactoryForPersons factoryForPersons;
	protected FactoryForBots factoryForBots;
	
	public Person newPerson(String name)
	{
		return factoryForPersons.newPerson(name);		
	}
	public MyBot newBot()
	{
		return factoryForBots.newBot();
	}
}
