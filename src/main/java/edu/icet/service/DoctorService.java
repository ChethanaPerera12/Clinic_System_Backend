package edu.icet.service;

import edu.icet.model.Doctors;

import java.util.List;

public interface DoctorService {
    List<Doctors> getAllDoctors();
    boolean addDoctor(Doctors doctors);
    boolean updateDoctor(Doctors doctors);
    boolean deleteDoctor(Integer id);
    Doctors searchDoctor(String id);
}
