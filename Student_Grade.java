package Core_Java;

public class Student_Grade {
    public static void main(String args[]){
        int marks = 95;
        if (marks > 90) {
            System.out.println("The student's grade is: A");
        }
        else if(marks > 80){
            System.out.println("The student's grade is: B");
        }
        else if (marks > 70){
            System.out.println("The student's grade is: C");
        }
        else if (marks > 60){
            System.out.println("The student's grade is: D");
        }
        else {
            System.out.println("The student's grade is: Failed...");
        }
    }
}
