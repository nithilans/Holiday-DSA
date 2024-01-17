package L320240112;
//1.	For n = 4, print the below pattern, there are NO spaces between numbers. 
//
//1
//22
//333
//4444

import java.util.Scanner;
public class PatternPrint{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}

