package org.karanki.play.dsa_made_easy.sort.insertion;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

	
    private InsertionSort testClass;

    @Before
    public void setUp() {
        testClass = new InsertionSort();
    }
    
    @Test
    public void bubbleSortEx1TestSuccess() {
        int[] numbers = new int[] { 1, 7, 99, 2, 0, 12, 15 };
        testClass.insertionSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 7, 12, 15, 99 }, numbers);
    }

    @Test
    public void bubbleSortEx2TestSuccess() {
        int[] numbers = new int[] { 8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5 };
        testClass.insertionSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }, numbers);
    }

    @Test
    public void bubbleSortEx3TestSuccess() {
        int[] numbers = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        testClass.insertionSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, numbers);
    }
    
    @Test
    public void bubbleSortEx4TestSuccess() {
        int[] numbers = new int[] { 1, 7, 99, 2, 0, 12, 15, 3 };
        testClass.insertionSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 7, 12, 15, 99 }, numbers);
    }
}
