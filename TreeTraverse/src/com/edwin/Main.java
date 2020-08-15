package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Data data = new Data();
        data.add(5);
        data.add(10);
        data.add(2);
        preOrder(data.root);
    }
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.getData());
        preOrder(root.left);
        preOrder(root.left);
    }
}
