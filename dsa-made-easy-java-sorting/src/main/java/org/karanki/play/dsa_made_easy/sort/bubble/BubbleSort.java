package org.karanki.play.dsa_made_easy.sort.bubble;

public class BubbleSort {

	
	public int[] bubbleSort(int []a) {
		
		int tmp;
		boolean swapped = true;
		
		for(int i = a.length-1; i >= 0 && swapped; i--) {
		
			swapped = false;
			
			for(int j = 0;  j < i ; j++) {
				
				if(a[j] > a[j+1]) {					
					tmp = a[j];
					a[j] = a [j+1];
					a[j+1] = tmp;
					
					swapped = true;
				}
			}
		}
		
		
		return a;
	}

}
