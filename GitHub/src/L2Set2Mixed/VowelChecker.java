package L2Set2Mixed;

import java.util.Scanner;
//3 Check whether the given character is a vowel or not
//Note: Given Character is in lowercase


public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }

        scanner.close();
    }
}

