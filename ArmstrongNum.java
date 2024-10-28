// WAP to check whether given number is armstrong or not.
import java.util.*;

public class ArmstrongNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int  originalNumber, remainder, result = 0;

        originalNumber = num;

        // Check if the number is an Armstrong number
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Raise the digit to the power of the number of digits
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");


    }

}

/*
    OUTPUT:
        Enter a number: 153
        153 is an Armstrong number.
 */