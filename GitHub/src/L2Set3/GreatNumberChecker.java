package L2Set3;

//2  You are given a  2 digit positive number ‘n’. You have to tell whether a number is great or not. A great number is a number whose sum of digits let (m) and product of digits let(j) when summed together gives the number back
//
//m+j=n
//
//Input Description:
//You are given a number n;
//Output Description:
//Print Great if a number is great else print the no
//Sample Input :
//59
//Sample Output :
//Great

import java.util.Scanner;

public class GreatNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();

        int tensDigit = n / 10;
        int onesDigit = n % 10;

        if ((tensDigit + onesDigit) * (tensDigit * onesDigit) == n) {
            System.out.println("Great");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

