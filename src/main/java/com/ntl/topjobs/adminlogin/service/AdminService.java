package com.ntl.topjobs.adminlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.adminlogin.bean.AdminLogin;
import com.ntl.topjobs.adminlogin.dao.LoginDao;




@Service
public class AdminService {
	
	@Autowired
	LoginDao loginDao;
	
	
	AdminLogin adminLogin;
	
	public AdminService() {
		super();
		adminLogin=new AdminLogin();

}
	public AdminService( LoginDao logindb) {
		super();
		adminLogin =new AdminLogin();
		loginDao=logindb;
	}
	
	public boolean getUser(String email,String password) {
		try {
		AdminLogin tempLogin=loginDao.findById(email).get();
		if(tempLogin.getPassword().equals(password))
		{
			
			return true;
		}
		else return false;
		}
		catch(Exception e)
		{
			System.out.println("failed");
			return false;
		}
		
}
}