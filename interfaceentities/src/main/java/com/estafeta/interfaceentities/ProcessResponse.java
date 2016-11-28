package com.estafeta.interfaceentities;

import java.io.Serializable;
import java.util.Date;


public class ProcessResponse implements Serializable {

	private String processID;
	private int dispatchNumber;
	private String businessCode;
	private Date processDate;
	private String destinationSystem;
	private String destinationSystemVersion;
	private String transmissionNumber;
	private boolean isFinalResponse;
	private StatusResponse statusResponse;
	
	
	/**
	   * This is the method for getting the unique ID generated for the process of the request.
	   * @return ProcessID.
	   */
	public String getProcessID() {
		return processID;
	}
	/**
	   * This is the method for setting the unique ID generated for the process of the request.
	   * @param ProcessID.
	   */
	public void setProcessID(String processID) {
		this.processID = processID;
	}
	/**
	   * This is the method for getting the number of requests sends to the destination with the same processID.
	   * In the first request the dispatch number is zero.
	   * When a retry request is sent, the dispatch number is greater than zero. 
	   * @return ProcessID.
	   */
	public int getDispatchNumber() {
		return dispatchNumber;
	}
	/**
	   * This is the method for setting the number of requests send to the destination with the same processID 
	   * @param DispatchNumber: The dispatchNumber is controlled by the processor according to the retries in case of 
	   * connectivity problems or manual retry when in the TrackingLog request the processID is sent.
	   */
	public void setDispatchNumber(int dispatchNumber) {
		this.dispatchNumber = dispatchNumber;
	}
	/**
	   * This is the method for getting the business code of the request. A significant code for the business.
	   * @return BusinessCode.
	   */
	public String getBusinessCode() {
		return businessCode;
	}
	/**
	   * This is the method for setting the business code. A significant code for the business.
	   * @param BusinessCode.
	   */
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	/**
	   * This is the method for getting the response date after processing. If the request was not sent to the destination 
	   * for connectivity problems or error in validations, the process date is set by the processor, in other case by the destination
	   * @return ProcessDate.
	   */
	public Date getProcessDate() {
		return processDate;
	}
	/**
	   * This is the method for setting the process date. If the request was not sent to the destination 
	   * for connectivity problems or error in validations, the process date is set by the processor, in other case by the destination
	   * @param ProcessDate.
	   */
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	/**
	   * This is the method for getting the name of the system who process the request. If the request was not sent to the destination,
	   * this field will be empty.
	   * @return DestinationSystem.
	   */
	public String getDestinationSystem() {
		return destinationSystem;
	}
	/**
	   * This is the method for setting the name of the system who process the request. If the request was not sent to the destination,
	   * this field will be empty.
	   * @param DestinationSystem.
	   */
	public void setDestinationSystem(String destinationSystem) {
		this.destinationSystem = destinationSystem;
	}
	/**
	   * This is the method for getting the version of the system who process the request.
	   * @return DestinationSystemVersion.
	   */

	public String getDestinationSystemVersion() {
		return destinationSystemVersion;
	}
	/**
	   * This is the method for setting the version of the system who process the request.
	   * this field will be empty.
	   * @param DestinationSystemVersion.
	   */
	public void setDestinationSystemVersion(String destinationSystemVersion) {
		this.destinationSystemVersion = destinationSystemVersion;
	}
	/**
	   * This is the method for getting the transmission number sent by the destination.
	   * @return TransmissionNumber.
	   */
	public String getTransmissionNumber() {
		return transmissionNumber;
	}
	/**
	   * This is the method for setting the transmission number sent by the destination.
	   * @param TransmissionNumber.
	   */
	public void setTransmissionNumber(String transmissionNumber) {
		this.transmissionNumber = transmissionNumber;
	}
	/**
	   * This is the method for getting the final response field. Is true if is a synchronous response or is the asynchronous final response. 
	   * Is false if is the confirmation of the destination that the request has been received in an asynchronous communication.
	   * @return IsFinalResponse.
	   */
	public boolean isFinalResponse() {
		return isFinalResponse;
	}
	/**
	   * This is the method for setting the final response field. Is true if is a synchronous response or is the asynchronous final response. 
	   * Is false if is the confirmation of the destination that the request has been received in an asynchronous communication.
	   * @param IsFinalResponse.
	   */
	public void setFinalResponse(boolean isFinalResponse) {
		this.isFinalResponse = isFinalResponse;
	}
	/**
	   * This is the method for getting the status of the response. The status will show if the processing was satisfactory or there was an error.
	   * @return StatusResponse.
	   */
	public StatusResponse getStatusResponse() {
		return statusResponse;
	}
	/**
	   * This is the method for setting the status of the response. The status will show if the processing was satisfactory or there was an error.
	   * @param StatusResponse.
	   */
	public void setStatusResponse(StatusResponse statusResponse) {
		this.statusResponse = statusResponse;
	}
	
	
	
}
