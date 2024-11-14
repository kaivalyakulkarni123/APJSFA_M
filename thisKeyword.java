package address;

// this keyword 
/*
 * Functions of the this Keyword
1)To Refer to the Current Class Instance Variables
2)To Call the Current Class Constructor
3)To Call the Current Class Method
4)To Pass the Current Class Instance as an Argument
5)To Return the Current Class Instance
*/
class Student {
	String name;
	int age;

	// Constructor that takes name and age as parameters
	Student(String name, int age) {
		this.name = name; // Assigning the parameter name to the instance variable name
		this.age = age; // Assigning the parameter age to the instance variable age
	}

	// Constructor that takes another Student object as a parameter
	Student(Student student) {
		// Using 'this' keyword to call the primary constructor with student name and
		// age
		this(student.name, student.age);
	}

	// Method to display student information
	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class thisKeyword {
	public static void main(String[] args) {
		// Creating a Student object using the first constructor
		Student student1 = new Student("Kaivalya", 24);

		// Creating another Student object using the second constructor, passing
		// 'student1' object
		Student student2 = new Student(student1);

		// Displaying both student objects
		student1.display();
		student2.display();
	}
}

/*
 *
 * Name: Kaivalya, Age: 24
 *  Name: Kaivalya, Age: 24
 */
