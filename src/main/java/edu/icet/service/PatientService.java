package edu.icet.service;

import edu.icet.model.Patients;

import java.util.List;

public interface PatientService {
    List<Patients> getAllPatients();
    boolean addPatient(Patients patientDto);
    boolean updatePatient(Patients patientDto);
    boolean deletePatient(Integer id);
    Patients searchPatient(String id);
}
