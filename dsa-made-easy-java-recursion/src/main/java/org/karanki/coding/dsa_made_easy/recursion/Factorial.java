package org.karanki.coding.dsa_made_easy.recursion;

import java.util.Scanner;

/**
 * Factorial class which generates factorial for a given string in a recursive manner.
 * 
 * @author Koteswara R. Karanki
 * @since Jun 2016.
 *
 */
public class Factorial {

	public static void main(String[] args) {
		

		go();
		

	}
	
	private static void go()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(fact(n));
		
		scan.close();
	}
	
	
	private static int fact(int n)
	{
		if(n == 1)
			return 1;
		
		return n * fact(n - 1);
	}

}
