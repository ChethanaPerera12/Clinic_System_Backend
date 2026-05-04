package edu.icet.service.impl;

import edu.icet.dto.DoctorDto;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorServiceImpl implements DoctorService {
    @Override
    public List<DoctorDto> getAllDoctors() {
        return List.of();
    }

    @Override
    public boolean addDoctor(DoctorDto doctorDto) {
        return false;
    }

    @Override
    public boolean updateDoctor(DoctorDto doctorDto) {
        return false;
    }

    @Override
    public boolean deleteDoctor(Integer id) {
        return false;
    }

    @Override
    public DoctorDto searchDoctor(Integer id) {
        return null;
    }
}
