package com.spring.sample.gitlabci.endpoint;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitlabCITestResource {

	@GetMapping(value = "com/spring/gitlabcidemo", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<String> getData() {
		return ResponseEntity.ok().body("Hello World");
	}
}
