package org.karanki.play.dsa_made_easy.sort.selection;

import java.util.Arrays;

public class Application2 {
		
	
	
	public static void main(String[] args) {
		
		
		int a[] = {1, 10, 5, 2, 20, 3};
		System.out.println("Before Sort :" +  Arrays.toString(a));
		selectSort(a);
		System.out.println("After Sort :" +  Arrays.toString(a));

	}
	
	
	public static int[] selectSort(int a[] ) {
		
		
		int tmp, min;
		
		
		for(int i = 0; i < (a.length - 1); i++ ) {
			
			min = i;
			
			for(int j = i; j < a.length; j++) {
				
				if(a[j] < a[min]) {
					min = j;
				}
					
			}
			
			if(min !=  i) {
				tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
		
						
		return a;
	}

}
