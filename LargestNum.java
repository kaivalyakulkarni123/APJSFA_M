//WAP to check largest of three given numbers.
public class LargestNum {
    public static void main(String[] args) {

        int a = 54;
        int b = 56;
        int c = 203;

        //Check the largest number using if else
        if( a>b && a>c){
            System.out.println(a + " is largest among three...");
        }
        else if( b>a && b>c){
            System.out.println(b + " is largest among three...");
        }
        else {
            System.out.println(c + " is largest among three...");
        }
    }
}
/*
    OUTPUT:
    203 is largest among three...
 */