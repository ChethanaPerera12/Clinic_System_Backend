package edu.icet.service.impl;

import edu.icet.model.Patients;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service

public class PatientServiceImpl implements PatientService {

    @Override
    public List<Patients> getAllPatients() {
        return List.of();
    }

    @Override
    public boolean addPatient(Patients patients) {
        return false;
    }

    @Override
    public boolean updatePatient(Patients patients) {
        return false;
    }

    @Override
    public boolean deletePatient(Integer id) {
        return false;
    }

    @Override
    public Patients searchPatient(String id) {
        return null;
    }
}
