package array;

import java.util.Scanner;

public class maxnumberarraymxn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        int max =0;

        int[][] array = new int[m][n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the number to search: ");
        int numToSearch = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > max) {
                	max = array[i][j];
                    found = true;
                    System.out.println("Number found at position: (" + i + ", " + j + ")");
                }
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
		
	}

	}


