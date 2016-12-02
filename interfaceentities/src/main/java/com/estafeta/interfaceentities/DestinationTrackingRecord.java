package com.estafeta.interfaceentities;

import java.io.Serializable;
import java.util.Date;

public class DestinationTrackingRecord implements Serializable{
	private Integer id;
	private Integer requestId;
	private Integer deliveryNumber;
	private String businessNumber;
	private System destinationSystem;
	private Date responseDate;
	private StatusResponse statusResponse;
	private Integer transmissionNumber;
	private String sentObject;
	private boolean isFinalResponse;
	private String servicePath;
	private User senderUser;
	private Date registerDate;
	private Date updateDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public Integer getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(Integer deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public System getDestinationSystem() {
		return destinationSystem;
	}
	public void setDestinationSystem(System destinationSystem) {
		this.destinationSystem = destinationSystem;
	}
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	public StatusResponse getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(StatusResponse statusResponse) {
		this.statusResponse = statusResponse;
	}
	public Integer getTransmissionNumber() {
		return transmissionNumber;
	}
	public void setTransmissionNumber(Integer transmissionNumber) {
		this.transmissionNumber = transmissionNumber;
	}
	public String getSentObject() {
		return sentObject;
	}
	public void setSentObject(String sentObject) {
		this.sentObject = sentObject;
	}
	public boolean isFinalResponse() {
		return isFinalResponse;
	}
	public void setFinalResponse(boolean isFinalResponse) {
		this.isFinalResponse = isFinalResponse;
	}
	public String getServicePath() {
		return servicePath;
	}
	public void setServicePath(String servicePath) {
		this.servicePath = servicePath;
	}
	public User getSenderUser() {
		return senderUser;
	}
	public void setSenderUser(User senderUser) {
		this.senderUser = senderUser;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
