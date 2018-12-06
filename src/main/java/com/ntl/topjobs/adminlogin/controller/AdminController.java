/**File name=AdminLogin
 * Author=Govind Singh
 * Date=27/12/2018
 */


package com.ntl.topjobs.adminlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.adminlogin.service.AdminProxy;
import com.ntl.topjobs.adminlogin.service.AdminService;


@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	AdminProxy proxy;
	
	
	public AdminController() {
		super();		
	}

	public AdminController(AdminService sc) {
		super();		
		adminService=sc;
	}
	
	
	@GetMapping("/admin/login/{id}/{password}")
	public boolean login(@PathVariable("id") String id, @PathVariable("password") String password) {
		
		if(adminService.getUser(id, password) == true) {
			return true;
		} else
			return false;
	}
	
	@GetMapping("/admin/viewJobs")
	public List displayAllJobs() {
		
		return proxy.getAllJobs();
	}
	
	@GetMapping("/admin/viewAllEmployers")
	public List displayAllEmployers() {
		return proxy.getAllEmployers();
	}
	
	@DeleteMapping("/admin/deleteEmployer/{empId}")
	public ResponseEntity<Object> deleteEmployerById(@PathVariable String empId){
		proxy.deleteEmployerById(empId);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/admin/deleteJob/{jobId}")
	public ResponseEntity<Object> deleteJobsById(@PathVariable String jobId){
		
	return proxy.deleteJobById(jobId);
	}
 }
