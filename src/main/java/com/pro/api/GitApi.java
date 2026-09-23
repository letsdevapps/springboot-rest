package com.pro.api;

import java.util.Map;

import org.springframework.boot.info.GitProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/git")
public class GitApi {

	private final GitProperties gitProperties;

	public GitApi(GitProperties gitProperties) {
		this.gitProperties = gitProperties;
	}

	@GetMapping
	public GitProperties index() {
		return gitProperties;
	}

	@GetMapping("/version")
	public Map<String, String> version() {
		return Map.of("commit", gitProperties.getShortCommitId(), "branch", gitProperties.getBranch());
	}
}
