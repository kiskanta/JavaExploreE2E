package com.ksh.db.nosql.mongo;

import java.util.List;
import java.util.function.Consumer;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCursor;

public class ListDataBasesMongo {
	public static void main(String args[]){
		// Old version, uses Mongo
		//Mongo mongo = new Mongo("localhost", 27017);

		// Since 2.10.0, uses MongoClient
		//MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		MongoClient mongo =
                new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		//DB db = mongo.getDB("database name");
		
		//DatabaseNames deprecated
		List<String> dbs = mongo.getDatabaseNames();
		
		for(String db : dbs){
			System.out.println(db);
		}
		System.out.println("****** Listing the DB names *****");
		//DataBaseList
		MongoCursor<String> dbCursor = mongo.listDatabaseNames().iterator();
		while(dbCursor.hasNext()) {
			System.out.println(dbCursor.next());
		}
		System.out.println("****** Listing the DB names Using forEach *****");
		mongo.listDatabaseNames().forEach((Consumer<String>) System.out::println );
	}
}
