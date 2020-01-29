import java.util.Scanner;

public class MultiplicationTable // class created to do multiplication table
{   //7 multiplication table till n using do while loop (value of n will come through scanner class)
    public static void main(String[] args)  //main method
    {
        Scanner scanner = new Scanner( System.in );  // method to get user's input
        System.out.print( "Enter the number for timetable want :- " ); // message for user to input
        int a = scanner.nextInt(); // store users input
        System.out.print( "Enter the ending number for timetable :- " ); // message for user to input
        int b = scanner.nextInt(); // store user's input
        int i = 1;
        do   // do while method
        {
            System.out.println( +a + " x " + i + " = " + a * i );  // result for chosen digit's time table
            i++;
        }
        while (i <= b);
    }
}
