package com.neosoft.tree;

public class BT {
	static int index=-1;
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
	public Node buildTree(int[] nodes) {
		index++;
		if(nodes[index]==-1)
			return null;
		
		Node node=new Node(nodes[index]);
		node.left=buildTree(nodes);
		node.right=buildTree(nodes);
		
		return node;
	}

}
