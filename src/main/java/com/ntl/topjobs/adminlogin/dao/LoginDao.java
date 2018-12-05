/**File name=AdminLogin
 * Author=Govind Singh
 * Date=27/12/2018
 */


package com.ntl.topjobs.adminlogin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntl.topjobs.adminlogin.bean.AdminLogin;

public interface LoginDao extends JpaRepository<AdminLogin, String> {

}
