package org.karanki.play.dsa_made_easy.sort.selection;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		int a[] = {1, 10, 5, 2, 20, 3};
		System.out.println("Before Sort :" +  Arrays.toString(a));
		selectionSort(a);
		System.out.println("After Sort :" +  Arrays.toString(a));
	}

	public static int[] selectionSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			int iMin = i;

			for (int j = i; j < a.length; j++) {
				
				if(a[j] < a[iMin]) {
					iMin = j;
				}
			}
			
			int tmp = a[i];
			a[i] = a[iMin];
			a[iMin] = tmp;
		}

 		return a;
	}

}
