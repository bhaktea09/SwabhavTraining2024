package com.techlabs.creational.decorator.test;

import com.techlabs.creational.decorator.model.Carinspection;
import com.techlabs.creational.decorator.model.ICarservice;
import com.techlabs.creational.decorator.model.Oilchange;
import com.techlabs.creational.decorator.model.Wheelallign;

public class Carservicetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICarservice car = new Carinspection();
		Oilchange oc = new Oilchange(car);
		Wheelallign wa = new Wheelallign(oc);
		System.out.println(car.getcost());
		System.out.println(oc.getcost());
		System.out.println(oc.Oilchange(car));
		System.out.println(wa.Wheelallign(oc));
		System.out.println(car.getcost()+oc.Oilchange(car)+wa.Wheelallign(car));
	}

}
