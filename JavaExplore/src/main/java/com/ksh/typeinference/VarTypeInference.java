package com.ksh.typeinference;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarTypeInference {
	public static void main(String[] args) {
		var str ="I am Kingshore";
		var b = 127;
		var f =127.8;
		
		//collection
		var col =Arrays.asList("123", "34",34, 78);
		List<?> colLis =Arrays.asList("123", "34",34, 78);
		
		var al = new ArrayList<>();
		al.add("HI");
		al.add(123);
		System.out.println(str+" class "+str.getClass().getTypeName());
		System.out.println(b+" byte "+b);
		System.out.println(f+" float "+f);
		System.out.println("var collection "+col.get(1)+" 3 "+col.get(3).toString());
		System.out.println("var collection Name "+col.getClass().getSimpleName());
		System.out.println("collection List "+colLis);
		
		System.out.println("collection ArrayList "+al);
		
		var number = new BigDecimal("1.6");
		var intI = 1;
		number = getSqureOf(number);
		System.out.println(number);
	}
	
	private static BigDecimal getSqureOf(BigDecimal number){
		var result = number.multiply(number);
		return result;
	}
}
