package com.techlabs.test;

import com.techlabs.model.Ifactorial;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifactorial factorial = number -> {
			int answer = 1;
			for(int i = number ; i >=2 ; i--) {
				answer *= i ;
			}
			
			return answer;
		};
		
		System.out.println(factorial.fact(4));
	}

}
