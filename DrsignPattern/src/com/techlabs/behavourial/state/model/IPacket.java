package com.techlabs.behavourial.state.model;

public interface IPacket {
	public void previous(IPacket packet);
	public void current(Packet packet);
	public void next(IPacket packet);
	
	
}
