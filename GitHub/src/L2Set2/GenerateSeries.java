package L2Set2;

//1 Write a program to generate the first 'n' terms of the following series 1, 4, 9, 16, 25,...

import java.util.Scanner;
public class GenerateSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        System.out.println("The series is:");
        for (int i = 1; i <= n; i++) {
            int term = i * i;
            System.out.print(term + " ");
        }

        scanner.close();
    }
}
