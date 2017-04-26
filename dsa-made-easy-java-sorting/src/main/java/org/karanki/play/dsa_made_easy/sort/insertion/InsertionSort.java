package org.karanki.play.dsa_made_easy.sort.insertion;

public class InsertionSort {

	public int[]  insertionSort(int a[]) {
				
		for(int i = 1; i < a.length;  i++) {
			
			for (int j = i; j > 0; j--) {				
				if(a[j] < a[j-1]) {					
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
				else {					
					break;
				}
			}						
		}
		return a;
	}
	
}
