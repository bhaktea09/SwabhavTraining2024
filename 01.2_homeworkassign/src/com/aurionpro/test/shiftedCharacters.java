package com.aurionpro.test;
import java.util.*;
public class shiftedCharacters {

	public static String shiftCharacters(String input, int n) {
        // Handle edge cases
        if (input == null) {
            return input;
        }

        char[] chars = input.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            char originalChar = chars[i];
            char shiftedChar = shiftChar(originalChar, n);
            chars[i] = shiftedChar;
        }
        return new String(chars);
    }

    private static char shiftChar(char c, int n) {
        // Determine the boundary values for upper and lower case letters
        int startLower = 'a';
        int endLower = 'z';
        int startUpper = 'A';
        int endUpper = 'Z';

        // Determine the appropriate boundaries based on case
        int start = Character.isLowerCase(c) ? startLower : startUpper;
        int end = Character.isLowerCase(c) ? endLower : endUpper;

        // Calculate the new shifted character
        int shifted = c + n;
        if (shifted > end) {
            shifted = start + (shifted - end - 1);
        } else if (shifted < start) {
            shifted = end - (start - shifted - 1);
        }

        return (char) shifted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for n and input string
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        // Shift characters and display the result
        String shifted = shiftCharacters(input, n);
        System.out.println("Shifted result: " + shifted);

        scanner.close();
    }
}

	

