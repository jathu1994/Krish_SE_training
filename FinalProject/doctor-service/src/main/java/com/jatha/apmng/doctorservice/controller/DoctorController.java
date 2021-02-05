package com.jatha.apmng.doctorservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.apmng.doctorservice.model.Doctor;
import com.jatha.apmng.doctorservice.model.DoctorSpeciality;
import com.jatha.apmng.doctorservice.service.DoctorService;
import com.jatha.apmng.doctorservice.service.DoctorSpecialityService;

@RestController
@RequestMapping(value = "/services")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	DoctorSpecialityService doctorSpecialityService;
	
	
	@RequestMapping(value = "/doctors",method = RequestMethod.POST)
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		
		return doctorService.save(doctor);
		
	}
	
	@RequestMapping(value = "/doctors",method = RequestMethod.GET)
	public List<Doctor> findAllDoctors() {
		
		return doctorService.findAll();
		
	}
	
	@RequestMapping(value = "/doctors/{id}",method = RequestMethod.GET)
	public Optional<Doctor> findDoctorById(@PathVariable(value="id") int id) {
		
		return doctorService.findById(id);
		
	}
	
//	Doctor type services
	@RequestMapping(value = "/doctortypes",method = RequestMethod.POST)
	public DoctorSpeciality saveDoctorType(@RequestBody DoctorSpeciality doctorSpeciality) {
		
		return doctorSpecialityService.save(doctorSpeciality);
		
	}
	
	@RequestMapping(value = "/doctortypes",method = RequestMethod.GET)
	public List<DoctorSpeciality> findAll() {
		
		return doctorSpecialityService.findAll();
		
	}
	
	@RequestMapping(value = "/doctortypes/{id}",method = RequestMethod.GET)
	public Optional<DoctorSpeciality> findById(@PathVariable(value="id") int id) {
		
		return doctorSpecialityService.findById(id);
		
	}

}
