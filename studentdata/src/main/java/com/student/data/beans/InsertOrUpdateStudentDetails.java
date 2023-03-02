package com.student.data.beans;

import java.util.List;
import java.util.Map;

public class InsertOrUpdateStudentDetails {
private Map<String,String>Headers;
private Long orgId;
private List<StudentDto> studentDtoList;


public InsertOrUpdateStudentDetails() {
	super();
}
public InsertOrUpdateStudentDetails(Map<String, String> headers, Long orgId, List<StudentDto> studentDtoList) {
	super();
	this.Headers = headers;
	this.orgId = orgId;
	this.studentDtoList = studentDtoList;
}
public Map<String, String> getHeaders() {
	return Headers;
}
public void setHeaders(Map<String, String> headers) {
	this.Headers = headers;
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