package com.student.data.beans;

public class FetchStudentDetailsWithMarksAndDepartmentNames {
	private Long studentId;
	private String name;
	private String address;
	private String cityNm;
	private Long totalMarks;
	private String stage;
	private Long marksId;
	private Long departmentId;
	private String departmentName;
	
	public FetchStudentDetailsWithMarksAndDepartmentNames() {
		super();
		
	}

	public FetchStudentDetailsWithMarksAndDepartmentNames(Long studentId, String name, String address, String cityNm,
			Long totalMarks, String stage, Long marksId, Long departmentId, String departmentName) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.cityNm = cityNm;
		this.totalMarks = totalMarks;
		this.stage = stage;
		this.marksId = marksId;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
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
