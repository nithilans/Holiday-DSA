package L2Set4;


// 1 Write a program to generate the first 'n' terms of the following series 121, 225, 361,...


import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        generateSeries(n);
    }

    public static void generateSeries(int n) {
        int term = 11;

        System.out.print("Generated Series: ");
        for (int i = 0; i < n; i++) {
            int square = term * term;
            System.out.print(square + " ");

          
            term += 4;
        }
    }
}
