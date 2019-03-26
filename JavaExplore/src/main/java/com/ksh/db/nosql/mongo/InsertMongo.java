package com.ksh.db.nosql.mongo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class InsertMongo {
	
	private static final Logger LOGGER = Logger.getLogger(InsertMongo.class.getSimpleName());
	
	public static void main(String[] args) {
		MongoClient mClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		if(listDataBases(mClient).contains("ksh")) {
			LOGGER.info("Connteted KSH database");
			MongoDatabase DB = mClient.getDatabase("ksh");
			MongoCollection mCollection = DB.getCollection("employee");
			mCollection.find().forEach((Consumer) System.out::println); 
		}else {
			System.out.println("KSH database is not aviable");
		}
	}

	public static List<String> listDataBases(MongoClient mongo) {
		LOGGER.info("Listing the databases");
		List<String> dbList = new ArrayList<>();
		mongo.listDatabaseNames().forEach((Consumer<String>) s -> dbList.add(s));
		
		return dbList;
	}
}
