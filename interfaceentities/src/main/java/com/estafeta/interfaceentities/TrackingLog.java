package com.estafeta.interfaceentities;

import java.io.Serializable;
import java.util.Date;

public class TrackingLog implements Serializable{
	private Integer systemId;
	private String system;
	private String version;
	private String ip;
	private String user;
	private Date eventDate;
	private String processID;
	
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getProcessID() {
		return processID;
	}
	public void setProcessID(String processID) {
		this.processID = processID;
	}
	
	
}
