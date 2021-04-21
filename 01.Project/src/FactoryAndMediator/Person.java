package FactoryAndMediator;

public class Person {
	 private String name;

	   public String getingName() {
	      return name;
	   }

	   public void setingName(String name) {
	      this.name = name;
	   }

	   public Person(String name){
	      this.name  = name;
	   }

	   public void newMessage(String message){
	      Chat.newMessage(this,message);
	   }
}
