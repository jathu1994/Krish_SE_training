package com.jatha.apmng.doctorservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jatha.apmng.doctorservice.model.Doctor;
import com.jatha.apmng.doctorservice.repository.DoctorRepository;
import com.jatha.apmng.doctorservice.repository.DoctorSpecialityRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	DoctorSpecialityRepository doctorSpecialityRepository; 

	@Override
	public Doctor save(Doctor doctor,int typeId) {
		
		return doctorSpecialityRepository.findById(typeId).map(doctorSpeciality -> {
			doctor.setDoctorSpeciality(doctorSpeciality);
            return doctorRepository.save(doctor);
        }).orElse(null);
	}

	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Optional<Doctor> findById(int id) {
		return doctorRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> deleteDoctor(int doctorId) {
		return doctorRepository.findById(doctorId).map(doctor -> {
			doctorRepository.delete(doctor);
            return ResponseEntity.ok().build();
        }).orElse(null);
	}

}
