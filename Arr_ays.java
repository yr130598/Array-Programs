package com.Array;

import java.util.Iterator;

public class Arr_ays {
	public static void main(String[] args) {
		//print array
		int i[] = new int [10];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;		
		i[5] = 60;
		i[6] = 70;
		i[7] = 80;
		i[8] = 90;
		i[9] = 100;
		System.out.println(i[4]);
		System.out.println();
		
		//loop
		for (int a : i) {
			System.out.println(a);
			
		}
		// replace 
		i[3] = 2000;
		System.out.println(i[3]);
		
		// beyond length
		i[10] = 300;
}
}
