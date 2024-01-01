package L2Set1Mixed;


//2 Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.
//
//Sample Testcase :
//INPUT
//3
//2 6
//OUTPUT
//Yes

import java.util.Scanner;

public class CheckRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();

       
        String result;
        if (N >= L && N <= R) {
            result = "Yes";
        } else {
            result = "No";
        }

      
        System.out.println("Output: " + result);

   
        scanner.close();
    }
}
