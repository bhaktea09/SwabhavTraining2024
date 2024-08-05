package com.techlabs.strategy.model;

public class Operationstrategy  {
	IOperation operation;

	public Operationstrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
		
	}
	public int dooperation(int a , int b) {
		return operation.dooperation(a, b);
	}

	
	
}
