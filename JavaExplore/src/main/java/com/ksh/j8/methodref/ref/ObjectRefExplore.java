package com.ksh.j8.methodref.ref;

import java.util.List;
import java.util.function.Function;

import com.ksh.j8.methodref.service.DataService;

public class ObjectRefExplore {
	DataService ds = new DataService();
	
	public static void main(String[] args) {
		ObjectRefExplore objRef = new ObjectRefExplore();
		objRef.showUserInfo();
	}
	
	private void showUserInfo() {
		  List<String> userIds = ds.getAllUserIds();
		  userIds.forEach(this::displayUserInfo);
	}
	private void displayUserInfo(String id){
		System.out.println("User info for id : "+id);
		display(id, ds::getUserAddressById);
		display(id, ds::getUserNameById);
	}
	private void display(String id, Function<String, ?> theConsumer){
		System.out.println(theConsumer.apply(id));
	}
}
