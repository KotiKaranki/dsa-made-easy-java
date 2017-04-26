package org.karanki.play.dsa_made_easy.search;

public class BinarySearch {

	
	/**
	 * Returns index of found number, -1 if nothing found
	 * @param a is array of integer primitive.
	 * 
	 * @return index of the found element, -1 if no match found. 
	 */
	public int doBinarySearch(int []a, int element) {
		
		
		int low = 0; int high = a.length - 1; 
		int mid;
		
		while(low <= high) {
			
			mid =  (high + low) / 2;
			
			if(a[mid] == element) {				
				return mid;
			}
			
			else if(a[mid] < element) {				
				mid++;
			}
			else {
				mid--;
			}			
		}

		return -1;
	}
	
	
	public int doRecursiveBinarySearch(int []a, int element, int low, int high) {
		
		if(low > high) {
			return -1;
		}
		
		int mid = (high + low) / 2;
						
		if(a[mid] == element) {
			return mid;
		}
		else if(a[mid] < element) {
			return doRecursiveBinarySearch(a, element, mid+1, high);
		}
		else {			
			return doRecursiveBinarySearch(a, element, low, mid - 1);
		}
						
	}
	
}
