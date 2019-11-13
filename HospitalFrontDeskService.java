package com.rdp.hosptialfrontdesk.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rdp.hosptialfrontdesk.model.Specialist;

@Service
public class HospitalFrontDeskService {
	
	public final static List<Specialist> doctorsAndDetails = populateDoctorsAndDetails();
	
	//Map<String,Specialist> doctorsDetailsByHospital = new HashMap<String,Specialist>();	
	
	
	/*public void loadDoctorsList () {
		doctorsDetailsByHospital.put("Apollo Hospital",new Specialist(1,"","Audiologist",""));
		doctorsDetailsByHospital.put(";Apollo Hospital",new Specialist(2,"","Allergist",""));
		doctorsDetailsByHospital.put("Apollo Hospital",new Specialist(3,"","Anesthesiologist",""));
		doctorsDetailsByHospital.put("Apollo Hospital",new Specialist(4,"","Cardiologist",""));
		doctorsDetailsByHospital.put("Apollo Hospital",new Specialist(5,"","Dentist",""));
		doctorsDetailsByHospital.put("MIOT Hospital",new Specialist(1,"","Audiologist",""));
		doctorsDetailsByHospital.put("MIOT Hospital",new Specialist(2,"","Allergist",""));
		doctorsDetailsByHospital.put("MIOT Hospital",new Specialist(3,"","Anesthesiologist",""));
		doctorsDetailsByHospital.put("MIOT Hospital",new Specialist(4,"","Cardiologist",""));
		doctorsDetailsByHospital.put("MIOT Hospital",new Specialist(5,"","Dentist",""));
		doctorsDetailsByHospital.put("Kauvery Hospital",new Specialist(1,"","Audiologist",""));
		doctorsDetailsByHospital.put("Kauvery Hospital",new Specialist(2,"","Allergist",""));
		doctorsDetailsByHospital.put("Kauvery Hospital",new Specialist(3,"","Anesthesiologist",""));
		doctorsDetailsByHospital.put("Kauvery Hospital",new Specialist(4,"","Cardiologist",""));
		doctorsDetailsByHospital.put("Kauvery Hospital",new Specialist(5,"","Dentist",""));
	}*/
	
	private static List<Specialist> populateDoctorsAndDetails() {
		List<Specialist> doctorsAndDetails = new ArrayList<>();
		doctorsAndDetails.add(new Specialist("Sandhya", "Dentist", "Monday,Wednesday", "5 to 6","Y","946"));
		doctorsAndDetails.add(new Specialist("Saranya", "Dentist", "Monday,Thursday", "6 to 8","N" ,"946"));
		doctorsAndDetails.add(new Specialist("Kumar", "Cardiologist", "Monday,Tuesday", "10 to 12","Y" ,"956"));
		doctorsAndDetails.add(new Specialist("Rajesh", "Cardiologist", "Monday,Friday", "11 to 12","Y" ,"956"));
		doctorsAndDetails.add(new Specialist("Raj", "Dentist", "Tuesday,Wednesday", "2 to 4","N" ,"970"));
		return doctorsAndDetails;
	}

	public Specialist getSpecialistDetails(String hospitalId,String type) {	
		Specialist specialistDetails = null;		
		for (Specialist specialist : doctorsAndDetails) {
			if(specialist.getHospitalId().equalsIgnoreCase(hospitalId) && specialist.getType().equalsIgnoreCase(type)) {
				specialistDetails =  specialist;
			}
		}
		return specialistDetails;
	}
}
