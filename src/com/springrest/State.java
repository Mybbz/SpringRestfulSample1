package com.springrest;
//@XmlRootElement is an annotation that used with JAXB, to uniquely associate a root element with a class
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "state")
@XmlAccessorType(XmlAccessType.NONE)
public class State {
	@XmlElement(name = "name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@XmlElement(name = "code")
	private String code;
	
	
}
