package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.Carfactory;
import com.techlabs.creational.factory.model.ICarfactory;
import com.techlabs.creational.factory.model.Icar;
import com.techlabs.creational.factory.model.Mahindra;
import com.techlabs.creational.factory.model.Maruti;
import com.techlabs.creational.factory.model.Marutifctory;
import com.techlabs.creational.factory.model.Tata;
import com.techlabs.creational.factory.model.Tatafactory;

public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Maruti maruti = new Maruti();
//		Tata tata = new Tata();
//		Mahindra mahindra = new Mahindra();
//		
//		maruti.start();
//		maruti.stop();
//		
//		tata.start();
//		tata.stop();
//		
//		mahindra.start();
//		mahindra.stop();
//		Carfactory carfactory = new Carfactory();
//		carfactory.makecar("maruti");
//		
//		Carfactory carfactory1 = new Carfactory();
//		carfactory.makecar("tata");
//		
//		Carfactory carfactory2 = new Carfactory();
//		carfactory.makecar("mahindra");
		
		ICarfactory marutifactory = new Marutifctory();
		Icar maruti = marutifactory.makecar();
		maruti.start();
		maruti.stop();
		
		ICarfactory tatafactory = new Tatafactory();
		Icar tata = tatafactory.makecar();
		tata.start();
		tata.stop();
		
	}

}
