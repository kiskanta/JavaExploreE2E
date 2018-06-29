package com.ksh.javaexplore.maintest;

import com.ksh.operators.arithmetic.AssignmentOperatorFactory;
import com.ksh.operators.arithmetic.KSHAssignmentOperator;

public class AssignOperatorMain {
	public static void main(String[] args) {
		AssignmentOperatorFactory assignmentOperator = new KSHAssignmentOperator();
		System.out.println("Adding 5 to 10 "+assignmentOperator.add(10, 5)); 
		System.out.println("concatinating rao to Rama is "+assignmentOperator.add("Rama", " Rao"));
	}
}
