// This class will define a person and the information about a person that is needed
public class Person {

	//Declare a variable for the person's name
	String name;	
	//Declare a variable for the person's age
	int age;
	
	public Person(String namePerson, int agePerson) { //Include parameters for name and age
		//Create a constructor that will initialize the name and age variables
		name = namePerson;
		age = agePerson;		
	}
	
	//Create a method called getName() that will return the person's name
	public String getName() {
		return name;
	}
	//Create a method called getAge() that will return the person's name
	public int getAge() {
		return age;
	}
	//Create a method called setName() that will return the person's names
	public void setName(String namePerson) {
		 this.name = namePerson;
	}
}
