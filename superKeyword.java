package address;
  


// superkeyword
/*
 * The super keyword is an essential tool in Java for managing inheritance. It:

1)Invokes parent class constructors, which initializes inherited fields.
2)Accesses parent class methods, even if they are overridden in the child class.
3)Accesses parent class fields directly, even if they are hidden by child class fields.

*/

//Defining the parent class
class Animal {
	String name;

	// Parent class constructor
	Animal(String name) {
		this.name = name; // Initialize the instance variable with the provided name
		System.out.println("Animal constructor called. Name: " + name);
	}
}

//Defining the child class
class Dog extends Animal {
	String breed;

	// Child class constructor
	Dog(String name, String breed) {
		super(name); // Call the parent class (Animal) constructor using 'super' keyword
		this.breed = breed; // Initialize the breed variable specific to Dog class
		System.out.println("Dog constructor called. Breed: " + breed);
	}

	// Method to display dog's information
	void display() {
		System.out.println("Name: " + name + ", Breed: " + breed);
	}
}

//Main class to execute the program
public class superKeyword {
	public static void main(String[] args) {
		// Creating a Dog object, which will invoke both Animal and Dog constructors
		Dog dog = new Dog("Buddy", "Golden Retriever");

		// Displaying dog's information
		dog.display();
	}
}

/* Output::
 * Animal constructor called. Name: Buddy
Dog constructor called. Breed: Golden Retriever
Name: Buddy, Breed: Golden Retriever
*/
