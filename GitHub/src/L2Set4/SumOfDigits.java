package L2Set4;

// 3 Find the sum of the digits in a number using for loop


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        
        System.out.println("Sum of digits in " + number + " is: " + sum);

        
        scanner.close();
    }
}

