package edu.icet.service.impl;

import edu.icet.model.Doctors;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorServiceImpl implements DoctorService {

    @Override
    public List<Doctors> getAllDoctors() {
        return List.of();
    }

    @Override
    public boolean addDoctor(Doctors doctors) {
        return false;
    }

    @Override
    public boolean updateDoctor(Doctors doctors) {
        return false;
    }

    @Override
    public boolean deleteDoctor(Integer id) {
        return false;
    }

    @Override
    public Doctors searchDoctor(String id) {
        return null;
    }
}
