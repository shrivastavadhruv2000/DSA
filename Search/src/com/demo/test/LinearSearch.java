package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String []args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("enter the values");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter no to be searched");
		int search = sc.nextInt();
		System.out.println("enter the choice 1.linear 2. Binary");
		int choice= sc.nextInt();
		if(choice == 1) {
		int pos=linearSearch(arr, search);
		System.out.println("pos of search is "+pos);
		}
		else if(choice == 2) {
			int pos=binarySearch(arr, search);
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

	private static int binarySearch(int[] arr, int search) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int first=0;
		int last= arr.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==search) {
				return mid;
			}
			else if(arr[mid]<search) {
				first=mid+1;
			}
			else {
				last=mid-1;
			}
		}
		return -1;
	}

	private static int linearSearch(int[] arr, int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search)
			return i;
		}
		return -1;	
		}
}
