import java.util.Scanner;

public class TotalNoOfWordsAndSpace //class created to fond No. of words and space in users sentence
{   // 10 enter any String and count how many total number of words and total number of spaces in that sentence
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner( System.in ); // method for getting users input
        System.out.println( "Please Enter your sentence" ); // message for user to input sentence
        String str = scanner.nextLine(); // store users input
        int word = 1;
        for (int i = 0; i < str.length(); i++)   // using for loop
        {
            if (str.charAt( i ) == ' ')
                word++;
        }
        System.out.println( "Number of words:" + word );    // printing message and result for number of words
        System.out.println( "Number of space:" + (word - 1) ); // printing message and result for number of space
    }
}