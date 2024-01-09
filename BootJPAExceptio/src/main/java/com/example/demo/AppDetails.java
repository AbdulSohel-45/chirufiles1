package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="application")
@Component
public class AppDetails 
{
	private String email;
	private String phn;
	private AppDefault appdefault;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public AppDefault getAppdefault() {
		return appdefault;
	}
	public void setAppdefault(AppDefault appdefault) {
		this.appdefault = appdefault;
	}
	@Override
	public String toString() {
		return "AppDetails [email=" + email + ", phn=" + phn + ", appdefault=" + appdefault + "]";
	}
	
}
