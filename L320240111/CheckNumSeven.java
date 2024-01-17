package L320240111;
import java.util.Scanner;

//3.Veena was provided with a number she has to define whether the number is lucky or not. If the number contains 7 it is defined as lucky .
//
//     Input: Integer number n.
//
//Output: Print 1 if lucky else it will print 0.
//
//Input:-
//777
//
//Output:-
//1


public class CheckNumSeven {

	

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        // Input: Integer number n
	        System.out.print("Enter an integer number: ");
	        int n = s.nextInt();

	        // Check if the number is lucky (contains the digit 7)
	        int r;
	        if (n % 10 == 7) {
	            r = 1;
	        } else {
	            r = 0;
	        }

	        // Output: Print 1 if lucky, else print 0
	        System.out.println(r);

	        s.close();
	    }
	}

 
