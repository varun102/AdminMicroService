/**File name=AdminLogin
 * Author=Govind Singh
 * Date=27/12/2018
 */

package com.ntl.topjobs.adminlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.ntl.topjobs.adminlogin")
public class AdminformApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminformApplication.class, args);
		
		System.out.println("Entered");
	}

}
