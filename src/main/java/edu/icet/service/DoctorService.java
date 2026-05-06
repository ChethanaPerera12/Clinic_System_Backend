package edu.icet.service;

import edu.icet.model.Doctors;

import java.util.List;

public interface DoctorService {
    List<Doctors> getAllDoctors();
    boolean addDoctor(Doctors doctorDto);
    boolean updateDoctor(Doctors doctorDto);
    boolean deleteDoctor(Integer id);
    Doctors searchDoctor(String id);
}
