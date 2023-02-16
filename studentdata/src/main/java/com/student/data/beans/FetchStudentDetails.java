package com.student.data.beans;

import java.sql.Date;

public class FetchStudentDetails {
	
	private Integer studentId;
	private String Nm;
	private String address;
	private String mobileNm;
	private String cityNm;
	private String townNm;
	private String districtNm;
	private String villageNm;
	private String birthDate;
	private Long orgId;
	
	public FetchStudentDetails() {
		super();
		
	}
	public FetchStudentDetails(Integer studentId, String nm, String address, String mobileNm, String cityNm,
			String townNm, String districtNm, String villageNm, String birthDate, Long orgId) {
		super();
		this.studentId = studentId;
		Nm = nm;
		this.address = address;
		this.mobileNm = mobileNm;
		this.cityNm = cityNm;
		this.townNm = townNm;
		this.districtNm = districtNm;
		this.villageNm = villageNm;
		this.birthDate = birthDate;
		this.orgId = orgId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getNm() {
		return Nm;
	}
	public void setNm(String nm) {
		Nm = nm;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNm() {
		return mobileNm;
	}
	public void setMobileNm(String mobileNm) {
		this.mobileNm = mobileNm;
	}
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}
	public String getTownNm() {
		return townNm;
	}
	public void setTownNm(String townNm) {
		this.townNm = townNm;
	}
	public String getDistrictNm() {
		return districtNm;
	}
	public void setDistrictNm(String districtNm) {
		this.districtNm = districtNm;
	}
	public String getVillageNm() {
		return villageNm;
	}
	public void setVillageNm(String villageNm) {
		this.villageNm = villageNm;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	
	
	
}
