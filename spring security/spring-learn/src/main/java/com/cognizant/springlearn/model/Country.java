package com.cognizant.springlearn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class Country {

	@NotNull
	@Size(min=2, max=2, message="Country code should be 2 characters" )
	private String code;
	
	private String name;
	static Logger logger=LoggerFactory.getLogger(Country.class);
	
	public Country() {
		logger.info("Inside Country Constructor");
	}

	public String getCode() {
		logger.debug("Inside Country.Code getter");
		return code;
	}

	public void setCode(String code) {
		logger.debug("Inside Country.Code setter");
		this.code = code;
	}

	public String getName() {
		logger.debug("Inside Country.Name getter");
		return name;
	}

	public void setName(String name) {
		logger.debug("Inside Country.Name setter");
		this.name = name;
	}

	@Override
	public String toString() {
	
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
}
