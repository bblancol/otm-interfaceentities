package com.estafeta.interfaceentities;

import java.io.Serializable;
import java.util.Date;

public class TrackingRecord implements Serializable{
	private Integer requestId;
	private Integer deliveryNumber;
	private String businessNumber;
	private System sourceSystem;
	private String operationExecuted;
	private StatusResponse statusResponse;
	private Integer destinationClientNumber;
	private Integer numberOfResponses;
	private Integer numberOfErrors;
	private Integer numberOfPendingResponses;
	private User user;
	private String ip;
	private Date registerDate;
	private Date updateDate;
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
	public System getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(System sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getOperationExecuted() {
		return operationExecuted;
	}
	public void setOperationExecuted(String operationExecuted) {
		this.operationExecuted = operationExecuted;
	}
	public StatusResponse getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(StatusResponse statusResponse) {
		this.statusResponse = statusResponse;
	}
	public Integer getDestinationClientNumber() {
		return destinationClientNumber;
	}
	public void setDestinationClientNumber(Integer destinationClientNumber) {
		this.destinationClientNumber = destinationClientNumber;
	}
	public Integer getNumberOfResponses() {
		return numberOfResponses;
	}
	public void setNumberOfResponses(Integer numberOfResponses) {
		this.numberOfResponses = numberOfResponses;
	}
	public Integer getNumberOfErrors() {
		return numberOfErrors;
	}
	public void setNumberOfErrors(Integer numberOfErrors) {
		this.numberOfErrors = numberOfErrors;
	}
	public Integer getNumberOfPendingResponses() {
		return numberOfPendingResponses;
	}
	public void setNumberOfPendingResponses(Integer numberOfPendingResponses) {
		this.numberOfPendingResponses = numberOfPendingResponses;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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
