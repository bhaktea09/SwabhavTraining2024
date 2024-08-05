package com.techlabs.ocp.solution.test;

import com.techlabs.isp.violation.model.Robot;
import com.techlabs.ocp.solution.model.Loader;

public class Workertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loader loader = new Loader();
		loader.eat();
		loader.rest();
		loader.start();
		loader.stop();
		
		Robot robot = new Robot();
		robot.drink();
		robot.eat();
	}

}
