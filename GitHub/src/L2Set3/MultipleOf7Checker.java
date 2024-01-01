package L2Set3;

//3 Given a number N, print yes if the number is a multiple of 7 else print no.
//Sample Input
//49
//Sample Output
//Yes

import java.util.Scanner;

public class MultipleOf7Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();

        if (N % 7 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

      
        scanner.close();
    }
}

