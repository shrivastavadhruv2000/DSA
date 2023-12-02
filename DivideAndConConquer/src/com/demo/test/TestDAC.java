package com.demo.test;
import com.demo.beans.*;
public class TestDAC {

	public static void main(String[] args) {
		DivideAndConquer dac = new DivideAndConquer();
		int min, max;

		// Initializing the array
		int a[] = { 70, 250, 50, 80, 140, 12, 14 };

		// Recursion - DAC_Max function called
		max = dac.DAC_Max(a, 0, 7);

		// Recursion - DAC_Max function called
		min = dac.DAC_Min(a, 0, 7);
		
		System.out.printf("The minimum number in " +
						"a given array is : %d\n", min);
		System.out.printf("The maximum number in " +
						"a given array is : %d", max);
	}

}
