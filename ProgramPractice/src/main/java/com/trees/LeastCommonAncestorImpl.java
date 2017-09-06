package com.trees;

/**
 * @author slekh
 */
import java.util.ArrayList;


public class LeastCommonAncestorImpl {
	 public Node root;
	 
	 /**
	  * 
	  * @author slekh
	  *
	  */
	public static class Node{
		int data;
		public Node left;
		public Node right;
		public Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	/*public static void main(String[] args) {
		LeastCommonAncestorImpl least=new LeastCommonAncestorImpl();
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
		
		int ancestor=least.findLeastAncestor(11,2);
		System.out.println("The least common ancestor of "+i+"and"+j+" is : "+ancestor);
	}*/
	
	/**
	 * 
	 * @param i
	 * @param j
	 * @return
	 * 
	 * Method to find the least common ancestor node for the given two nodes.
	 */
	public int findLeastAncestor(int i, int j) {
		return findLeastAncestor(root,i,j);
		
	}
	
	/**
	 * 
	 * @param root2
	 * @param i
	 * @param j
	 * @return
	 */
	private int findLeastAncestor(Node root2, int i, int j) {
		
		int currentLeast=0; 
		
		ArrayList<Node> path1=getPath(root2,i);
		ArrayList<Node> path2=getPath(root2,j);
		
		int l1=path1.size();
		int l2=path2.size();
		int length=(l1<l2)?l1:l2;
		
		
		for(int k=0;k<=length-1;k++){
			if(path1.get(k).data==path2.get(k).data){
				currentLeast=path1.get(k).data;
				
			}
			else break;
		}
		
	return currentLeast;
	}
	
	/**
	 * 
	 * @param root2
	 * @param i
	 * @return
	 * 
	 * Given a node , 'getPath' method returns a list of nodes which 
	 * exist in the path from root to that node.
	 */
	private ArrayList<Node> getPath(Node root2, int i) {
		Node node=root2;
		ArrayList<Node> path=new ArrayList<Node>();
		while(node!=null){
		
			path.add(node);
			//System.out.println("Path for : "+i+"Adding :"+node.data);
			if(node.data==i){
				break;
			}
			else if(node.data>i){
				node=node.left;
				
			}
			else{
				node=node.right;
			}
		}
		return path;
	}

}
