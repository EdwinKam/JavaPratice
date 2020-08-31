package com.edwin;

import java.util.Scanner;

public class BinaryTree {
    Node root=null;

    public static void main(String[] args) {
        // write your code here
        BinaryTree tree = new BinaryTree();
        Scanner s = new Scanner(System.in);
        int userinput=1;
        System.out.print("input: ");
        while(userinput!=0){
            userinput=s.nextInt();
            System.out.println("input");
            tree.add(userinput);
        }
        System.out.println("preorder");
        tree.preOrder(tree.root);
        System.out.println("inorder");
        tree.inOrder(tree.root);
        System.out.println("postorder");
        tree.postOrder(tree.root);
        System.out.println("depth");
        System.out.println(tree.maxDepth(tree.root));
        System.out.println("haha");
        tree.displayTree(tree);
    }
    public int locationHeight(Node head, Node node){
        return maxDepth(root)-maxDepth(node);
    }
    public void displayTree(BinaryTree object) {
       displayTree(object.root, object.root);
    }
    public void displayTree(Node head, Node node){
        if (node != null) {
            displayTree(head, node.right);
            final int space=2*locationHeight(head, node )+1;
            //final int space=2;
            System.out.printf("%"+space+"d\n",node.data);
            displayTree(head, node.left);
        }
    }

    public void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node){
        if(node !=null){
            inOrder(node.left);
            System.out.println(node);//print the input node
            inOrder(node.right);
        }
    }
    public void postOrder(Node node){
        if (node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node);//root node is the last one to print

        }
    }
    public int maxDepth(Node node){
        if(node==null){//if nothing in the tree, the height is -1, if only one node then height =0
            return -1;
        }else{
            int lheight=maxDepth(node.left);
            int rheight=maxDepth(node.right);

            if(lheight>rheight){
                return lheight+1;
            }else return rheight+1;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node travelNode = root;//travelNode node will move, it starts from root and move down
            Node parent;
            while (true) {
                parent = travelNode;//everytime it loops, the parent node will move down becasue the travelNode is changing
                if (data < travelNode.data) {
                    travelNode = travelNode.left;//travelNode is moved to its left child here
                    if (travelNode == null) {//
                        parent.left = newNode;//parent node didnt change so its the node's parent
                        return;//exi the loop
                    }//else it will keep on looping
                } else {
                    travelNode = travelNode.right;
                    if (travelNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}
class Node {
    Node left, right;
    int data=0;

    public Node(int number) {
        data = number;
    }
    public String toString(){
        return Integer.toString(data);
    }
}
