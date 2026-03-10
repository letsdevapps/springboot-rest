package com.pro.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pro.service.HomeService;

@RestController
@RequestMapping("/api/home")
public class HomeApi {

	@Autowired
	private HomeService homeService;

	@GetMapping({ "", "/" })
	public String index() {
		return "Api Home está acessível!";
	}

	@GetMapping("/lorem-ipsum")
	public ResponseEntity<String> getLoremIpsum() {
		return ResponseEntity.ok(homeService.getLoremIpsum());
	}

	@GetMapping("/get-int")
	public ResponseEntity<Integer> getInt() {
		return ResponseEntity.ok(homeService.getInt());
	}

	@GetMapping("/get-int-param")
	public ResponseEntity<String> postInt(@RequestParam int val) {
		return ResponseEntity.ok("GET: " + val);
	}

	@GetMapping("/get-date")
	public ResponseEntity<LocalDate> getDate() {
		return ResponseEntity.ok(homeService.getLocalDate());
	}

	@GetMapping("/get-date-param")
	public ResponseEntity<String> postDate(@RequestParam String dat) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(dat, formatter);
			return ResponseEntity.ok("POST: " + date);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Erro: Data inválida");
		}
	}
}