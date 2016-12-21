package org.karanki.coding.dsa_made_easy.recursion.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateBinary {

	private static int[] binary;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int binaryLength = scan.nextInt();
		binary = new int[binaryLength];
		
		binary(binaryLength);
		

	}
	
	private static void binary(int n)
	{
		if(n < 1)
		{
			//System.out.println(new String(binary));
			System.out.println(Arrays.toString(binary));
			return;
		}
				
		binary[n - 1] = 0;
		
		binary(n - 1);
		
		binary[n - 1] = 1;
		
		binary(n - 1);
		
			
	}

}
