package L1Set2;
//1 The area of an equilateral triangle is ¼(√3a2) where "a" represents a side of the triangle. You are provided with the side "a". Find the area of the equilateral triangle.
//
//Input Description:
//The side of an equilateral triangle is provided as the input.
//
//Output Description:
//Find the area of the equilateral triangle and print the answer up to 2 decimal places after rounding off.
//
//Sample Input :
//20
//Sample Output :
//173.21


import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double area = 0.25 * Math.sqrt(3) * Math.pow(a, 2);
        System.out.printf("%.2f\n", area);

        
        scanner.close();
    }
}
