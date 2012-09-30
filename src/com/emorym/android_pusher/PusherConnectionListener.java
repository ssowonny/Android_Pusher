package com.emorym.android_pusher;

public interface PusherConnectionListener {
	public void onInitialized();
	
	public void onConnected();
	
	public void onFailed();
	
	public void onDisconnected();
}
