package com.springboot.service.springbootrestclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration parameter values for our service.
 * 
 * @author Tausif Farooqi
 *
 */
@Component
@ConfigurationProperties("rest-client")
public class Configuration {
	private String userName;
	private String password;

	/**
	 * Gets the user name for Basic Auth.
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * Sets the user name for Basic Auth.
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password for Basic Auth.
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password for Basic Auth.
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
