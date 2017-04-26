package org.karanki.play.dsa_made_easy.sort.selection;

public class SelectionSort {

	
	public int[] selectionSort(int a[]) {		
		
		for(int i = 0; i < a.length - 1; i++) {
			
			int min = i;
			for(int j = i; j < a.length; j++) {				
				if(a[min] > a[j]) {
					min = j;
				}
			}
						
			if(min != i) {				
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
		
		return a;
		
	}
	
}
