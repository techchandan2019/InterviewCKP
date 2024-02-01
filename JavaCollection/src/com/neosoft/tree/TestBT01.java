package com.neosoft.tree;

import com.neosoft.tree.BT.Node;

public class TestBT01 {

	public static void main(String[] args) {
		BT bt=new BT();
		int[] nodes= {15,13,7,1,-1,-1,2,-1,-1,6,-1,-1,12,-1,-1};
		Node node1=bt.buildTree(nodes);
		System.out.println(node1.data);
		System.out.println(node1.left.data);
		System.out.println(node1.right.data);
		
	}
}
