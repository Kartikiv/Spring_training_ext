package com.student.data.beans;

public class StudentMarks {
	private Long totalMarks;
	private String stage;
	private Long marksId;
	
	public StudentMarks() {
		super();
		
	}
	public StudentMarks(Long totalMarks, String stage, Long marksId) {
		super();
		this.totalMarks = totalMarks;
		this.stage = stage;
		this.marksId = marksId;
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
