package com.neosoft.tree;
//binary Search tree
public class TestBST03 {

	public static void main(String[] args) {
		BST bst=new BST();
		int[] nodes= {1,2,3,4,5,6,7,8,9,10};
		bst.root=bst.createBST(nodes,0, nodes.length-1);
		System.out.println(bst.root.data);
		System.out.println(bst.root.left.data);
		System.out.println(bst.root.right.data);
	}
}
class BST{
	Node2 root;
	BST(){
		root=null;
	}
	public Node2 createBST(int []nodes,int start,int end) {
		Node2 node=null;
		if(start>end)
			return null;
		int mid=(start+end)/2;
		node=new Node2(nodes[mid]);
		node.left=createBST(nodes,start,mid-1);
		node.right=createBST(nodes,mid+1,end);
		
		return node;
	}
	
}
class Node2{

	int data;
	Node2 left;
	Node2 right;
	Node2(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
