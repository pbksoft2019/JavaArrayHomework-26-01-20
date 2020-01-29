import java.util.Scanner;

public class OddEvenDigitSum // class created to find sum of odd and even number
{   //4 input any five digit number then count total no of odd and even digit and find sum of them
    public static void main(String[] args) //main method
    {
        int n, sumE = 0, sumO = 0;
        Scanner scanner =new Scanner(System.in);  // method to get users input
        System.out.print("Enter the number for total digit (array): ");   // message to display for user to input
        n = scanner.nextInt();  // store user input value
        int []a = new int[n];   // integer array object
        System.out.println("Enter the number(s): ");   // message to display for user to input
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)  // for loop to short array
        {
            if (a[i] % 2 == 0) // if statement
            {
                sumE = sumE + a[i]; // sum of even number
            } else
            {
                sumO = sumO + a[i]; //sum of odd number
            }
        }
        System.out.println("Sum of Even Numbers:" + sumE); // result and message to display total of even numbers
        System.out.println("Sum of Odd Numbers:" + sumO);  // result and message to display total of odd numbers
    }
}
