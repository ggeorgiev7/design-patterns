package FactoryAndMediator;

public class MyBot {
	public void showMessage() {
		System.out.println("MyBot: You can not write the word //cat//");
	}
	public void deletePersonFromChat(Person person) {
		Chat.DeletePersonFromChat(person);
	}
}
