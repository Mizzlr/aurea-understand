package com.aurea;

import java.util.Arrays;

import com.scitools.understand.Understand;
import com.scitools.understand.Database;
import com.scitools.understand.Entity;

import com.scitools.understand.UnderstandException;

public class U {

    public static void main(String[] args) throws UnderstandException {
	System.out.println(System.getenv());
	Understand.loadNativeLibrary();
	Database db = Understand.open("./target/testDB.udb");

	for(Entity o: db.ents("class, function")){
	    System.out.println(o.name() + ":" + Arrays.toString(o.metrics()));
	};
    }    
}
