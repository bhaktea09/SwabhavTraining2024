package com.techlabs.isp.violation.test;
import com.techlabs.isp.violation.model.Labour;
import com.techlabs.isp.violation.model.Robot;
import com.techlabs.isp.violation.model.Iworker;

public class Workertest {
	public static void main(String[] args) {
		
	
		 Labour labour = new Labour();
		  labour.startwork();
		  
		  Iworker robot = new Robot();
		  robot.startwork();
}
}