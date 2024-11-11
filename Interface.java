package JavaProgram;

// Define the interface Person
interface Person 
{
	void speak(); // Method declaration
}

// Class Student implementing the Person interface
class Student implements Person 
{
	// Implementing the speak method for Student
	public void speak() 
	{
		System.out.println("My name is kaivalya");
	}
}

// Class Teacher implementing the Person interface
class Teacher implements Person 
{
	// Implementing the speak method for Teacher
	public void speak() 
	{
		System.out.println("My teacher name is Rajashri");
	}
}

// Main class to test the implementation
public class Interface
{
	public static void main(String[] args)
	{
		// Creating objects of Student and Teacher
		Person student = new Student();
		Person teacher = new Teacher();

		// Calling their respective speak methods
		student.speak(); // Output: I am a student and I love to learn!
		teacher.speak(); // Output: I am a teacher and I love to teach!
	}
}

// Output = My name is kaivalya
//My teacher name is Rajashri
