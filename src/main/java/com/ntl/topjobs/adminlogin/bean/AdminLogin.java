/**File name=AdminLogin
 * Author=Govind Singh
 * Date=27/12/2018
 */


package com.ntl.topjobs.adminlogin.bean;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminLogin {

	
	@Id
	private String email;
	private String password;
	/**
	 * 
	 */
	public AdminLogin() {
		super();
	}
	/**
	 * @param email
	 * @param password
	 */
	public AdminLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AdminLogin [email=" + email + ", password=" + password + "]";
	}
	
	
	
}
