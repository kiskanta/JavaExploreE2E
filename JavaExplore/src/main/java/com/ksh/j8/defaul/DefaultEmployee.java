package com.ksh.j8.defaul;

import java.math.BigDecimal;

public class DefaultEmployee extends DomainObject implements Employee{
	
	private final String name;
    private final String dept;
    private final BigDecimal salary;
    
    public DefaultEmployee(String id, String name, String dept, BigDecimal salary) {
		super(id);
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public BigDecimal getSalary() {
		return salary;
	}
    
    
}
