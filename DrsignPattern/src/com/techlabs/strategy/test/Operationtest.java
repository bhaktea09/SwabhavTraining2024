package com.techlabs.strategy.test;

import com.techlabs.strategy.model.Addoperation;
import com.techlabs.strategy.model.Multiplyoperation;
import com.techlabs.strategy.model.Operationstrategy;

public class Operationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operationstrategy op = new Operationstrategy(new Addoperation());
//		op.dooperation(10, 30);
//		op.setOperation(new Multiplyoperation());
//		op.dooperation(40, 80);
		System.out.println(op.dooperation(10, 30));
	
	}

}
