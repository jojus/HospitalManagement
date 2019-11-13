package com.rdp.hosptialfrontdesk.controller;

import static com.rdp.hosptialfrontdesk.constants.ApplicationConstants.INVALID_HOSPITAL_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdp.hosptialfrontdesk.model.InvalidHospitalNameException;
import com.rdp.hosptialfrontdesk.model.Specialist;
import com.rdp.hosptialfrontdesk.service.HospitalFrontDeskService;;

@RestController
@RequestMapping(value= { "${hms.parenturl}" })
public class HospitalFrontDeskController {

	@Autowired
	HospitalFrontDeskService hospitalService;

	@GetMapping(value = "${hms.retrievespecialist}")
	public Specialist specialistList(@PathVariable("id") String hospitalId, @PathVariable("type") String specialistType,
			Specialist specialist) throws InvalidHospitalNameException {
		System.out.println("retrieve specialist " + hospitalId + specialistType);
		if (hospitalId != null && specialistType != null) {
			specialist = hospitalService.getSpecialistDetails(hospitalId, specialistType);
		} else {
			System.out.println("Hospital name and specialist name should not be empty !!!");
			throw new InvalidHospitalNameException(INVALID_HOSPITAL_NAME);
		}
		return specialist;
	}
}
