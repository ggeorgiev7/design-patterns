package FactoryAndMediator;

public class Main {
	public static void main(String[] args) {
		MyFactory myFactory = new MainForFactory();
		Person person1 = myFactory.newPerson("Mitko");
		Person person2 = myFactory.newPerson("Petko");
		Person person3 = myFactory.newPerson("Mimi");
		Person person4 = myFactory.newPerson("Iva");

		Chat.NewPersonInChat(person1);
		Chat.NewPersonInChat(person2);
		Chat.NewPersonInChat(person3);
		Chat.NewPersonInChat(person4);
		
		///////////////////////////////////////////////
		
		person1.newMessage("Hello, friends.");
		person2.newMessage("Hello, Iliqn!");
		person3.newMessage("Hello, Iliqn!");
		person4.newMessage("Hello, Iliqn!");
		
		person1.newMessage("addBot");
		person2.newMessage("Friends, I want to tell you that my cat is not at my home... Would you tell me if you see her..!");
		person3.newMessage("Yes, we would tell you if we are seeing her");
		person4.newMessage("Yes, of cours");
		
		//////////////////////////////////////////////
		/*person1.sendMessage("My name is Georgi!");
		secondUser.sendMessage("Hi Georgi!");
		thirdUser.sendMessage("Hi Georgi!");

		anotherUser.sendMessage("Hi!");
		
		//No bot is added so users can use the cat word
		firstUser.sendMessage("Do u guys love cats?");
		secondUser.sendMessage("addBot");
		//No more cats says Bot!
		thirdUser.sendMessage("Yeah cats are great, I have a cat at home!");
		//Pesho not in chat anymore
		thirdUser.sendMessage("another message!");
*/
	}

}
