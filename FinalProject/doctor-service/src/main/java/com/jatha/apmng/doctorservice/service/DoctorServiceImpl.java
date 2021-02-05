package com.jatha.apmng.doctorservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatha.apmng.doctorservice.model.Doctor;
import com.jatha.apmng.doctorservice.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor save(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Optional<Doctor> findById(int id) {
		return doctorRepository.findById(id);
	}

}
