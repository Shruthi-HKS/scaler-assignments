package binarytrees;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) {
	       val = x;
	       left=null;
	       right=null;
	      }
	  }

public class InOrderTraversal {
	public static void main(String[] args) {
		
		TreeNode tree = new TreeNode(1);
		tree.val =1;
	       tree.right = new TreeNode(2);
	       tree.right.val =2;
	    	tree.right.left = new TreeNode(3);
	    	tree.right.left.val =3;
	    	TreeNode tree1 = new TreeNode(1);
			tree1.val =1;
		       tree1.right = new TreeNode(2);
		       tree1.right.val =2;
		    	tree1.right.left = new TreeNode(3);
		    	tree1.right.left.val =3;
		System.out.println(inOrder(tree));
		System.out.println(preOrder(tree));
		System.out.println(postOrder(tree));
		System.out.println(findHeight(tree));
		System.out.println(isIdentical(tree, tree1));
	}
	
	public static ArrayList<Integer> inOrder(TreeNode A) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(A == null) {
			return null;
		}
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr = A;
		//traverse the tree
		while(curr != null || s.size() > 0 ) {
			//Reach the left most node of the current node
			while(curr != null) {
				s.push(curr);
				//make left node as current node
				curr = curr.left;
			}
			
			//if current node is null pop out to print the left node
			curr = s.pop();
			list.add(curr.val);
			System.out.println(curr.val +" " );
			//point to right node to print the right node
			curr = curr.right;
		}
		
		return list;
	}
	
	public static ArrayList<Integer> preOrder(TreeNode A){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(A == null) {
			return null;
		}
		
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		nodeStack.push(A);
		
		while(nodeStack.isEmpty() == false) {
			TreeNode node = nodeStack.peek();
			list.add(node.val);
			nodeStack.pop();
			
			if(node.right !=null) {
				nodeStack.push(node.right);
			}
			
			if(node.left !=null) {
				nodeStack.push(node.left);
			}
		}
		
		return list;
	}

	public static ArrayList<Integer> postOrder(TreeNode A){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(A == null) {
			return null;
		}
		
		HashMap<TreeNode, TreeNode> map = new HashMap<>();
		map.put(A, null);
		while(A != null) {
			if(A.left != null && !map.containsKey(A.left)) {
				map.put(A.left, A);
				A = A.left;
			} else if(A.right != null && !map.containsKey(A.right)) {
				map.put(A.right, A);
				A = A.right;
			} else {
				list.add(A.val);
				A = map.get(A);
			}
		}
		
		return list;
	}
	
	private static int findHeight(TreeNode A) {
		if(A == null) {
			return 0;
		} else {
			int left = findHeight(A.left);
			int right = findHeight(A.right);
			if(left > right) {
				return (left +1);
			} else {
				return (right +1);
			}
		}
		
		
	}
	
	private static boolean findIdentical(TreeNode A, TreeNode B) {
		if(A == null && B == null) {
			return true;
		}
		if(A != null && B != null) {
			return (A.val == B.val) && findIdentical(A.left, B.left) && findIdentical(A.right, B.right);
		}
		return false;
	}
	
	private static int isIdentical(TreeNode A, TreeNode B) {
		boolean result = findIdentical(A, B);
		if(result) return 1; else return 0;
	}
	
	private static boolean isMirror(TreeNode A, TreeNode B) {
		if(A == null && B == null) {
			return true;
		}
		if(A != null && B != null && A.val == B.val) {
			return (isMirror(A.left, B.right) && isMirror(A.right, B.left));
		}
		return false;
	}
	
	private static int issMirrorTrue(TreeNode A, TreeNode B) {
		boolean result = isMirror(A, B);
		if(result) return 1; else return 0;
	}
}
 