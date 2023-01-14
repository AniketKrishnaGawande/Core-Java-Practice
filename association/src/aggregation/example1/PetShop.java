package aggregation.example1;

public class PetShop {

	public static void main(String[] args) {
		Person p1 = new Person("Aniket"); // registering person came for enquiry
		p1.buyPet("Dog"); // customer buying pet
		System.out.println(p1); // print details
		
		
		Person p2 = new Person("Anu"); // person can exist individually
		System.out.println(p2);

		Animal animal = new Animal("Cat");  // Animal can exist individually
		System.out.println(animal);
		
	}

}
