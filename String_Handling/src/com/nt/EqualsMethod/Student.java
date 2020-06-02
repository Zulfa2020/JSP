package com.nt.EqualsMethod;

public class Student {

	int sno;
	String sname;
	String course;
	   
	public Student(int sno, String sname, String course) {
	this.sno=sno;
	this.sname=sname;
	this.course=course;
	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
		
		Student s=(Student)obj;
		return this.sno==s.sno;
	}
		return false;
	}
	

}
