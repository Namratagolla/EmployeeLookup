package com.atmecs.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorDetails {

	private String errormessage;
	private String errorcode;
	private String documentation;
	
	public ErrorDetails(){
		
	}
	
	public ErrorDetails(String errormessage, String errorcode, String documentation) {
		super();
		this.errormessage = errormessage;
		this.errorcode = errorcode;
		this.documentation = documentation;
	}

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
}
