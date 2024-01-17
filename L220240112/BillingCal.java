package L220240112;

import java.util.Scanner;

//3.	Write a program that calculates the shipping cost for an e-commerce product based on weight. If the weight is less than or equal to 5 kg, the shipping cost is $10; if the weight is more than 5 kg but less than or equal to 20 kg, the cost is $20; for more than 20 kg, the cost is $50.

public class BillingCal {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Product weight
	        
	        double weight = scanner.nextDouble();

	        // Calculate shipping cost based on weight
	        double shippingCost;

	        if (weight <= 5) {
	            shippingCost = 10.0;
	        } else if (weight <= 20) {
	            shippingCost = 20.0;
	        } else {
	            shippingCost = 50.0;
	        }

	        System.out.println( shippingCost);

	        scanner.close();
	    }
	}

