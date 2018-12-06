package com.ntl.topjobs.adminlogin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("zuul-app")
public interface AdminProxy {
	@GetMapping("job-application/getAllJobs")
	public List getAllJobs();
	
	@GetMapping("employee-registration/getAllEmployers")
	public List getAllEmployers();
	
	@DeleteMapping("employee-registration/removeEmployer/{id}")
	public ResponseEntity<Object> deleteEmployerById(@PathVariable String id);
	
	@DeleteMapping("job-application/deleteJob/{id}")
	public ResponseEntity<Object> deleteJobById(@PathVariable String id);

}
