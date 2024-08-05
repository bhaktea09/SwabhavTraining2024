package com.techlabs.behavourial.state.model;

public class Packet {
	private IPacket packet;

	public Packet(IPacket packet) {
		super();
		this.packet = packet;
	}

	public IPacket getPacket() {
		return packet;
	}

	public void setPacket(IPacket packet) {
		this.packet = packet;
	}
	public void gotonextstate() {
		packet.next(packet);
	}
	public void gotoprevioudstate() {
		packet.previous(packet);
	}
}
