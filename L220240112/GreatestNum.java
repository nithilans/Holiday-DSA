package L220240112;
//1.	Given three numbers A, B, and C, write a program to print the largest amongst these three numbers.
import java.util.Scanner;

public class GreatestNum {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Numbers A, B, and C
	      
	        int A = scanner.nextInt();
	      
	        int B = scanner.nextInt();
	    
	        int C = scanner.nextInt();

	        // Find the largest number among A, B, and C
	        int largest = A;

	        if (B > largest) {
	            largest = B;
	        }

	        if (C > largest) {
	            largest = C;
	        }


	        System.out.println( largest);

	        scanner.close();
	    }
	}

