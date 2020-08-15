package com.edwin;

public class Data{
	Node root;
	public void add(int data){
		root =add(root,data);
	}
	private Node add(Node previous, int data){

		if(previous==null){
			previous =new Node(data);
		}else {
			if (previous.getData() > data) {
				previous = add(previous.left, data);
			} else {
				previous = add(previous.right, data);
			}
		}
			return previous;

	}
}
