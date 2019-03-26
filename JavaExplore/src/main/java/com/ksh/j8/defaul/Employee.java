package com.ksh.j8.defaul;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public interface Employee {
	String getName();
	
	String getDept();
	
	BigDecimal getSalary();
	
	default BigDecimal getBouns(){
		return getSalary().multiply(new BigDecimal(0.10)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	default String getEmployeeInfo() {
		return "Name ; "+getName()+", Dept : "+getDept()+", Salary : "+getSalary()+", bouns "+getBouns();
	}
	
	static String getEmployeeInfo(List<Employee> empList){
		return empList.stream().map(s -> s.getEmployeeInfo()+"\n").collect(Collectors.joining());
	}
}
