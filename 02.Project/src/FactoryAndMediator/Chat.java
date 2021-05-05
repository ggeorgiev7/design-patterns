package FactoryAndMediator;
import java.util.ArrayList;
public class Chat {
	private static ArrayList<Person> persons = new ArrayList<Person>();
	private static MyBot myBot;
	private static MainForFactory myFactory = new MainForFactory();
	
	public static void previewMessage(Person person, String message){
		if(!persons.contains(person)){
			System.out.println("System: "+ person.getingName()+ " is joining in the chat");
			return;
		}	
		
		System.out.println("[" + person.getingName()+"] "+ ": " + message);
		
		if(myBot != null && message.contains("cat")){
			myBot.deletePersonFromChat(person);
			myBot.showMessage();			
		}		
		else if(message.equalsIgnoreCase("addBot")){
			myBot = myFactory.newBot();		
		}
	}
	public static void NewPersonInChat(Person person) {
		if(person!= null) {
			persons.add(person);
		}
	}
	public static void DeletePersonFromChat(Person person) {
		if(person!= null && persons.contains(person)) {
			persons.remove(person);
			System.out.println(person.getingName() + " was deleting from the chat");
		}
	}
	public static void newMessage(Person person, String message) {
		if(!persons.contains(person)){
			System.out.println("System: "+ person.getingName()+ " is joining in the chat");
			return;
		
	}
}
}
