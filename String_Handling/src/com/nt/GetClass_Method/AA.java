package com.nt.GetClass_Method;

public class AA {
	static void m1(Object ob) {
		String name=ob.getClass().getName();
		System.out.println("The Passed Object Is Of Type :"+name);
		
	}

}
