package L320240111;
import java.util.Scanner;

//2.Create a program to simulate the increase in average seasonal temperatures over years due to climate change. Each year, the temperature of each season (Spring, Summer, Autumn, Winter) increases based on a growing annual factor.
//Increase Factors: Base annual increase is 0.02°C, with an additional 0.002°C added each subsequent year.
//
//Sample Input: 
//No. of years: 5
//1st Year Temperatures in Degree C
//Spring: 15
//Summer: 25
//Autumn: 18
//Winter: 5
//
//Sample Output: Year 5 Temperatures - Spring: 15.51°C, Summer: 25.85°C, Autumn: 18.61°C, Winter: 5.26°C.
//
//Explanation: Spring's Year 2 temperature is 15°C + (15°C * 2%) = 15.3°C; Year 3 is 15.3°C + (15.3°C * 2.2%), and so on.


public class CalculateSeason {

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        //  Number of years
	        int n = s.nextInt();
	        System.out.print("a: ");
	        double a = s.nextDouble();
	        System.out.print("b: ");
	        double b = s.nextDouble();
	        System.out.print("c: ");
	        double c = s.nextDouble();
	        System.out.print("d: ");
	        double d = s.nextDouble();

	        // Constants for temperature increase factors
	        final double x = 0.02;
	        double i = x;

	        for (int j = 2; j <= n; j++) {
	            a += a * i;
	            b += b * i;
	            c += c * i;
	            d += d * i;

	            // Increase the annual factor for the next year
	            i += 0.002;
	        }

	       
	        System.out.printf(" a: %.2f°C, b: %.2f°C, c: %.2f°C, d: %.2f°C.%n", n, a, b, c, d);

	        s.close();
	    }
	}
