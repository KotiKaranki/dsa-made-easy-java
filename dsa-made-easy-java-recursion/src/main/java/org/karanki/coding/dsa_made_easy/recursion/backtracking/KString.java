package org.karanki.coding.dsa_made_easy.recursion.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class KString {

	private static int[] kString;
	
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int nLength = scan.nextInt();
		int kLength = scan.nextInt();
		kString = new int[nLength];
		
		kString(nLength, kLength);
		
		scan.close();

	}
	
	private static void kString(int n, int k)
	{
		if(n < 1 )
		{
			System.out.println(Arrays.toString(kString));
			return;
		}
		
		for(int j = 0; j < k; j++)
		{
			kString[n-1] = j;
			kString(n-1, k);
		}
	}

}
