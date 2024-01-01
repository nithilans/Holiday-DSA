package L2Set2;
//3 You are provided with a number, "N". Find its factorial.

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number 'N': ");
        int N = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + N + " is: " + factorial);

        scanner.close();
    }
}


