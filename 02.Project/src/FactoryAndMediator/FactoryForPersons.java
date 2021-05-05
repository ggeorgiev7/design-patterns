package FactoryAndMediator;

public class FactoryForPersons {
	public Person newPerson(String name)
	{
		return new Person(name);
	}
}
