package com.kloudone.jobfilter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {
	
	@Bean
	public RestTemplate RestTemplate() {
		return new RestTemplate();
		
	}
}
