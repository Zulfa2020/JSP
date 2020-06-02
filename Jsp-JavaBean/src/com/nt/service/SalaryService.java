package com.nt.service;

import com.nt.dto.EmployeeDTO;

public class SalaryService {
public void paySlip(EmployeeDTO dto) {
	float grossSal=0.0f,netSal=0.0f;
	//write b.logic  to calculate gross and net salaries
	grossSal=dto.getBasicSal()+(dto.getBasicSal()*0.3f);
	netSal=grossSal-(dto.getBasicSal()*0.2f);
	//set gross net salaries to DTO object
	dto.setGrossSal(grossSal);
	dto.setNetSal(netSal);
	
}
}
