package L320240111;
import java.util.Scanner;

//1.	For n a positive integer, print the numeric square pattern 
//
//Sample Input:
//4
//Sample Output:
//1 1 1 1
//2        2
//3        3
//4 4 4 4


public class PatternPrinting {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input for the size of the pattern
	        int n = scanner.nextInt();

	        // Printing the numeric square pattern
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                // If it's the first or last row, or the first or last column, print the current row number
	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print(i + " ");
	                } else {
	                    // Otherwise, print spaces
	                    System.out.print("  ");
	                }
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }

	        scanner.close();
	    }
}
	


