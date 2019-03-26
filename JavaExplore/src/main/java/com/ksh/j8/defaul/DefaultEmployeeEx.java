package com.ksh.j8.defaul;

import java.math.BigDecimal;
import java.util.Objects;

public class DefaultEmployeeEx extends DefaultEmployee implements BounsCalculator{

	private final BigDecimal bonusPercent;
	
	public DefaultEmployeeEx(String id, String name, String dept, BigDecimal salary, BigDecimal bonusPercent) {
		super(id, name, dept, salary);
		Objects.requireNonNull(bonusPercent);
		this.bonusPercent =  bonusPercent;
	}

	@Override
	public BigDecimal getBouns() {
		return BounsCalculator.super.getBouns();
	}

	@Override
	public BigDecimal getBounsPresent() {
		return bonusPercent;
	}
}
