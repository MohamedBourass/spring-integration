package com.mbo.samples.endpoints;

public interface Activator<T> {
	
	public void handleMessage(T input);

}
