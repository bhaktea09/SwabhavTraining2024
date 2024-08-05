package com.techlabs.n;

class Outterclass {
	int x = 10;

	static class Innerclass {
		int y = 5;
	}
}

public class Staticnested {
	public static void main(String[] args) {
		Outterclass.Innerclass inclass = new Outterclass.Innerclass();
		System.out.println(inclass.y);
	}

}
