import java.util.Scanner;

public class CheckForArmstrongNumber // class created to check if given number is armstrong or not
{   // 6 Input any 3 digit number and check if it is Armstrong number or not
    public static void main(String[] args) // main method
    {
        int num1, num3, total = 0; // variable declared
        Scanner scanner = new Scanner(System.in); // method to get user's input
        System.out.println("Enter any 3 digit number: "); //message for user
        num1=scanner.nextInt(); // store users input
        scanner.close();
        int num2 = num1;

        for (; num2!=0; num2/=10) // for loop statement
        {
            num3 = num2 % 10;
            total = total + num3*num3*num3;
        }
        if (total == num1) // if condition
        {
            System.out.println(num1 + " : is an Armstrong Number"); // result if condition match with if statement
        }
        else
        {
            System.out.println(num1 + " : is not an Armstrong number"); // result for not match with if statement
        }
    }
}
