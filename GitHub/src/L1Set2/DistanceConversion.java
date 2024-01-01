package L1Set2;

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double kilometers = scanner.nextDouble();

        double meters = kilometers * 1000;
        double centimeters = kilometers * 100000;

   
        System.out.println((int) meters); 
        System.out.println((int) centimeters); 
        scanner.close();
    }
}

