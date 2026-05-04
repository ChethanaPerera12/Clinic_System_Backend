package edu.icet.service;

import edu.icet.dto.DoctorDto;

import java.util.List;

public interface DoctorService {
    List<DoctorDto> getAllDoctors();
    boolean addDoctor(DoctorDto doctorDto);
    boolean updateDoctor(DoctorDto doctorDto);
    boolean deleteDoctor(Integer id);
    DoctorDto searchDoctor(Integer id);
}
