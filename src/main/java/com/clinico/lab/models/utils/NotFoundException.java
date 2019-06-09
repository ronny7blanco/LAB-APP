package com.clinico.lab.models.utils;

public class NotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public NotFoundException(String exception) {
		super(exception);
	}
}
