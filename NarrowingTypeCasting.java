public class NarrowingTypeCasting {

    public static void main(String[] args) {
        // Example of narrowing type casting

        // Converting Larger data type (double) to int
        double largeValue = 12345.6789;
        int smallerValue = (int) largeValue;

        // Display the original and casted values
        System.out.println("Original value (double): " + largeValue);
        System.out.println("Value after narrowing to int: " + smallerValue);

        // Narrowing float to int or converting float to int
        float floatValue = 123.456f;
        int narrowedInt = (int) floatValue;

        // Display the original and casted values
        System.out.println("Original float value: " + floatValue);
        System.out.println("Narrowed to int: " + narrowedInt);

    }
}

/*
    OUTPUT:
    Original value (double): 12345.6789
    Value after narrowing to int: 12345
    Original float value: 123.456
    Narrowed to int: 123
 */
