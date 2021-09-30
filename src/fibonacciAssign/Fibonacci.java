
package fibonacciAssign;

import java.util.Scanner;

/**
 * This class tests performance of the fibonacci sequence implemented
 * in a recursive and iterative way.
 * @author Chris Hall
 * 
 *
 */

public class Fibonacci {
	
	/**
	 * This is the main method.
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		long answer;
		long time;		
		long speed;
		long number;
		
		System.out.println("Enter a number: ");
		number = scnr.nextLong();
		
				
		time = System.nanoTime();
		answer = RecFibonacci(number);
		speed = System.nanoTime() - time;
		
		System.out.println("Recursion fibonacci found the answer " + answer + " in: " + speed + "ns");
		
				
		
		time = System.nanoTime();
		answer = DynFibonacci(number);
		speed = System.nanoTime() - time;
		
		System.out.println("Iterative fibonacci found the answer " + answer + " in: " + speed + "ns");
		
		
		
		

	}
	
	/**
	 * Returns recursive fibonacci calculation.
	 * @param n Number passed in by the user
	 * @return Long number
	 */
	
	public static long RecFibonacci (long n) {
		
		if (n <= 1)
		       return n;
		    return RecFibonacci(n-1) + RecFibonacci(n-2);		
		
		
	}
	
	/**
	 * Returns iterative fibonacci calculation.
	 * @param n Number passed in by the user
	 * @return Long number
	 */
	
	public static long DynFibonacci (long n) {
		
		int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
		
	}

}
