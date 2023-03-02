package com.student.data.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.DocumentException;
import com.student.data.beans.FetchStudentDetails;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartmentNamesWithNoReplications;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartmentWithNoReplications;
import com.student.data.beans.HtmlConvert;
import com.student.data.beans.InsertOrUpdateStudentDetails;
import com.student.data.beans.InsertStudentDetails;
import com.student.data.beans.InsertStudentDetailsWithDepartment;
import com.student.data.beans.PDFGenerator;
import com.student.data.beans.UpdateStudentDetails;
import com.student.data.service.StudentService;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
    HttpServletResponse reponse=new Response();
    
	@GetMapping("/getpojo")
	public InsertOrUpdateStudentDetails get(HttpServletResponse request,@RequestBody InsertOrUpdateStudentDetails InsertOrUpdateStudentDetails) {
		
//		reponse.setStatus(HttpServletResponse.SC_ACCEPTED);
//		reponse.setHeader("kar","ull");
		
		//reponse.getHeader("kar");

		return InsertOrUpdateStudentDetails;
	}

	@PostMapping("/studentdetailswithmarksanddepartment")
	public List<FetchStudentDetailsWithMarksAndDepartmentNamesWithNoReplications> studentDetailsWithMarksAndDepartment() {
		return studentService.studentDetailsWithMarksAndDepartment();
	}

	@PostMapping("/studentdetailswithmarks")
	public List<FetchStudentDetailsWithMarksAndDepartmentWithNoReplications> studentDetailsWithMarks() {
		return studentService.studentDetailsWithMarks();
	}

	@PostMapping("/fetchStudentDetailsUsingList")
	public List<Map<String, Object>> fetchStudentDetailsUsingQueryForList(
			@RequestBody FetchStudentDetails fetchStudentDetails) {
		return studentService.fetchStudentDetailsUsingQueryForList(fetchStudentDetails);
	}

	@PostMapping("/fetchStudentDetailsUsingMap")
	public ResponseEntity<Object> fetchStudentDetailsUsingMap(@RequestBody FetchStudentDetails fetchStudentDetails) {
		return new ResponseEntity<Object>(studentService.fetchStudentDetailsUsingQueryForMap(fetchStudentDetails),
				HttpStatus.ACCEPTED);
	}

	@PostMapping("/fetchstudentdetailsusingquery")
	public ResponseEntity<Object> fetchStudentDetailsUsingQuery(@RequestBody FetchStudentDetails fetchStudentDetails) {
		return new ResponseEntity<Object>(studentService.fetchStudentDetailsUsingQuery(fetchStudentDetails),
				HttpStatus.ACCEPTED);
	}

	@PostMapping("/fetchstudentdetailsusingid")
	public ResponseEntity<Object> fetchStudentDetailsUsingId(@RequestBody FetchStudentDetails FetchStudentDetails) {
		return new ResponseEntity<Object>(studentService.fetchStudentDetailsUsingId(FetchStudentDetails),
				HttpStatus.ACCEPTED);
	}

	@PostMapping("/insertorupdatestudentdetailsjdbc")
	public Boolean insertOrUpdateStudentDetailsJdbc(
			@RequestBody InsertOrUpdateStudentDetails insertOrUpdateStudentDetails) {
		return studentService.insertOrUpdateStudentDetailsJdbc(insertOrUpdateStudentDetails);
	}

	@PostMapping("/insertorupdatestudentdetails")
	public Boolean insertOrUpdateStudentDetails(
			@RequestBody InsertOrUpdateStudentDetails insertOrUpdateStudentDetails) {
		return studentService.insertOrUpdateStudentDetails(insertOrUpdateStudentDetails);
	}

	@PostMapping("/batchupdateusingsqlparam")
	public Boolean batchUpdateUsingSqlParamSource(@RequestBody List<InsertStudentDetails> ins) {
		return studentService.batchUpdateUsingSqlParamSource(ins);
	}

	@PostMapping("/batchjdbc")
	public Boolean batchUpdateStudentsdetailsUsingSetter(@RequestBody List<InsertStudentDetails> ins) {
		return studentService.batchUpdateUsingBatchSetter(ins);
	}

	@PostMapping("/batchupdatestudentdetails")
	public Boolean batchUpdateStudentsdetails(@RequestBody List<InsertStudentDetails> ins) {
		return studentService.batchUpdateStudentDetails(ins);
	}

	@PostMapping("/insertstudentdetailsusingmap")
	public Boolean insertStudentDetailsUsingMap(@RequestBody InsertStudentDetails ins) {
		return studentService.insertStudentDetailsUsingMap(ins);
	}

	@PostMapping("/insertstudentdetailsusingmapsqlParam")
	public Boolean insertStudentDetailsUsingMapSqlParam(@RequestBody InsertStudentDetails ins) {
		return studentService.insertStudentDetailsUsingMapSqlParam(ins);
	}

	@PostMapping("/insertstudentdetailsUsingbeanproperysqlparam")
	public Boolean insertStudentDetailsUsingBeanProperySqlparam(@RequestBody InsertStudentDetails ins) {
		return studentService.insertStudentDetailsUsingBeanProperySqlparam(ins);
	}

	@PutMapping("/updatestudentdetails")
	public Boolean update(@RequestBody UpdateStudentDetails updateStudentDetails) {
		System.out.println(updateStudentDetails.getStudentId());
		return studentService.updateStudentDetails(updateStudentDetails);
	}

	@PostMapping("/insertintowithreturningkey")
	public Boolean insertWithKeyHolder(@RequestBody List<InsertStudentDetailsWithDepartment> ins) {
		return studentService.insertStudentDetailsWithKeyHolder(ins);

	}

	@GetMapping("/inv")
	public InsertStudentDetails get(@RequestBody InsertStudentDetails inv) {
		return inv;
	}

	@GetMapping("/g")
	public UpdateStudentDetails up(UpdateStudentDetails up) {
		return up;
	}

	@GetMapping("/patient")
	public String getPatient(Patient patient) {
		FhirContext ctx = FhirContext.forR4();
		patient = new Patient();
		patient.addExtension();
		Extension extension = new Extension();
		extension.setUrl("https://example.org/fhir/StructureDefinition/patient-personalInformation");
		extension.addExtension("maritalStatus", new StringType("Married"));
		extension.addExtension("occupation", new StringType("Doctor"));
		patient.addExtension(extension);
		patient.addContact().addTelecom().setSystem(ContactPointSystem.PHONE).setValue("9346964842");
		patient.addContact().addTelecom().setSystem(ContactPointSystem.EMAIL).setValue("manjackle6@gmail.COM");
		patient.addAddress().setCity("hyderabad").setCountry("India").setDistrict("RR");
		patient.addName().setFamily("FamilyName").addGiven("GivenName1").addGiven("GivenName2").setId("1")
				.addExtension();
		IParser parser = ctx.newJsonParser();
		return parser.encodeResourceToString(patient);
	}
	@GetMapping("/pdf")
	public ResponseEntity<InputStreamResource> generatePdfReport() throws IOException, DocumentException {
		
	    ByteArrayInputStream bis = PDFGenerator.generatePdf();

	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Disposition", "inline; filename=report.pdf");

	    return ResponseEntity
	            .ok()
	            .headers(headers)
	            .contentType(MediaType.APPLICATION_PDF)
	            .body(new InputStreamResource(bis));
	}
	@GetMapping("/html")
	
	public ResponseEntity<InputStreamResource> generatehtml() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HtmlConvert conv=new HtmlConvert();
		 ByteArrayInputStream bis = conv.convert();
		 HttpHeaders headers = new HttpHeaders();
		    headers.add("Content-Disposition", "inline; filename=report.pdf");

		    return ResponseEntity
		            .ok()
		            .headers(headers)
		            .contentType(MediaType.APPLICATION_PDF)
		            .body(new InputStreamResource(bis));
		}
		 
	
	
}
