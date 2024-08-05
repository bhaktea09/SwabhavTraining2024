package com.techlabs.test;

public class Test {

	public static void main(String[] args) {
		try {

			double number1 = Double.parseDouble(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double result = number1 / number2;

			System.out.println("division is :" + result);
		}

		catch (ArithmeticException exception) {
			System.out.println(" wrong input for number 2. it cannot be 0 :");
		}
		catch(ArrayIndexOutOfBoundsException exception ) {
			System.out.println(" provide two numbers :");
		}
		 catch(NumberFormatException exception) {
			 System.out.println(" only integer values are allowed :");
		 }
		 catch(Exception exception) {
			 System.out.println(" something went wrong:" +exception);
		 }
			finally
			{
				System.out.println("closing activities ");
			}
		System.out.println("existing main");
	}

}
