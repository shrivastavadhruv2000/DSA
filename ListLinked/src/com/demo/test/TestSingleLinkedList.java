package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		SingleLinkedList ob=new SingleLinkedList();
		ob.addAtEnd(10);
		ob.addAtEnd(20);
		ob.addByPosition(30,1);
		ob.addByPosition(40, 3);
		
		ob.displayData();
		
		
		ob.deleteByPosition(2);
		ob.deleteByValue(30);
		
		
		ob.displayData();
	}

}
