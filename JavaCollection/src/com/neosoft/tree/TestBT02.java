package com.neosoft.tree;

public class TestBT02 {

	public static void main(String[] args) {
		BTN btn=new BTN();
		btn.root=new Node (1);
		btn.root.left=new Node(2);
		btn.root.right=new Node(4);
		
		System.out.println(btn.countNode(btn.root));
		System.out.println(btn.sumNode(btn.root));
		System.out.println(btn.heightNode(btn.root));
		System.out.println(btn.searchData(btn.root,4));
		System.out.println(btn.maxData(btn.root));
	}
}
class BTN{
	Node root;
	BTN(){
		root=null;
	}
	public int countNode(Node root) {
		if(root==null)
			return 0;
		int lc=countNode(root.left);
		int rc=countNode(root.right);
		
		return lc+rc+1;
	}
	public int sumNode(Node root) {
		if(root==null)
			return 0;
		int ls=sumNode(root.left);
		int rs=sumNode(root.right);
		
		return ls+rs+root.data;
	}
	public int heightNode(Node root) {
		if(root==null)
			return 0;
		int lh=heightNode(root.left);
		int rh=heightNode(root.right);
		
		return Math.max(lh, rh)+1;
	}
	public boolean searchData(Node root,int data) {
		if(root==null)
			return false;
		if(root.data==data)
			return true;
		if(searchData(root.left,data))
			return true;
		
		if(searchData(root.right,data))
			return true;
		return false;
	}
	public int maxData(Node root) {
		if(root==null)
			return Integer.MIN_VALUE;
		int max,leftMax,rightMax;
		max=root.data;
		leftMax=maxData(root.left);
		rightMax=maxData(root.right);
		if(leftMax>max)
			max=leftMax;
		if(rightMax>max)
			max=rightMax;
		
		return max;
	}
}
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
