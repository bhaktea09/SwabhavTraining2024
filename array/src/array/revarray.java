package array;

import java.util.Scanner;

public class revarray {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int size = sc.nextInt();
		 int i = 0;
		int arr [] = new int [size];
		int revarr [] = {1,2,3,4,5};
		System.out.println("Input array" );
		
		System.out.println("reversed array");
		for (int i1 = size - 1; i1 >= 1; i1--) {
			System.out.print(revarr[i1]);
		}
       
		System.out.print(revarr[i] );
	}
}
