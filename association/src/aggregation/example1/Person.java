package aggregation.example1;

public class Person {
	private String name; // person name
	private Animal pet; // referance created as person has pet animal

	public Person(String name) // ctor to accept person name
	{
		this.name = name;
	}

	public void buyPet(String nameofPet) // method to buy pet
	{
		pet = new Animal(nameofPet);
	}

	public String toString() {
		String petname = pet == null ? "no pet brought" : pet.toString();
		return "Person :: " + name + " pet :: " + petname;
	}

}
