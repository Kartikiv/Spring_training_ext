package com.student.data.beans;

import java.sql.Date;
//pojo
public class InsertStudentDetails {
	private String firstNm;
	private String middleNm;
	private String lastNm;
	private String address;
	private String mobileNm;
	private String cityNm;
	private String townNm;
	private String districtNm;
	private String villageNm;
	private Date birthDate;
	private Long orgId;

	public InsertStudentDetails() {
		super();
	}

	public InsertStudentDetails(String firstNm, String middleNm, String lastNm, String address, String mobileNm,
			String cityNm, String townNm, String districtNm, String villageNm, Date birthDate, Long orgId) {
		super();
		this.firstNm = firstNm;
		this.middleNm = middleNm;
		this.lastNm = lastNm;
		this.address = address;
		this.mobileNm = mobileNm;
		this.cityNm = cityNm;
		this.townNm = townNm;
		this.districtNm = districtNm;
		this.villageNm = villageNm;
		this.birthDate = birthDate;
		this.orgId = orgId;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getMiddleNm() {
		return middleNm;
	}

	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

}