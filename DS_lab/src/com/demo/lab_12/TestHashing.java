package com.demo.lab_12;

import java.util.Scanner;

public class TestHashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {25,12,14,45,1,3,8,9};
		
		SingleLinkedList[] hashtab=new SingleLinkedList[5];  //
		
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i]=new SingleLinkedList();
		}
		
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i]%hashtab.length;
			hashtab[pos].addatstart(arr[i]);			
		}
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i].displaydata();
		}
		
		System.out.println("Enter nm to search: ");
		int searchnum= sc.nextInt();
		
		int pos=searchnum%hashtab.length;
		if(hashtab[pos].search(searchnum)) {
			System.out.println(searchnum+" number exists at "+pos);
		}else {
			System.out.println("number does not exists");
		}
		 
	}
}