package com.student.data.beans;

import java.util.List;

public class FetchJsonObject {
	private String title;
	private String componentType;
	private String value;
	private String fieldType;
	private List<FetchJsonObject> components;
     
	
	
	

	public FetchJsonObject(String title, String componentType, String value, String fieldType,
			List<FetchJsonObject> components) {
		super();
		this.title = title;
		this.componentType = componentType;
		this.value = value;
		this.fieldType = fieldType;
		this.components = components;
	}

	public FetchJsonObject() {
		super();
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<FetchJsonObject> getComponents() {
		return components;
	}

	public void setComponents(List<FetchJsonObject> components) {
		this.components = components;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

}
