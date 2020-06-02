package com.nt.Hashcode;

public class Example2 {
	int x;

	public Example2(int x) {
		this.x=x;
		}

	
	@Override
	public int hashCode() {
		return x;
	}
	
	

}
