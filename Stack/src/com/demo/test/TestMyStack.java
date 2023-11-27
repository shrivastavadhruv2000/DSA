package com.demo.test;

import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack st=new MyStack(5);
		//st.push(12);
		//st.push(23);
		//st.push(34);
		st.push(54);
		st.push(32);
		st.push(90);
		st.push(76);
		st.push(87);
		
		System.out.println(st.pop()+" removed");
		while(!st.isEmpty()) {
			System.out.println(st.pop()+" removed");
		}
		

	}

}
