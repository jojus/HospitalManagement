package com.rdp.hosptialfrontdesk.model;

public class InvalidHospitalNameException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidHospitalNameException(String message) {
		super(message);
	}
	
}
