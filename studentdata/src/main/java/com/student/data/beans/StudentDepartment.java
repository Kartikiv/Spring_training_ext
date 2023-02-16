package com.student.data.beans;

import org.hl7.fhir.r4.model.Patient;

public class StudentDepartment {
private Long departmentId;
private String departmentName;

public StudentDepartment() {
	super();

}

public StudentDepartment(Long departmentId, String departmentName) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
}

public Long getDepartmentId() {
	return departmentId;
	
}

public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}


}
