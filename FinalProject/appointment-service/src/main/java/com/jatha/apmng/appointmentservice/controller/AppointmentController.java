package com.jatha.apmng.appointmentservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.apmng.appointmentservice.model.Appointment;
import com.jatha.apmng.appointmentservice.model.Hospital;
import com.jatha.apmng.appointmentservice.service.AppointmentService;

@RestController
@RequestMapping("/aptservice")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	
	@PostMapping("/appointments")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
		
		return appointmentService.save(appointment);
    }
	
	@GetMapping("/appointments")
	public List<Appointment> findAllAppointments() {
		
		return appointmentService.findAll();
		
	}
	
	@GetMapping("/appointments/{id}")
	public Optional<Appointment> findById(@PathVariable("id") int id) {
		return appointmentService.findById(id);
	}
	
	@DeleteMapping("/appointments/{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable("id") int id) {
        return appointmentService.deleteAppointment(id);
    }
	
	/*--------------------------*/
	
	@GetMapping("/hospitals")
	public List<Hospital> findByHospitalName(@RequestParam(value = "hosName") String hosName) {
		return appointmentService.findByHospitalName(hosName);
	}
	

}
