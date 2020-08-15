package com.edwin;

public class Node {
	Node left,right;
	int data;
	public Node(int number){
		data=number;
		left=right=null;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getData() {
		return data;
	}
}
