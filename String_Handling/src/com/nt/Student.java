package com.nt;

public class Student {

	private int sno;
	private String sname;
	private String course;
	public Student(int sno, String sname, String course) {
		
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	@Override
	public int hashCode() {
		System.out.println("hS is called"+" " +course.hashCode());
		return ((course==null)?0:course.hashCode());
	}
	@Override
	public boolean equals(Object ob) {
		System.out.println("eQ is called");
			if(ob instanceof Student) {
				Student std=(Student)ob;
				return  this.course.equals(course) && 
						this.sno==std.sno;
					   
					  
			}
		return false;
	}
	@Override
	public String toString() {
		System.out.println("tS is called");
		return "Student (sno=" + sno + ", sname=" + sname + ", course=" + course + ")"+"\n";
	}
	
	}//class
