package L220240111;
import java.util.Scanner;

//3.	Given a number 'N' print the sum of each digit to the power of the number of digits in the given input.
//Hint: Use Math.pow
//Example :
//Input => 1234
//=> ( 1 ^ 4 ) + ( 2 ^ 4 ) + ( 3 ^ 4 ) + ( 4 ^ 4 )
//=> 1 + 16 + 81 + 256
//Output => 354
//N <=100000000000
//Sample Testcase :
//INPUT
//1234
//OUTPUT
//354


public class Multiplication {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        // Input: Number N
	       
	        long N = s.nextLong();

	        
	        int d = 0;
	        long t = N;
	        while (t > 0) {
	            t /= 10;
	            d++;
	        }

	       
	        t = N;

	        long sum = 0;
	        while (t > 0) {
	            int n = (int) (t % 10);
	            sum += Math.pow(n, d);
	            t /= 10;
	        }

	        
	        System.out.println(sum);

	        s.close();
	    }
	}

