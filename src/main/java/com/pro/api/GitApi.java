package com.pro.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.GitProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/git")
public class GitApi {

	private final GitProperties gitProperties;
	private final String renderCommit;

	public GitApi(@Autowired(required = false) GitProperties gitProperties,
			@Value("${RUNTIME_COMMIT_SHA:unknown}") String renderCommit) {

		this.gitProperties = gitProperties;
		this.renderCommit = renderCommit;
	}

	@GetMapping("/version")
	public Map<String, String> version() {
		if (gitProperties == null) {
			return Map.of("commit", renderCommit);
		}

		return Map.of("commit", gitProperties.getShortCommitId(), "branch", gitProperties.getBranch());
	}
}
