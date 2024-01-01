package L2Set3;

//1 Let "A" be a year, write a program to check whether this year is a leap year or not.
//Print "Y" if it's a leap year and "N" if it's a common year.
//Input Description:
//A Year is the input in the form of a positive integer.
//Output Description:
//Print "Y" if it's a leap year and "N" if its a common year.
//Sample Input :
//2020
//Sample Output :
//Y

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int year = scanner.nextInt();

       
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

       
        scanner.close();
    }
}

