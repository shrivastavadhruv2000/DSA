package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Recurssion {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int[] arr=new int[n];
		int first=0;
		int last= arr.length-1;
		int mid=(first+last)/2;
		
		System.out.println("enter the values");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter no to be searched");
		int search = sc.nextInt();
		System.out.println("enter the choice 1.linear 2. Binary");
		int choice= sc.nextInt();
		if(choice == 1) {
		int pos=linearSearch(arr, search, 0);
		System.out.println("pos of search is "+pos);
		}
		else if(choice == 2) {
			int pos=binarySearch(arr, search,first, last);
			if(pos!=-1) {
				System.out.println("pos of search is "+(pos+1));
			}
			else {
				if(pos!=-1) {
					System.out.println("pos of search is "+(pos+1));
				}
				else {
					System.out.println("not found");
				}
			}
		}
		
		else {
			System.out.println("Wrong choice");
		}
		
	}

	private static int binarySearch(int[] arr, int search,int first , int last) {
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		if(first>last) {
			return -1;
		}
		else {
			int mid=(first + last)/2;
			
			if(arr[mid]==search) {
				return mid;
			}
			else if(arr[mid]<search) {
				return binarySearch(arr, search, mid+1, last);
				
			}
			else {
				return binarySearch(arr, search, first, mid-1 );
			}
		}
			
		
	}

	private static int linearSearch(int[] arr, int search, int i) {
		if(arr[i]== search) {
			return arr[i];
		}
		else if(i<arr.length){
			return linearSearch(arr, search, i+1);
		}
		else {
			return -1;
		}
		
	
		 
		 
	}
}

