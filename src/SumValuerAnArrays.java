import java.util.Scanner;

public class SumValuerAnArrays // class created to sum value of an array
{   // 2	Write a Java program to sum values of an array.
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in); // method to get users input
        int[] array = new int[2]; // declared type of data and length for integer value
        int sum = 0; // variable new declared
        System.out.println("Enter the value of Array: "); // message to user asking for input
        for (int i=0; i<2; i++) // for loop functionality
        {
            array[i] = scanner.nextInt();
        }
        for( int num : array)
        {
            sum = sum+num; // sum for array
        }
        System.out.println("Sum value of an Array is: "+sum); // message and result to display
    }
}
