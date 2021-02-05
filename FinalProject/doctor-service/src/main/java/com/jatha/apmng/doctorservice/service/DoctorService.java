package com.jatha.apmng.doctorservice.service;

import java.util.List;
import java.util.Optional;

import com.jatha.apmng.doctorservice.model.Doctor;

public interface DoctorService {
	
	Doctor save(Doctor doctor);
	List<Doctor> findAll();
	Optional<Doctor> findById(int id);

}
