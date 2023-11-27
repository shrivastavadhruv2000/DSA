package com.demo.beans;

import com.demo.beans.SingleLinkedList.Node;

public class SingleLinkedList {
	private Node head;
	class Node{
		int n;
		Node next;
		Node(int d){
			n=d;
			next=null;
		}
	}
	public SingleLinkedList() {
		head=null;
	}
	
	public void addAtEnd(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	
	public void addByPosition(int value,int pos) {
		Node newnode=new Node(value);
		if(head==null && pos!=1) {
			System.out.println("List is empty");
		}
		if(pos==1) {
			if(head==null) {
				head=newnode;
			}
			else {
				newnode.next=head;
				head=newnode;
			}
		}
		else {
			Node temp=head;
		    for(int i=1;temp!=null && i<=pos-2;i++) {
		    	temp=temp.next;
		    }
		    if(temp!=null) {
		    	newnode.next=temp.next;
		    	temp.next=newnode;
		    }
		    else {
		    	System.out.println("position is wrong");
		    }
		}
	}
	
	public boolean deleteByValue(int val) {
		Node temp=head;
		if(head==null) {
			System.out.println("LL is empty");
		}
		else {
			//delete from the beginning
			if(head.n==val) {
				//Node temp=head;
				head=head.next;
				//it will make the temp ready for garbage collection
				temp.next=null;
				return true;
				
			}
			else {
				Node current=temp.next;
				while(current!=null && current.n!=val) {
					temp=temp.next;
					current=current.next;
				}
				if(current!=null) {
					temp.next=current.next;
					current.next=null;
					current=null;
					return true;
				}
				else {
					System.out.println(val+ "not found");
					return false;
				}
			}
		}
		return false;
	}
	
	public boolean deleteByPosition(int pos) {
    	if(pos==1) {
    		Node temp=head;
			head=head.next;
			//it will make the temp ready for garbage collection
			temp.next=null;
			return true;
    	}else {
    		Node prev=head;
			Node current=prev.next;
			for(int i=1;current!=null && i<=pos-2;i++) {
				prev=prev.next;
				current=current.next;
			}
			if(current!=null) {
				prev.next=current.next;
				current.next=null;
				current=null;
				return true;
			}else {
				System.out.println(pos+" is wrong");
				return false;
			}
			
    	}
    }
	
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.n);
			temp=temp.next;
		}
	}

}
