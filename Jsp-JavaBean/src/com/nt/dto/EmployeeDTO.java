package com.nt.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeDTO  implements Serializable{
private int eno;
private String ename;
private float basicSal;
private float grossSal;
private float netSal;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	System.out.println("EmployeeDTO.setEno()");
	this.eno = eno;
}
public String getEname() {
	System.out.println("EmployeeDTO.getEname()");
	return ename;
}
public void setEname(String ename) {
	System.out.println("EmployeeDTO.setEname()");
	this.ename = ename;
}
public float getBasicSal() {
	System.out.println("EmployeeDTO.getBasicSal()");
	return basicSal;
}
public void setBasicSal(float basicSal) {
	System.out.println("EmployeeDTO.setBasicSal()");
	this.basicSal = basicSal;
}
public float getGrossSal() {
	System.out.println("EmployeeDTO.getGrossSal()");
	return grossSal;
}
public void setGrossSal(float grossSal) {
	System.out.println("EmployeeDTO.setGrossSal()");
	this.grossSal = grossSal;
}
public float getNetSal() {
	System.out.println("EmployeeDTO.getNetSal()");
	return netSal;
}
public void setNetSal(float netSal) {
	System.out.println("EmployeeDTO.setNetSal()");
	this.netSal = netSal;
}

}
