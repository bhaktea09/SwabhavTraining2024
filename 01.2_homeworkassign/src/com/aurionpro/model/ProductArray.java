package com.aurionpro.model;

import java.util.Scanner;

public class ProductArray {
	public static int[] productExceptSelf(int[] array) {
		int n = array.length;
		int[] prod = new int[n];

		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * array[i - 1];
		}

		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * array[i + 1];
		}

		for (int i = 0; i < n; i++) {
			prod[i] = left[i] * right[i];
		}

		return prod;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		int[] result = productExceptSelf(array);
		System.out.println("The product array is: ");
		for (int value : result) {
			System.out.print(value + " ");
		}
	}

}
