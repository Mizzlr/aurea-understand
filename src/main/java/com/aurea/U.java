package com.aurea;

import java.util.Arrays;

import com.scitools.understand.Understand;
import com.scitools.understand.Database;
import com.scitools.understand.Entity;

import com.scitools.understand.UnderstandException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class U {

    public static void main(String[] args) throws UnderstandException {
	System.out.println(System.getenv());
	Understand.loadNativeLibrary();
	Database db = Understand.open("./savvion.udb");

	GraphDatabaseService gdb = new GraphDatabaseFactory().newEmbeddedDatabase();

	try ( Transaction tx = graphDb.beginTx() ){
		// Database operations go here
		tx.success();
	} catch(Exception ex){
	    // TODO
	}

	for (Entity o : db.ents("class, function")) {
	    System.out.println(o.name() + ":" + Arrays.toString(o.metrics()));
	};
    }
}
