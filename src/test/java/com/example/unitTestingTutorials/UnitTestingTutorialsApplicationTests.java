package com.example.unitTestingTutorials;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingTutorialsApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void testMainMethod() {
		UnitTestingTutorialsApplication.main(new String[] {});
	}

}
