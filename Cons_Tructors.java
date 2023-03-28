package com.Constructor;


public class Cons_Tructors {
	// non parameterized
	public Cons_Tructors() {
		System.out.println("500");
	}
	// parameterized
	public Cons_Tructors(int a) {	
		 System.out.println(a);
	}

	public static void main(String[] args) {
		Cons_Tructors c = new Cons_Tructors();
		new Cons_Tructors();
		new Cons_Tructors(200);

	}

}
