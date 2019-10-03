package com.bridgelabz.behavioural.observer;

public interface Observer 
{

	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(MyTopic topic);
}
