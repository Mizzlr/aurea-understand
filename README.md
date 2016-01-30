# aurea-understand

```
	git clone git@github.com:softsky/aurea-understand.git
	cd aurea-understand

	mvn install:install-file \
	    -Dfile=lib/com.scitools.understand.plugin_1.1.3.jar \
	    -DgroupId=com.scitools.understand \
	    -DartifactId=understand-plugin -Dversion=1.1.3 \
	    -Dpackaging=jar
	    
	cp <path/to/some/udb/file.udb> target/testDB.udb # Looks like .udb is U's project file. Generate file first with SciTools U
	
	LD_LIBRARY_PATH=./native/x86-64/:/opt/oracle-jdk-bin-1.8.0.72/jre/lib/amd64/:$LD_LIBRARY_PATH mvn compile exec:java # can't get it working w/o jre lib
```