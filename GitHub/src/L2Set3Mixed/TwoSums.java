package L2Set3Mixed;


//1.)Find the given number is odd or even without using % operator
//Hint: Use Bitwise Operator(&)

//2.)Write a program that prints each number from 1 to 100 on a new line. 
//For each multiple of 3, print "Fizz" instead of the number. 
//For each multiple of 5, print "Buzz" instead of the number. 
//For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
//Input:
//15
//
//
//Output:
//1
//2
//Fizz
//4
//Buzz
//Fizz
//7
//8
//9
//Buzz
//11
//Fizz
//13
//14
//FizzBuzz


class TwoSums {
    public static void main(String[] args) {
       fizzBuzz(10);
       
       
       
       
       
       
         int number = 7; // You can replace this with any integer

        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    public static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
