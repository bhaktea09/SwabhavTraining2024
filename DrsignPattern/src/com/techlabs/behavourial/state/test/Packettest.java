package com.techlabs.behavourial.state.test;

import com.techlabs.behavourial.state.model.Ordered;
import com.techlabs.behavourial.state.model.Packet;

public class Packettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packet packet = new Packet(new Ordered());
		packet.gotoprevioudstate();
		packet.gotonextstate();
		
		}

}
