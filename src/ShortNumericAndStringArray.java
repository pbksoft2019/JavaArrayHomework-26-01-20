import java.util.Arrays;

public class ShortNumericAndStringArray // class created for short array
{   // 1	Write a Java program to sort a numeric array and a String array.
    public static void main(String[] args)
    {
        int[] array1 = {2, 5, 1, 8, 9, 6, 7, 3}; // declared numeric array
        String[] array2= {"mahesh", "naresh","ramesh", "suresh", "raj"}; // declared string array
        System.out.println("Original Numeric Value: " + Arrays.toString(array1)); // print original array
        Arrays.sort(array1); // inbuilt method to short array
        System.out.println("Sorted Numeric value: "+Arrays.toString(array1)); //result for shorted array
        System.out.println("Original String Value: "+ Arrays.toString(array2)); // print original array
        Arrays.sort(array2); // inbuilt method to short array
        System.out.println("Shorted String Value: " + Arrays.toString(array2)); //result for shorted array
    }
}