package com.techjivaa.fhirR4JsonConverter.patientrepository;

import com.techjivaa.fhirR4JsonConverter.patient.MstPatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MstPatientRepository extends JpaRepository<MstPatient, Integer> {
}
