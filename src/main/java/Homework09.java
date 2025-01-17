/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab, JaredTobias
 */
public class Homework09 {

    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

    Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28
    We can see that 28 is the first triangle number to have over five divisors.

    What is the value of the first triangle number to have over one hundred divisors?

    The first triangle number to have over 100 divisors is 73920.
    73920 has 112 divisors in total.
    */

    public static void main(String[] args) {
        int numDivisors = 100; //
        int result = triangleDivisors(numDivisors);
        System.out.println(result);
    }

    // finding triangle numbers using formula n*(n+1) / 2
    public static int triangleNum(int n) {
        return n * (n + 1) / 2;
    }

    // method to calculate number of divisors of num
    public static int divisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }

    // method to find number of divisors of specified triangle number
    public static int triangleDivisors(int numDivisors) {
        int n = 1;
        int triangleNumber;
        while (true) {
            triangleNumber = triangleNum(n);
            int divisors = divisors(triangleNumber);
            if (divisors > numDivisors)
                break;
            n++;
        }
        return triangleNumber;

    }
}
