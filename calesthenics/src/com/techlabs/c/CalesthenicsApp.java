package com.techlabs.c;

import java.util.Scanner;

public class CalesthenicsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        
        System.out.println("Enter the elements of the matrix:");
        createRow(matrix, scanner);
        
        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void createRow(int matrix1[][], Scanner scanner1) {
        for (int row = 0; row < 3; row++) {
            readRowElements(matrix1, scanner1, row);
        }
    }

    private static void readRowElements(int matrix1[][], Scanner scanner1, int row) {
        for (int col = 0; col < 3; col++) {
            matrix1[row][col] = scanner1.nextInt();
        }
    }
}
