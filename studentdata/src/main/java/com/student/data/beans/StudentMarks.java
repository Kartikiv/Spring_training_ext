package com.student.data.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentMarks {
	private Long totalMarks;
	private String stage;
	private Long marksId;
	
	

}