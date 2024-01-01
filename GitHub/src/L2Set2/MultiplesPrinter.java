package L2Set2;

//2 Print the First 3 multiples of the given number "N".

import java.util.Scanner;

public class MultiplesPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number 'N': ");
        int N = scanner.nextInt();

        System.out.println("The first 3 multiples of " + N + " are:");
        for (int i = 1; i <= 3; i++) {
            int multiple = N * i;
            System.out.println(multiple);
        }

        scanner.close();
    }
}

