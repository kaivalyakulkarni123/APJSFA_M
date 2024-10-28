// WAP to reverse a three digit number
public class ReverseNumber {
    public static void main(String[] args) {

        int a = 132;
        // code for reversing a 3 digit number
        if (a >= 100 && a <=999){

            int hundreds= a / 100;
            int tens = (a/10) % 10;
            int unit = a % 10;
            int reversedNumber = (unit * 100) + (tens * 10) + hundreds;
            System.out.println("Reverse of 132 is: " +reversedNumber);
        }
        else {
            System.out.println("Please enter valid 3 digit number:");
        }
    }
}

/*
    OUTPUT:
    Reverse of 132 is: 231
 */