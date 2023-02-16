package com.student.data.beans;

import java.util.List;

public class InsertOrUpdateStudentDetails {
private Long orgId;
private List<StudentDto> studentDtoList;

public InsertOrUpdateStudentDetails() {
	super();
}
public InsertOrUpdateStudentDetails(Long orgId, List<StudentDto> studentDtoList) {
	super();
	this.orgId = orgId;
	this.studentDtoList = studentDtoList;
}
public Long getOrgId() {
	return orgId;
}
public void setOrgId(Long orgId) {
	this.orgId = orgId;
}
public List<StudentDto> getStudentDtoList() {
	return studentDtoList;
}
public void setStudentDtoList(List<StudentDto> studentDtoList) {
	this.studentDtoList = studentDtoList;
}


}
