package com.capestart.module.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class RegisterEntity {
	@Column(name="name")
	private String name;
	@Id
	@Column(name="mobileNo")
	private String moblieNumber;
	@Column(name="mobilePin")
	private int mobilePin;
	@Column(name="flatNo")
	private String flatNumber;
	@Column(name="street")
	private String street;
	@Column(name="villageOrTown")
	private String villageOrTown;
	@Column(name="district")
	private String district;
	@Column(name="pincode")
	private long pincode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoblieNumber() {
		return moblieNumber;
	}
	public void setMoblieNumber(String moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
	public int getMobilePin() {
		return mobilePin;
	}
	public void setMobilePin(int mobilePin) {
		this.mobilePin = mobilePin;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVillageOrTown() {
		return villageOrTown;
	}
	public void setVillageOrTown(String villageOrTown) {
		this.villageOrTown = villageOrTown;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
}
