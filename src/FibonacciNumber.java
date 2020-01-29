import java.util.Scanner;

public class FibonacciNumber // class created to Print the sequence Fibonacci number
{      //8 Print the sequence 1 1 2 3 5 8 13 21 Fibonacci number

        public static void main(String[] args) // main method
        {
            int n, first = 0,next = 1;
            Scanner scanner = new Scanner(System.in); // method to get user's input
            System.out.println("Enter how may fibonnaci numbers to print"); // message to display for user
            n = scanner.nextInt(); // store user's input
            System.out.print("The first " + n + " Fibonacci numbers are: ");
            System.out.print(first + " " + next);
            int i = 1;
            while (i<n-1)
            {
                int sum = first + next;
                first = next;
                next = sum;
                System.out.print(" " + sum); // result to display
                i++;
            }
        }
    }



