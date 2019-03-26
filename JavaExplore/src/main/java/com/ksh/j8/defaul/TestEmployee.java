package com.ksh.j8.defaul;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> empLis = Arrays.asList(new DefaultEmployee("100", "Ranga", "IT", new BigDecimal(5322)), new DefaultEmployee("100", "Jane", "Admin", new BigDecimal(6754)));
		
		System.out.println(Employee.getEmployeeInfo(empLis));
		
	}
}
