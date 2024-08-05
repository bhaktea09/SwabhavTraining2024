package array;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter array elements :");
		int size = sc.nextInt();
		int array[] = new int [size];
		
		 for (int i=0 ; i<size; i++) {
			 array[i] = sc.nextInt();
			 System.out.println("Array is");}
		 
	     for (int i1 =0; i1<size ; i1++) {
	    	 System.out.println(array [i1] );
		 }

	}

}
