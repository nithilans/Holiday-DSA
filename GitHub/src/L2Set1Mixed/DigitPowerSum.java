package L2Set1Mixed;

//1 Given a number 'N' print the sum of each digit to the power of the number of digits in the given input.
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


import java.util.Scanner;

public class DigitPowerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long inputNumber = scanner.nextLong();
        
        long outputResult = digitPowerSum(inputNumber);
        System.out.println("Output: " + outputResult);
    }

    static long digitPowerSum(long n) {
      
        int numDigits = (int) Math.log10(n) + 1;

       
        long result = 0;
        long temp = n;

        while (temp > 0) {
            long digit = temp % 10;
            result += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return result;
    }
}
