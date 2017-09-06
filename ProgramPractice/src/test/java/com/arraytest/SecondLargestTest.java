package com.arraytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.arrays.SecondLargest;


public class SecondLargestTest {
  
	@Test
  public void testSecondLargest() {
		int[] array={17,2,78,45,100,50};
		int secondLargest=SecondLargest.getSecondLargest(array);
		Assert.assertEquals(78, secondLargest);
		
  }
	
	@Test
	  public void testSecondLargest2() {
			int[] array={1};
			int secondLargest=SecondLargest.getSecondLargest(array);
			Assert.assertEquals(-1, secondLargest);
			
	  }
	@Test
	  public void testSecondLargest3() {
			int[] array={12,17,30,45,30};
			int secondLargest=SecondLargest.getSecondLargest(array);
			Assert.assertEquals(30, secondLargest);
			
	  }
}
