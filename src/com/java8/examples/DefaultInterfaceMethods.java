package com.java8.examples;

interface Formula {

	double calculate(int a);

	// Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the "default" keyword.
	// This feature is also known as Extension Methods. 

	default double sqrt(int a) {
		return java.lang.Math.sqrt(a);
	}

}



public class DefaultInterfaceMethods {

	public static void main(String[] args) {
		
		// Implemented as an anonymous object.
		// Concrete classes only have to implement the abstract method calculate.
		// The default method sqrt can be used out of the box.
		
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a);
			}
		};

		System.out.println(formula.calculate(100));
		System.out.println(formula.sqrt(16));

	}

}
