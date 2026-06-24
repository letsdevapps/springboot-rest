package com.pro.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.pro.service.HomeService;

@WebMvcTest(HomeApi.class)
public class HomeApiTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockitoBean
	private HomeService homeService;

	@Test
	void index() throws Exception {
		String rootMessage = "----- Springboot Rest | Home API | Root Index -----";

		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(content().string(rootMessage));
	}

	@Test
	void getLoremIpsum() throws Exception {
		mockMvc.perform(get("/lorem-ipsum"))
		.andExpect(status().isOk());
	}

	@Test
	void getInt() throws Exception {
		mockMvc.perform(get("/get-int"))
		.andExpect(status().isOk());
	}

	@Test
	void postInt() throws Exception {
		mockMvc.perform(get("/get-int-param").param("val", "10"))
			.andExpect(status().isOk())
				.andExpect(content().string("GET: 10"));
	}
	
	@Test
	void postWrongInt() throws Exception {
		mockMvc.perform(get("/get-int-param").param("val", "invalid"))
		.andExpect(status().isBadRequest());
	}

	@Test
	void postDate() throws Exception {
		mockMvc.perform(get("/get-date-param").param("dat", "2026/06/23"))
		.andExpect(status().isOk());
	}

	@Test
	void postWrongDate() throws Exception {
		mockMvc.perform(get("/get-date-param").param("dat", "invalid"))
		.andExpect(status().isBadRequest());
	}
}