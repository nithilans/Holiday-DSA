package L220240111;

import java.util.Scanner;

//2.	Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.

//Sample Testcase :
//INPUT
//3
//2 6
//OUTPUT
//Yes


public class GreatOrNot {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Number N
	        System.out.print("Enter the number N: ");
	        int N = scanner.nextInt();

	        // Input: Range L and R
	        System.out.print("Enter the range (L R): ");
	        int L = scanner.nextInt();
	        int R = scanner.nextInt();

	        // Check if N is between L and R (inclusive)
	        String result;
	        if (N >= L && N <= R) {
	            result = "Yes";
	        } else {
	            result = "No";
	        }
	        System.out.println(result);

	        scanner.close();
	    }
	}

	

