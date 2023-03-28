package com.Array;

public class Arrays {
	public static void main(String[] args) {
		int id[] = new int[5];
		id [0] = 10;
		id [1] = 20;
		id [2] = 30;
		id [3] = 40;
		id [4] = 50;
		System.out.println("printing value index 3 and length 4");
		System.out.println(id[3]);		
		System.out.println();
		// printing the iteration
		System.out.println("Iteration");
		for (int i : id) {
			System.out.println(i);		
		}
		System.out.println();
		//replacing value of index 3 and length 4
		System.out.println("Before replacement");
		System.out.println(id[3]);
		id[3] = 800;
		System.out.println("After Replacement");
		System.out.println(id[3]);
		//Exception
		System.out.println("value beyond the length");
		id[4]= 300;
		System.out.println(id[4]);
		System.out.println();
		for (int a : id) {
			System.out.println(a);
		}
	}

}
