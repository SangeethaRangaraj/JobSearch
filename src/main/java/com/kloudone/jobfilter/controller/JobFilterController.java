package com.kloudone.jobfilter.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kloudone.jobfilter.model.JobModel;


@RestController

public class JobFilterController {
	
		@Autowired
		RestTemplate template;
		
			@SuppressWarnings({ "unchecked", "unused", "null" })
			@PostMapping("/filter")
			public List<String> filter(@RequestBody Map<String,String> param){
		
			String skill=param.get("skill");
			String location = param.get("location");
			String experience =param.get("experience");
			String jobDesc = param.get("jobDesc");
			List<JobModel> job=template.getForObject("http://localhost:8300/jobsearch?skill="+skill, List.class);
			
			
			return job.stream().map(s -> s.getLocation()).filter(loc -> loc.equals(location)).collect(Collectors.toList());
			
			}

}
