import java.util.Scanner;

public class CheckForSpecificValue // class created to check specific value
{       // 3 program to test if an array contains a specific value
        public static void main(String[] args) // main method
        {
            int[] array1 = {5}; // declared array
            Scanner sc = new Scanner( System.in ); // method to get users input
            System.out.println( "Enter a value" ); //message to display for user
            int num = sc.nextInt(); // store users input
            for (int x = 0; x < array1.length; x++) // using for loop
            {
                if (array1[x] == num)  // if statement
                {
                    System.out.println( "Value exists in array!" ); // result if condition match with if statement
                } else {
                    System.out.println( "Value doesn't exists in array!" ); // result if condition dont match with if
                }
            }
        }
}
