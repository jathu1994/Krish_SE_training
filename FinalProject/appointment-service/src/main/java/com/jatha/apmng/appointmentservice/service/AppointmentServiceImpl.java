package com.jatha.apmng.appointmentservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jatha.apmng.appointmentservice.model.Appointment;
import com.jatha.apmng.appointmentservice.model.Hospital;
import com.jatha.apmng.appointmentservice.model.HospitalList;
import com.jatha.apmng.appointmentservice.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> findAll() {
		return appointmentRepository.findAll();
	}

	@Override
	public Optional<Appointment> findById(int id) {
		return appointmentRepository.findById(id);
	}

	@Override
	public ResponseEntity<?> deleteAppointment(int id) {
		return appointmentRepository.findById(id).map(appointment -> {
			appointmentRepository.delete(appointment);
            return ResponseEntity.ok().build();
        }).orElse(null);
	}
	
	@Override
	public List<Hospital> findByHospitalName(String hosName) {
		ResponseEntity<Hospital[]> response = restTemplate.getForEntity("http://localhost:9193/hosservices/hospitals?hosName="+hosName,Hospital[].class);
		Hospital[] hospitals = response.getBody();
		
		List<Hospital> list = Arrays.asList(hospitals);
				
		return list;
	}
	
	

}
