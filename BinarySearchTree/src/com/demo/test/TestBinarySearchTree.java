package com.demo.test;

import com.demo.beans.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(80);
		System.out.println("Inorder Binary Tree");
		bst.inorder();
		System.out.println();
		System.out.println("--------------------------------");
		//System.out.println("Preorder Binary Tree");
		bst.preorder();
		System.out.println();
		System.out.println("--------------------------------");
		//System.out.println("PostOrder Binary Tree");
		bst.postorder();
		

	}

}
