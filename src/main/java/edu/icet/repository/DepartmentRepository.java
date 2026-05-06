package edu.icet.repository;

import edu.icet.model.Departments;

import java.util.List;

public interface DepartmentRepository {
    List<Departments> getAllDepartment();
    boolean addDepartment(Departments department);
    boolean updateDepartment(Departments department);
    boolean deleteDepartment(Integer id);
    Departments searchDepartment(String id);
}
