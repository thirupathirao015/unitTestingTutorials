package com.example.unitTestingTutorials;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.net.ssl.SSLEngineResult.Status;

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

import com.example.unitTestingTutorials.controller.EmployeeController;

//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeTestInfo {

	@Test
	public void getString() {
		assertEquals("Hello world", "Hello world");
	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getHello_basic() {
		// call GET "/hello" application/json

		RequestBuilder request = MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
		MvcResult result;
		try {

			// Example-2: 27th video is Going......
			// Response Matchers to check status and Content
			result = mockMvc.perform(request).andExpect(status().isOk()).andExpect(content().string("Hello world"))
					.andReturn();

			// Example-1:
			// result = mockMvc.perform(request).andReturn();
			// assertEquals("Hello world", result.getResponse().getContentAsString());
		} catch (Exception e) {
			System.out.println("getHello_basic -> got exception while calling /hello url ");
		}

	}

}
