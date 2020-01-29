import java.util.Scanner;

public class TotalNumberOfA // class crated to find how many time letter a is in users sentence
{      // 9 enter any String and count total number of 'a' in that String.

        public static void main(String[] args) // main method
        {
            String str = " "; // declared string variable
            int count =0;
            Scanner scanner=new Scanner(System.in); // method to get users input
            System.out.print( "Enter any sentence :-"); // message fro usr to input sentence
            str=scanner.nextLine(); // store users input
            for (int i = 0; i <str.length() ; ++i) //using for loop
            {
                switch (str.charAt(i)) // switch statement to count letter a in sentence
                {
                    case 'a':
                    case 'A':
                        count++;
                }
            }
            System.out.println( "The total number of 'A' in the string are :"+ count); // message and result to display
        }
}