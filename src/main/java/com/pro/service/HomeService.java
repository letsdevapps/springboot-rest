package com.pro.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public String getLoremIpsum() {
		return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
				+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
				+ "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
				+ "culpa qui officia deserunt mollit anim id est laborum";
	}

	public int getInt() {
		return (int) (Math.random() * (10 - 1 + 1) + 1);
	}

	public LocalDate getLocalDate() {
		return LocalDate.now();
	}
}