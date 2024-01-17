package L320240112;


//2.	Write a program to print the multiplication table for numbers from 1 to 'n'. Each table should go from 1 to 'm'. (For example, if 'n' is 3 and 'm' is 4, print the tables for 1, 2, and 3, each up to 4 times.)

//Sample Input
//n: 3
//M: 4
//
//Output:
//
//Multiplication table of 1
//1x1 = 1
//1x2 = 2
//1x3 = 3
//1x4 = 4
//
//Multiplication table of 2
//
//2x1 = 2
//2x2 = 4
//2x3 = 6
//2x4 = 8
//
//Multiplication table of 3
//3x1 = 3
//3x2 = 6
//3x3 = 9
//3x4 = 12
import java.util.Scanner;
public class NumMultiplication {




	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Value of n
	       
	        int n = scanner.nextInt();

	        // Value of m
	       
	        int m = scanner.nextInt();

	        // Print multiplication tables
	        for (int i = 1; i <= n; i++) {
	            System.out.println("\nMultiplication table of " + i);
	            for (int j = 1; j <= m; j++) {
	                System.out.println(i + "x" + j + " = " + (i * j));
	            }
	        }

	        scanner.close();
	    }
	}

