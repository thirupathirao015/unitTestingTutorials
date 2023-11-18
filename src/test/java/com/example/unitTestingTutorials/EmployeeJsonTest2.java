package com.example.unitTestingTutorials;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.unitTestingTutorials.controller.EmployeeJsonCheckingController;

//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeJsonCheckingController.class)
public class EmployeeJsonTest2 {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getJsonObject_basic() {

		RequestBuilder request = MockMvcRequestBuilders.get("/EmpJson").accept(MediaType.APPLICATION_JSON);
		MvcResult result;
		try {
			result = mockMvc.perform(request).andExpect(status().isOk())
					.andExpect(content().json("{\"eid\": 1,\"ename\":\"thirupathi\",\"eaddress\":\"Bangalore\"}"))
					.andReturn();

		} catch (Exception e) {
			System.out.println("getHello_basic -> got exception while calling /hello url ");
		}

	}
}
