package org.karanki.play.dsa_made_easy.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BinarySearchTest {

	BinarySearch testObj;
	
	
	

    @Before
    public void setUp() {
    	testObj = new BinarySearch();
    }

    @Test
    public void testDoBinarySeach1() {
        int[] numbers = new int[] { 1, 2, 3,  12, 15 };        
        int idx =  testObj.doBinarySearch(numbers, 3 );
        assertEquals(2, idx);
    }	

    
    
    @Test
    public void testDoRecursiveBinarySeach1() {
        int[] numbers = new int[] { 1, 2, 3,  12, 15 };        
        int idx =  testObj.doRecursiveBinarySearch(numbers, 3, 0, numbers.length -1);
        assertEquals(2, idx);
    }	
    
    @Test
    public void testDoRecursiveBinarySeach2() {
        int[] numbers = new int[] { 1, 2, 3,  12, 15, 25, 36, 44, 93 };        
        int idx =  testObj.doRecursiveBinarySearch(numbers, 15, 0, numbers.length -1);
        assertEquals(4, idx);
    }
    
    @Test
    public void testDoRecursiveBinarySeach3() {
        int[] numbers = new int[] { 1, 2, 3,  12, 15 };        
        int idx =  testObj.doRecursiveBinarySearch(numbers, 1, 0, numbers.length -1);
        assertEquals(0, idx);
    }
    
    @Test
    public void testDoRecursiveBinarySeach4() {
        int[] numbers = new int[] { 1, 2, 3,  12, 15 };        
        int idx =  testObj.doRecursiveBinarySearch(numbers, 12, 0, numbers.length -1);
        assertEquals(3, idx);
    }
    
    @Test
    public void testDoRecursiveBinarySeach5() {
        int[] numbers = new int[] {0, 1, 2, 3, 4, 12, 15, 12 };        
        int idx =  testObj.doRecursiveBinarySearch(numbers, 5, 0, numbers.length -1);
        assertEquals(-1, idx);
    }
    
    @Test
    public void testDoRecursiveBinarySeach6() {
        int[] numbers = new int[] { 1, 2, 3,  12, 15 };        
        int idx =  testObj.doRecursiveBinarySearch(numbers, 200, 0, numbers.length -1);
        assertEquals(-1, idx);
    }
}
