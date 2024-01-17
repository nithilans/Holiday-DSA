package L320240112;

//3.	Create a program to simulate the increase in average seasonal temperatures over years due to climate change. Each year, the temperature of each season (Spring, Summer, Autumn, Winter) increases based on a growing annual factor.
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


import java.util.Scanner;
public class SeasonCalculate {

	

	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        // Number of years
	        int y = s.nextInt();

	        // Input: Initial temperatures for Spring, Summer, Autumn, and Winter

	        double sp = s.nextDouble();

	        double su = s.nextDouble();

	        double a = s.nextDouble();

	        double w = s.nextDouble();

	        // Constants for temperature increase factors
	        final double b = 0.02;
	        double f = b;

	        // Simulate temperature increase over the years
	        for (int i = 1; i <= y; i++) {
	            sp += sp * f;
	            su += su * f;
	            a += a * f;
	            w += w * f;

	            // Increase the annual factor for the next year
	            f += 0.002;
	        }

	        //Print the simulated temperatures for the last year
	        System.out.printf(" - Spring: %.2f°C, Summer: %.2f°C, Autumn: %.2f°C, Winter: %.2f°C.%n",
	                y, sp, su, a, w);

	        s.close();
	    }
	}

