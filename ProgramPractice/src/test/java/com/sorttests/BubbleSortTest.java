package com.sorttests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sort.BubbleSort;
import com.sort.BubbleSortImpl;

/**
 * TestNG test cases for Bubble Sort algorithm in Java. The class has three
 * methods to test different scenarios.
 *
 * @author Lekha Sikakollu
 *
 */

public class BubbleSortTest {

	private BubbleSort bubbleSort = null;

	@BeforeClass
	public void setUp() {
		bubbleSort = new BubbleSortImpl();
	}

	@Test(priority = 1)
	public void testAverageCase() {
		int[] expected = { 1, 11, 14, 23, 45, 89, 90 };
		int[] input = { 11, 45, 89, 23, 1, 90, 14 };

		int[] result = bubbleSort.sort(input);
		Assert.assertEquals(result, expected);
	}

	@Test(priority = 3)
	public void testWorstCase() {
		int[] expected = { 1, 2, 3, 4, 5 };
		int[] input = { 5, 4, 3, 2, 1 };

		int[] result = bubbleSort.sort(input);
		Assert.assertEquals(result, expected);
	}

	@Test(priority = 2)
	public void testBestCase() {
		int[] expected = { 25, 35, 45, 55, 65, 75 };
		int[] input = { 25, 35, 45, 55, 65, 75 };

		int[] result = bubbleSort.sort(input);
		Assert.assertEquals(result, expected);
	}
}
