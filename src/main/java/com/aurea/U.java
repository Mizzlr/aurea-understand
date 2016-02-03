package com.aurea;

import java.util.Arrays;

import com.scitools.understand.*;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class U {

	public static void main(String[] args) throws UnderstandException {
//	System.out.println(System.getenv());
		Understand.loadNativeLibrary();
		Database db = Understand.open("./target/MyUnderstandProject.udb");

//	GraphDatabaseService gdb = new GraphDatabaseFactory().newEmbeddedDatabase();
//
//	try ( Transaction tx = graphDb.beginTx() ){
//		// Database operations go here
//		tx.success();
//	} catch(Exception ex){
//	    // TODO
//	}

		// for (Entity o : db.ents("class, function")) {
		for (Entity method : db.ents("Method")) {
//	    System.out.println(o.name() + ":" + Arrays.toString(o.metrics()));
			System.out.println(method.longname(true));

			for(Reference param : method.refs("Define","", true)) {
				System.out.println("\t" + param.ent().type() + " " + param.ent().name());
			}
		};

	}
}
