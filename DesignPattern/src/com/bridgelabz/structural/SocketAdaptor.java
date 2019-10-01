package com.bridgelabz.structural;

public interface SocketAdaptor 
{
	public interface SocketAdapter {

		public Volt get120Volt();
			
		public Volt get12Volt();
		
		public Volt get3Volt();
	}

}
