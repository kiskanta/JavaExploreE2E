package com.ksh.j8.defaul;

import java.math.BigDecimal;

public interface BounsCalculator {
	BigDecimal getSalary();
	
	BigDecimal getBounsPresent();
	
	default BigDecimal getBouns(){
		return getSalary().multiply(getBounsPresent()).divide(new BigDecimal(100));
	}
}
