package com.ksh.j8.methodref.ref;

import java.util.Collections;
import java.util.List;

import com.ksh.j8.methodref.service.DataService;

public class StaticRefExplore {
	public static void main(String[] args) {
		DataService ds = new DataService();
		List<String> list = ds.getAllUserNames();
		
		System.out.println("User list "+list);
		
		Collections.sort(list, StaticRefExplore::compare);
		System.out.println(" user List "+list);
	}
	
	private static int compare(String s1, String s2){
		return getLastName(s1).compareTo(s2);
	}
	private static String getLastName(String name){
		int i= name.indexOf(" ");
		return i != -1 ? name.substring(i+1) : name;
	}
}
