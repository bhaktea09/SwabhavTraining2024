package com.techlabs.behavourial.state.model;

public class Ordered implements IPacket {

	@Override
	public void previous(IPacket packet) {
		// TODO Auto-generated method stub
		System.out.println("packet ordered");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is in current state");
	}

	@Override
	public void next(IPacket packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is in next state");
	}

	

}
