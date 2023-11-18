package com.example.unitTestingTutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestingTutorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingTutorialsApplication.class, args);
	}

	//Key Points:
	//http://localhost:9999/h2-console/   for verifying data base records.
	//database username and password -> check application properties.
	//clear maven and install for getting jars.
	
}
