package com.jatha.apmng.doctorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jatha.apmng.doctorservice.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
