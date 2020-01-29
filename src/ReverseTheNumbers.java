import java.util.Scanner;

public class ReverseTheNumbers // class created to reverse users input
{       //5 input any five digit number and then reverse the number
        public static void main(String[] args) // main method
        {
            int reversenum = 0;
            System.out.println("Input your number and press enter: "); //message for asking user input
            Scanner in = new Scanner(System.in); // method to get user's input
            int num = in.nextInt(); // store user input
            while (num != 0) //while loop logic to reverse numbers
            {
                reversenum = reversenum * 10;
                reversenum = reversenum + num % 10;
                num = num / 10;
            }
            System.out.println("Reverse of the number input is: " + reversenum); // message and result to display
        }
}




