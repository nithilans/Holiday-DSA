package L2Set2Mixed;
//2 Write a program to generate the first 'n' terms of the following series 31, 29, 24, 22, 17, …
import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int term = 31;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term -= (i % 2 == 0) ? 5 : 2;
        }

        scanner.close();
    }
}

