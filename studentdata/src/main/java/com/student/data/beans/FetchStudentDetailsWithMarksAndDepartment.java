package com.student.data.beans;

public class FetchStudentDetailsWithMarksAndDepartment {
private Long studentId;
private String name;
private String address;
private String cityNm;
private Long totalMarks;
private String stage;
private Long marksId;


public FetchStudentDetailsWithMarksAndDepartment() {
	super();
	
}
public FetchStudentDetailsWithMarksAndDepartment(Long studentId, String name, String address, String cityNm,
		Long totalMarks, String stage, Long marksId) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.address = address;
	this.cityNm = cityNm;
	this.totalMarks = totalMarks;
	this.stage = stage;
	this.marksId = marksId;
}
public Long getStudentId() {
	return studentId;
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCityNm() {
	return cityNm;
}
public void setCityNm(String cityNm) {
	this.cityNm = cityNm;
}
public Long getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(Long totalMarks) {
	this.totalMarks = totalMarks;
}
public String getStage() {
	return stage;
}
public void setStage(String stage) {
	this.stage = stage;
}
public Long getMarksId() {
	return marksId;
}
public void setMarksId(Long marksId) {
	this.marksId = marksId;
}

}
