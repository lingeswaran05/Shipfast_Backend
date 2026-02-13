package com.shipfast.shipment.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shipfast.shipment.entity.enums.Servicetype;
import com.shipfast.shipment.entity.enums.Shipmentstatus;


import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;



@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Document(collection= "shipments")
public class Shipment {
	@Id
    private String id;
	@Indexed(unique = true)
	private Long shipmentId;
	private Long customerId;
	private Shipmentstatus status;
	private Servicetype servicetype;
	private String senderAddress;
	private String receiverAddress;
	private String packageDetails;
	private LocalDate bookingDate;
	private LocalDate estimatedDeliveryDate;
	private LocalDate actualDeliveryDate;
	private String currentLocation;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Shipmentstatus getStatus() {
		return status;
	}
	public void setStatus(Shipmentstatus status) {
		this.status = status;
	}
	public Servicetype getServicetype() {
		return servicetype;
	}
	public void setServicetype(Servicetype servicetype) {
		this.servicetype = servicetype;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getPackageDetails() {
		return packageDetails;
	}
	public void setPackageDetails(String packageDetails) {
		this.packageDetails = packageDetails;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}
	public LocalDate getActualDeliveryDate() {
		return actualDeliveryDate;
	}
	public void setActualDeliveryDate(LocalDate actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

}
