package com.student.data;

import java.util.List;

import org.hl7.fhir.r4.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.data.beans.FetchJsonObject;

@SpringBootTest
class StudentdataApplicationTests {

	@Test
	void contextLoads() throws JsonMappingException, JsonProcessingException {
		String json="[{\"title\":\"Untitledform\",\"subTitle\":\"\",\"fieldType\":\"HEADING\",\"componentType\":\"FORMTITLE\"},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"fieldType\":\"CATEGORY\",\"componentType\":\"CATEGORY\",\"components\":[{\"title\":\"tab1\",\"components\":[{\"title\":\"text\",\"subTitle\":\"\",\"fieldType\":\"SECTION\",\"componentType\":\"SECTION\",\"columns\":2,\"components\":[{\"title\":\"Section\",\"subTitle\":\"\",\"fieldType\":\"HEADING\",\"componentType\":\"FORMTITLE\"},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"CHOICE\",\"componentType\":\"CHOICE\",\"isRequired\":false,\"isMultipleAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false}]}]},{\"title\":\"tab2\",\"components\":[{\"title\":\"text\",\"subTitle\":\"\",\"fieldType\":\"SECTION\",\"componentType\":\"SECTION\",\"columns\":3,\"components\":[{\"title\":\"Section\",\"subTitle\":\"\",\"fieldType\":\"HEADING\",\"componentType\":\"FORMTITLE\"},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"CHOICE\",\"componentType\":\"CHOICE\",\"isRequired\":false,\"isMultipleAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false}]}]}],\"validator\":null,\"asyncValidator\":null},{\"title\":\"text\",\"subTitle\":\"\",\"fieldType\":\"SECTION\",\"componentType\":\"SECTION\",\"columns\":4,\"components\":[{\"title\":\"Section\",\"subTitle\":\"\",\"fieldType\":\"HEADING\",\"componentType\":\"FORMTITLE\"},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"CHOICE\",\"componentType\":\"CHOICE\",\"isRequired\":false,\"isMultipleAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"TEXT\",\"componentType\":\"TEXT\",\"isRequired\":false,\"isLongAnswer\":false}]},{\"title\":\"Question\",\"subTitle\":\"\",\"fieldType\":\"CHOICE\",\"componentType\":\"CHOICE\",\"isRequired\":false,\"isMultipleAnswer\":false}]";
		
		ObjectMapper mapper =new ObjectMapper() .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
List<FetchJsonObject >fto=  mapper.readValue(json, new TypeReference<List<FetchJsonObject>>(){});
for(FetchJsonObject fetch : fto) {
	if(fetch.getComponents()!=null) {
	 for (FetchJsonObject  compo :fetch.getComponents()) {
          System.out.println(compo.getTitle());
	 }
	}

}
	
	}

}
