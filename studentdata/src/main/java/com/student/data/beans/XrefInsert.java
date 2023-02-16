package com.student.data.beans;

public class XrefInsert {
	private Long studentId;
	private Long departmentId;
	private Long orgId;

	public XrefInsert() {
		super();

	}

	public XrefInsert(Long studentId, Long departmentId, Long orgId) {
		super();
		this.studentId = studentId;
		this.departmentId = departmentId;
		this.orgId = orgId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

}