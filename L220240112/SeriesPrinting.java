package L220240112;
//2.	Write a program to generate the first 'n' terms of the series 0, 2, 8, 14, 24, 34,....
import java.util.Scanner;

public class SeriesPrinting {
	
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Number of terms 'n'
	        System.out.print("Enter the number of terms (n): ");
	        int n = scanner.nextInt();

	        // Generate and print the series
	        System.out.println("Series:");

	        for (int i = 1; i <= n; i++) {
	            int term = i * i - i;
	            System.out.print(term);

	            // Add a comma and space for all terms except the last one
	            if (i < n) {
	                System.out.print(", ");
	            }
	        }

	        scanner.close();
	    }
	}

