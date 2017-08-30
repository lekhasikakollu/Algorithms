package com.treetest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.trees.LeastCommonAncestorImpl;
import com.trees.LeastCommonAncestorImpl.Node;

public class LeastCommonAncestorTest {
	
	private LeastCommonAncestorImpl least = null;

	@BeforeClass
	public void setUp() {
		least = new LeastCommonAncestorImpl(); 
		least.root=new Node(8);
		least.root.left=new Node(6);
		least.root.right=new Node(10);
		least.root.left.left=new Node(3);
		least.root.left.right=new Node(7);
		least.root.left.left.left=new Node(2);
		least.root.left.left.right=new Node(4);
		least.root.left.left.right.right=new Node(5);
		least.root.right.left=new Node(9);
		least.root.right.left=new Node(11);
		
	}
	
  @Test(priority=1)
  public void testCase1() {
	  Assert.assertTrue(null!=least);
	  int ancestor=least.findLeastAncestor(11,2);
	  Assert.assertEquals(8, ancestor);
	  
  }
  @Test
  public void testCase2() {
	  
	  int ancestor=least.findLeastAncestor(2,5);
	  Assert.assertEquals(3, ancestor);
	  
  }
  @Test
  public void testCase3() {
	  
	  int ancestor=least.findLeastAncestor(2,5);
	  Assert.assertEquals(3, ancestor);
	  
  }
}
