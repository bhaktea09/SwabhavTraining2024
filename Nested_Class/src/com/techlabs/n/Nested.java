package com.techlabs.n;

class Outerclass {
	int x = 10;

	class Innerclass {
		int y = 5;
	}
}

public class Nested {
	public static void main(String[] args) {
		Outerclass outclass = new Outerclass();
		Outerclass.Innerclass inclass = outclass.new Innerclass();
		System.out.println(outclass.x + inclass.y);
	}

}
