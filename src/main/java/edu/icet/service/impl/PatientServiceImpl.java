package edu.icet.service.impl;

import edu.icet.dto.PatientDto;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service

public class PatientServiceImpl implements PatientService {
    @Override
    public List<PatientDto> getAllPatients() {
        return List.of();
    }

    @Override
    public boolean addPatient(PatientDto patientDto) {
        return false;
    }

    @Override
    public boolean updatePatient(PatientDto patientDto) {
        return false;
    }

    @Override
    public boolean deletePatient(Integer id) {
        return false;
    }

    @Override
    public PatientDto searchPatient(Integer id) {
        return null;
    }
}
