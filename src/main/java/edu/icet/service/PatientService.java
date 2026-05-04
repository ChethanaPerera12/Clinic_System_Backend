package edu.icet.service;

import edu.icet.dto.PatientDto;

import java.util.List;

public interface PatientService {
    List<PatientDto> getAllPatients();
    boolean addPatient(PatientDto patientDto);
    boolean updatePatient(PatientDto patientDto);
    boolean deletePatient(Integer id);
    PatientDto searchPatient(Integer id);
}
